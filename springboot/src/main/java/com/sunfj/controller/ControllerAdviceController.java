package com.sunfj.controller;

import com.sunfj.entity.JsonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exception")
@Slf4j
public class ControllerAdviceController {
    @PostMapping("/test")
    public JsonResult test(@RequestParam("name") String name,
                           @RequestParam("pass") String pass) {
        log.info("name：{}", name);
        log.info("pass：{}", pass);
        return new JsonResult();
    }

    @RequestMapping("/null")
    public JsonResult testNuLL(){
        Object o= null;
        o.toString();
        return new JsonResult();
    }
}
