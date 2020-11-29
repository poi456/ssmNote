package com.lsm.service;

import com.lsm.pojo.Books;

import java.util.List;

public interface BookService {
    //增加
    void insert(Books books);
    //修改
    //删除
    //查找一个
    //查找全部
    List<Books> findAll();
}
