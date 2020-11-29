package com.lsm.coneroller;

import com.sun.deploy.net.HttpResponse;
import com.sun.net.httpserver.HttpServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demo")
public class user {
    @RequestMapping("demo1/{a}/{b}")
    public String aa(@PathVariable int a, @PathVariable int b,Model model){
        int sum=a+b;
        model.addAttribute("model","小猪"+sum);
        return "index";
    }

//转发
    @RequestMapping("demo2")
    public String bb(Model model){
        model.addAttribute("model1","小转发");
        return "forward:/demo/demo1/1/2";
    }

//    重定向
    @RequestMapping("demo3")
    public String cc(Model model){
        model.addAttribute("model2","小重定向");
        return "redirect:/demo/demo1/1/2";
    }
}
