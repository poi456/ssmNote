package com.lsm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
    @RequestMapping(value = "/bb", produces = "text/html;charset=UTF-8")
    public String aa(){
        System.out.println("asd");
        return "傻逼东西";
    }

    @RequestMapping(value = "/cc", produces = "text/html;charset=UTF-8")
    public String cc(String name){
        if (name.equals("admin")){
            return "成功";
        }else{
            return "失败";
        }
    }

}
