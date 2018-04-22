package com.ybl.common;

import io.jsonwebtoken.*;
import io.jsonwebtoken.impl.DefaultClock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Created by duanwj on 2018/4/15 0015 10:30
 */
@Component
@Slf4j
public class JwtTokenUtil implements Serializable {
    private static final long serialVersionUID = 6309474242441282480L;
    private static final String CLAIM_KEY_USERNAME = "sub";
    private static final String CLAIM_KEY_CREATED = "created";
    private Clock clock = DefaultClock.INSTANCE;

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.expiration}")
    private Long expiration;

    @Value("${jwt.criticalTime}")
    private Long criticalTime;
    /**
     * 获取token中用户名
     *
     * @param token
     * @return
     */
    public String getUsernameFromToken(String token) {
        return getClaimFromToken(token, Claims::getSubject);
    }

    /**
     * 获取token中过期时间
     *
     * @param token
     * @return
     */
    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }

    /**
     * 获取token中创建的时间
     *
     * @param token
     * @return
     */
    public Date getIssuedAtDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getIssuedAt);
    }

    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token) {
        try {
            return Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (UnsupportedJwtException | MalformedJwtException | IllegalArgumentException | SignatureException ex) {
            //todo 全局异常捕获
            //throw new UserDefinedException(ServerStatus.TOKEN_INVALID);
            throw new BadCredentialsException("Invalid JWT token: ", ex);
        }
    }

    /**
     * 设置过期时间
     *
     * @return
     */
    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis() + expiration * 1000);
    }

    /**
     * 校验是否过期
     *
     * @param token
     * @return
     */
    private Boolean isTokenExpired(String token) {
        Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    /**
     * 创建jwtToken
     *
     * @return
     */
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME, userDetails.getUsername());
        claims.put(CLAIM_KEY_CREATED, new Date());
        return generateToken(claims);
    }

    /**
     * 签名生成
     *
     * @param claims
     * @return
     */
    String generateToken(Map<String, Object> claims) {
        final Date createdDate = clock.now();
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .setIssuedAt(createdDate)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    /**
     * 刷新token根据时间间隔
     *
     * @param token
     * @return
     */
    public String refreshToken(String token) {
        String refreshedToken = null;
        Date expiration = getExpirationDateFromToken(token);
        long time = (expiration.getTime() - new Date().getTime()) / 1000;
        if (Math.abs(time) < criticalTime) {
            log.info("【token是否过期时间间隔】{}秒", time);
            Claims claims = getAllClaimsFromToken(token);
            claims.put(CLAIM_KEY_CREATED, new Date());
            refreshedToken = generateToken(claims);
        }
        return refreshedToken;
    }

    /**
     * 校验token
     *
     * @param token
     * @param userDetails
     * @return
     */
    public Boolean validateToken(String token, UserDetails userDetails) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String username = getUsernameFromToken(token);
        Date created = getIssuedAtDateFromToken(token);
        Date expiration = getExpirationDateFromToken(token);
        log.info("【jwtToken有效期】{} ~ {}", formatter.format(created), formatter.format(expiration));
        return (
                username.equals(userDetails.getUsername())
                        && !isTokenExpired(token)
        );
    }
    //todo 未完成refreshToken
}
