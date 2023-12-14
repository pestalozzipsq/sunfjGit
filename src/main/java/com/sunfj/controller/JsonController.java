package com.sunfj.controller;

import com.sunfj.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class JsonController {
    @RequestMapping("/user")
    public User user(){
        return new User(1L,"xingming","123");
    }

    @RequestMapping("/list")
    public List<User> list(){

//        List<User> list = new ArrayList<>();
//        list.add(new User(1L,"xiaohong","123456"));
//        list.add(new User(2L,"xiaobai","654321"));
        return null;
    }

    @RequestMapping("/map")
    public Map<String,Object> map(){
        Map<String,Object> map = new HashMap<>();
        map.put("aaa", "111");
        map.put("user",new User(1L,"xiaohei","123"));
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("name","xiaolan");
        map.put("map",stringStringHashMap);
        return map;
    }
    @RequestMapping("/null")
    public Object nullTest(){

        return new User(2L,"xiaozi",null);
    }

}
