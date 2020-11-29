package com.rj1814.dao;

import com.rj1814.pojo.entity;

import java.util.List;
import java.util.Map;

public interface accountDao {
    //查询
      List<entity> finAll();

    //模糊查询
    List<entity> FuzzyQuery(Map<String, Object> map);

    //增加
    void inser(Map<String, Object> map);
}
