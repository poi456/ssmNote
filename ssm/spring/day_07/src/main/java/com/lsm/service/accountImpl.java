package com.lsm.service;

public class accountImpl implements account {
    public void add() {
        System.out.println("执行了增加方法");
    }

    public void update() {
        System.out.println("执行了修改方法");
    }

    public void delete() {
        System.out.println("执行了删除方法");
    }

    public void findAll() {
        System.out.println("执行了查询方法");
    }
}
