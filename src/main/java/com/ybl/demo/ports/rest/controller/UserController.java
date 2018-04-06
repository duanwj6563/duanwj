package com.ybl.demo.ports.rest.controller;

import com.ybl.demo.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("users")
public class UserController {
    @GetMapping(value = "/hello")
    public User hello() {
        User user = new User();
        user.setAge(23);
        user.setBrithday(new Date());
        user.setName("007");
        return user;
    }
}
