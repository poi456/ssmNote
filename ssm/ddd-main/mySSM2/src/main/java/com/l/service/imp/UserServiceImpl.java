package com.l.service.imp;

import com.l.dao.UserMapper;
import com.l.pojo.User;
import com.l.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userMapper")
    UserMapper mapper;
    @Override
    public List<User> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public User queryById(int id) {
        return mapper.queryById(id);
    }
}
