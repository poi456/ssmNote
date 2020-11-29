package com.lsm.service.impl;

import com.lsm.dao.UserDao;
import com.lsm.pojo.User;
import com.lsm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
//    @Qualifier("userDao")
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> findAll() {
        System.out.println("龟儿子");
        return userDao.findAll();
    }
}
