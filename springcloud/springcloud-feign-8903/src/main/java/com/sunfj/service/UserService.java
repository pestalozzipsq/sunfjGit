package com.sunfj.service;

import com.sunfj.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient("eureka-client")
public interface UserService {
    @RequestMapping("/user/get")
    Map getUser();

    @RequestMapping("/user/getById/{userId}")
    User getUserById(@PathVariable(value = "userId") String id);
}
