package com.sunfj.controller;

import com.sunfj.config.ServerConfig;
import com.sunfj.entity.User;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
@Getter
@Setter
public class UserController {
    @Autowired
    private ServerConfig serverConfig;
    @RequestMapping("/get")
    public User getUser(){
        Integer port = serverConfig.getPort();
        log.info("================="+port+"=====================");
        return new User("1","xiaohei","123456");
    }
}
