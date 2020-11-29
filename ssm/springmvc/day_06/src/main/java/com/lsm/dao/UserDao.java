package com.lsm.dao;

import com.lsm.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
    //查询方法
    List<User> findAll();
}
