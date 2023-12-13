package com.sunfj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "a-test";
    }
}
