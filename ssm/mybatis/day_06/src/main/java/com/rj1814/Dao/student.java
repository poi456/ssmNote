package com.rj1814.Dao;

import com.rj1814.pojo.studentpojo;
import com.rj1814.pojo.teacherpojo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface student {
//    方法一
    public List<studentpojo> getStudent();

    public List<teacherpojo> getTeacher();

    //方法二
    public List<studentpojo> getStudent1();
}
