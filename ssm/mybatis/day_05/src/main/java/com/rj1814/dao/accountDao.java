package com.rj1814.dao;

import com.rj1814.pojo.entity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface accountDao {
    //查询
    @Select("select * from ssm.mybatis")
      List<entity> finAll();
    @Insert("insert into ssm.mybatis values(#{id},#{name},#{sex})")
    void insert(entity entity);
}
