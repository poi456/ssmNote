package com.l.service;

import com.l.pojo.User;

import java.util.List;

public interface UserService {
    List<User> queryAll();

    User queryById(int id);
}
