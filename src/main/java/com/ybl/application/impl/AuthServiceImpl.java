package com.ybl.application.impl;

import com.ybl.application.service.AuthService;
import com.ybl.common.JwtTokenUtil;
import com.ybl.domain.dto.SaleUserDto;
import com.ybl.domain.exception.ServerStatus;
import com.ybl.domain.exception.UserDefinedException;
import com.ybl.domain.primary.model.SaleUser;
import com.ybl.domain.primary.repository.SaleUserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * Created by duanwj on 2018/4/15 0015 17:22
 */
@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private SaleUserRepository saleUserRepository;
    @Autowired
    @Qualifier("jwtUserDetailsService")
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Override
    public SaleUserDto register(SaleUser saleUser) {
        SaleUserDto userDto = new SaleUserDto();
        SaleUser user = saleUserRepository.findByUsername(saleUser.getUsername());
        if (!ObjectUtils.isEmpty(user)) {
            throw new UserDefinedException(ServerStatus.NO_EXIST, "工号已经注册过了");
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        final String rawPassword = encoder.encode(saleUser.getPassword());
        saleUser.setPassword(rawPassword);
        BeanUtils.copyProperties(saleUserRepository.save(saleUser), userDto);
        return userDto;
    }

    @Override
    public String login(String username, String password) {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (BadCredentialsException e) {
            throw new UserDefinedException(ServerStatus.NO_EXIST, "用户名或密码错误");
        }
        final UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        final String token = jwtTokenUtil.generateToken(userDetails);
        return token;
    }

    @Override
    public String refresh(String oldToken) {
        return null;
    }
}
