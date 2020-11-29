package com.lsm.dao;

import com.lsm.pojo.Books;

import java.util.List;

public interface BookMapper {
    //增加一本书
    void add(Books books);
    //删除一本书
    void delete(int id);
    //修改一本书
    void updata (Books books);
    //查询一本书
    Books IdfindAll(int id);
    //查询所有的书
    List<Books> findAll();
}
