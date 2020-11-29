package com.rj1814.dao;


import com.rj1814.pojo.IBlog;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(IBlog IBlog);


//    if判断查询语句
    List<IBlog> ifaddBlog(Map map);
//where
    List<IBlog> whereaddBlog(Map map);
    //通过forEach查询
    List<IBlog> ForEaddBlog(Map map);

    //choose
    List<IBlog> trsaddBlog(Map map);

    //set 修改
    int updata(Map map);


}
