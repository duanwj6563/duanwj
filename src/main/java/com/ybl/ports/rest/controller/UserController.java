package com.ybl.ports.rest.controller;

import com.ybl.domain.User;
import com.ybl.domain.repository.UserRepository;
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
    @GetMapping
    public List<User> hello() {
        return userRepository.findAll();
    }
}
