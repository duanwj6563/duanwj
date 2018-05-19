package com.ybl.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

/**
 * 表中的创建人和修改人维护
 * Created by duanwj on 2018/5/4 0004 11:39
 */
@Configuration
@Slf4j
public class OperationAuditorConfig implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated()) {
            return null;
        }
        //todo 自动获取当前登录人信息
        log.info("当前审计人{}", authentication.getName());
        return Optional.of(authentication.getPrincipal().toString());
    }
}
