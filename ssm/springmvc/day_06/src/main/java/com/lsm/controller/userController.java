package com.lsm.controller;

import com.lsm.pojo.User;
import com.lsm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("demo")
public class userController {
    @Autowired
    private UserService userService;
    @RequestMapping("demo1")
    @ResponseBody
    public String aa(){
        System.out.println("龟儿子");
        List<User> all = userService.findAll();
        System.out.println(all);
        return "test";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "sdafdsasfd";
    }
}
