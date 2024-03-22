package com.sunfj.controller;

import com.sunfj.entity.User;
import com.sunfj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/get")
    public Map getUser(){
        return userService.getUser();
    }

    @RequestMapping("/getById")
    public User getUerById(){
        return userService.getUserById("1");
    }
}
