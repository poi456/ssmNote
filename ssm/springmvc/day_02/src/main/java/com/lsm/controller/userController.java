package com.lsm.controller;

import com.lsm.dao.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("demo")
public class userController {
    @RequestMapping(value = "demo1",method = RequestMethod.GET)
    public String aa(@RequestParam("name") String name, Model model){
        System.out.println(name);
        model.addAttribute("model",name);
        return "index";
    }
    @RequestMapping("demo3")
    public String cc(){
        System.out.println();
        return "index";
    }
    @RequestMapping("demo2")
    public String bb(user user){
        System.out.println(user);
        return "index";
    }
}
