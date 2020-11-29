package com.lsm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("demo")
public class UserController {
@RequestMapping("a")
public String aa(){
    System.out.println("aa");
    return "login";
}
    @RequestMapping("b")
    public String bb(){

        System.out.println("bb");
        return "froma";
    }
    @RequestMapping("c")
    public String cc(HttpSession session,String uname,String upwd){
    session.setAttribute("sessionInfo",uname);
        System.out.println("cc");
    return "login";
    }

    @RequestMapping("d")
    public String dd(HttpSession session,String uname,String upwd){
    session.removeAttribute("sessionInfo");
        System.out.println("dd");
        return "froma";
    }
}
