package com.l.dao;

import com.l.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> queryAll();

    User queryById(@Param("id") int id);
}
