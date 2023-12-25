package com.sunfj.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
@Getter
@Setter
@Slf4j
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/get")
    public String  getUser(){
        String forObject = restTemplate.getForObject("http://EUREKA-CLIENT/user/get", String.class);
        log.info(forObject);
        return forObject;
    }
}
