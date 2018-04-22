package com.ybl.common;

import com.ybl.domain.primary.model.JwtUser;
import com.ybl.domain.primary.model.SaleUser;

/**
 * Created by duanwj on 2018/4/15 0015 11:51
 */
public class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(SaleUser user) {
        //todo 未实现用户权限状态
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getPassword()
        );
    }
}
