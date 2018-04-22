package com.ybl.application.service;

import com.ybl.common.JwtUserFactory;
import com.ybl.domain.primary.model.SaleUser;
import com.ybl.domain.primary.repository.SaleUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * Created by duanwj on 2018/4/15 0015 11:34
 */
@Component
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private SaleUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SaleUser user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            return JwtUserFactory.create(user);
        }
    }
}
