package com.l.controller;

import com.l.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping(value = "/queryAll", produces = "text/html;charset=UTF-8")
    @ResponseBody()
    public String queryAll(){
        return service.queryAll().toString() + "这是一条测试数据";
    }

    @GetMapping(value = "/query/{id}", produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String queryById(@PathVariable int id){
        return service.queryById(id).toString();
    }
}
