package com.rj1814.Dao;

import com.rj1814.pojo.teacherpojo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface teacher {
    teacherpojo gitTeacher(@Param("tid") int tid);
}
