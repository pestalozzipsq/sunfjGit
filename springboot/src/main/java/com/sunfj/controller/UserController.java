package com.sunfj.controller;

import com.sunfj.dao.UserMapper;
import com.sunfj.entity.JsonResult;
import com.sunfj.entity.User;
import com.sunfj.service.UserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Getter
@Setter
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/insert/{id}")
    public JsonResult insertUser(@PathVariable Long id, @RequestParam("username") String username,@RequestParam("password") String password){
        userService.isertUser(new User(id,username,password));
        // 手动抛出异常
        throw new RuntimeException();
//        return  new JsonResult<>();
    }

}
