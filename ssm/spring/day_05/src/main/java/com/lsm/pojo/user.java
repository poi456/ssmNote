package com.lsm.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//相当于<bean id="user" class="com.lsm.pojo.user"/>
@Component

public class user {
   //直接注入值
    private String name;
    @Value("小鬼")
    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                '}';
    }
}
