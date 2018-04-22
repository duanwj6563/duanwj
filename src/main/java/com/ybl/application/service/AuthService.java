package com.ybl.application.service;

import com.ybl.domain.dto.SaleUserDto;
import com.ybl.domain.primary.model.SaleUser;

/**
 * Created by duanwj on 2018/4/15 0015 17:20
 */

public interface AuthService {
    SaleUserDto register(SaleUser userToAdd);

    String login(String username, String password);

    String refresh(String oldToken);
}
