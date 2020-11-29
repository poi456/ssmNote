package com.lsm.service.impl;

import com.lsm.dao.userDao;
import com.lsm.pojo.user;
import com.lsm.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class serviceImpl implements service {
    @Autowired
   private userDao userDao;
    @Override
    public List<user> findAll() {
        return userDao.findAll();
    }
}
