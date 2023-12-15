package com.sunfj.controller;

import com.sunfj.entity.Blogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
@RequestMapping("/thymeleaf")
public class ThymeleafController {
    @GetMapping("/get")
    public String getBlogger(Model model) {
        Blogger blogger = new Blogger(1L, "测试", "123456");
        model.addAttribute("blogger", blogger);
        return "blogger";
    }

    @GetMapping("/getList")
    public String getList(Model model) {
        Blogger blogger1 = new Blogger(1L, "测试", "123456");
        Blogger blogger2 = new Blogger(2L, "测试课", "123456");
        List<Blogger> list = new ArrayList<>();
        list.add(blogger1);
        list.add(blogger2);
        model.addAttribute("list", list);
        return "list";
    }
}
