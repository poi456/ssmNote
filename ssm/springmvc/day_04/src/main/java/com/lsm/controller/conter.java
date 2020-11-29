package com.lsm.controller;

import com.lsm.pojo.Books;
import com.lsm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("demo")
public class conter {
    @Autowired
    private  BookService bookService;
    @RequestMapping("demo1")
    public String aa(){
        List<Books> all = bookService.findAll();
        System.out.println(all);
        return "";
    }
}
