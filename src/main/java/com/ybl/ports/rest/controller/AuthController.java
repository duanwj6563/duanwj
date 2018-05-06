package com.ybl.ports.rest.controller;

import com.ybl.application.service.AuthService;
import com.ybl.common.AssertUtil;
import com.ybl.common.ResultUtil;
import com.ybl.domain.primary.model.Result;
import com.ybl.domain.primary.model.SaleUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * 登录注册控制层
 */
@RestController
@RequestMapping("auth")
@Api(description = "登陆注册")
public class AuthController {
    @Autowired
    private AuthService authService;

    @ApiOperation(value = "注册接口")
    @PostMapping("/register")
    public Result register(@Valid @RequestBody SaleUser saleUser, BindingResult bindingResult) {
        AssertUtil.bindingResult(bindingResult);
        return ResultUtil.success(authService.register(saleUser));
    }

    @ApiOperation("登录接口")
    @PostMapping("/login")
    public Result<String> login(@Valid @RequestBody SaleUser saleUser, BindingResult bindingResult) {
        AssertUtil.bindingResult(bindingResult);
        String token = authService.login(saleUser.getUsername(), saleUser.getPassword());
        return ResultUtil.success(token);
    }

    //忘记密码
}
