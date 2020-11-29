package com.lsm.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lsm.pojo.user;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
//@RestController   以下的所有方法不会走视图解析器 返回一个字符串
public class UserController {

    @RequestMapping("demo")
    @ResponseBody//不会走视图解析器  直接返回一个字符串
    public String aa(){
        user user=new user(1,"龟儿子",12);
        return user.toString();
}
    @RequestMapping("demo2")
    @ResponseBody//不会走视图解析器  直接返回一个字符串
    public String bb() throws JsonProcessingException {
        user user=new user(1,"龟儿子",12);
        //返回json一样的字符串   json是一种格式字符串拼接的也行
        ObjectMapper mapper=new ObjectMapper();
        String s = mapper.writeValueAsString(user);//该方法直接返返回一个json一样的字符串
        return s;
    }


    @RequestMapping("demo3")
    @ResponseBody//不会走视图解析器  直接返回一个字符串    date时间
    public String cc() throws JsonProcessingException {
        ObjectMapper mapper=new ObjectMapper();
        SimpleDateFormat sdb=new SimpleDateFormat("yyy-MM-dd HH:mm:ss");

        return mapper.writeValueAsString(sdb.format(new Date()));
    }
}
