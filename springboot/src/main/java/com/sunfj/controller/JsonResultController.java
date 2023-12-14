package com.sunfj.controller;

import com.sunfj.entity.JsonResult;
import com.sunfj.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jsonr")
public class JsonResultController {
    @RequestMapping("/user")
    public JsonResult<User> user(){
        User user = new User(1L,"XIAOLAN","123456");
        return  new JsonResult<>(user);
    }
}
