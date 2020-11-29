package com.lsm.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class user {
    private String name;
    @Autowired
    @Qualifier(value = "cat111")
    private cat cat;
    @Autowired
    private dog dog;

    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.lsm.pojo.cat getCat() {
        return cat;
    }

    public void setCat(com.lsm.pojo.cat cat) {
        this.cat = cat;
    }

    public com.lsm.pojo.dog getDog() {
        return dog;
    }

    public void setDog(com.lsm.pojo.dog dog) {
        this.dog = dog;
    }
}
