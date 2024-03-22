package com.sunfj.controller;

import com.sunfj.entity.JsonResult;
import com.sunfj.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/args")
public class ArgumentController {
    private static final Logger logger = LoggerFactory.getLogger(ArgumentController.class);
    @RequestMapping("/PathVariable/{id}")
    public JsonResult<User> test1(@PathVariable Long id){
        //long id = Long.parseLong(idString);
        User user = new User(id, "xiaohuang", "123");
        return new JsonResult<>(user);
    }

    @RequestMapping("/user")
    public String user(User user){
        logger.info(user.getPassword()+user.getUsername());
        return "1";
    }

}
