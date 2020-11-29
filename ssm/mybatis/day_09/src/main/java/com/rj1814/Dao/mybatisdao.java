package com.rj1814.Dao;

import com.rj1814.pojo.mybatisPojo;

public interface mybatisdao {
    mybatisPojo idFindAll(int id);


    //修改
    int updata(mybatisPojo mybatisPojo);
}
