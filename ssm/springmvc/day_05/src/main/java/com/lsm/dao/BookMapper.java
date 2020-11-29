package com.lsm.dao;

import com.lsm.pojo.Books;

import java.util.List;

public interface BookMapper {
    //增加
    void insert(Books books);
    //修改
    //删除
    //查找一个
    //查找全部
    List<Books> findAll();
}
