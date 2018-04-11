package com.ybl.ports.rest.controller;

import com.ybl.domain.primary.model.User;
import com.ybl.domain.primary.repository.UserRepository;
import com.ybl.domain.secondary.model.Users;
import com.ybl.domain.secondary.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UsersRepository usersRepository;

    @GetMapping(value = "/user")
    public List<User> hello() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/users")
    public List<Users> users() {
        return usersRepository.findAll();
    }
}
