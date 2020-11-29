package com.lsm.dao;

import com.lsm.pojo.user;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface userDao {
    public List<user> findAll();
    //添加
    void insert(user user);

    void delete(int id);
}
