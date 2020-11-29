package com.lsm.controller;

import com.lsm.pojo.Books;
import com.lsm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/demo")
public class userController {
    @Autowired
//    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @RequestMapping("demo1")
    public String aa(Model model) {
        System.out.println("123");
        List<Books> all = bookService.findAll();
        System.out.println(all);
        model.addAttribute("findAll",all);
        return "test";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "sdafdsasfd";
    }
}
