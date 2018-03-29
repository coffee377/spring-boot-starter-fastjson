package com.voc.spring.boot.demo.controller;

import com.voc.spring.boot.demo.entity.User;
import com.voc.spring.boot.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController  {

    @Resource
    private UserService userService;

    @GetMapping("/user/{id}")
    public User list(@PathVariable Long id) {
        return userService.findById(id);
    }

}
