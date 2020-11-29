package com.lsm.service.impl;

import com.lsm.dao.BookMapper;
import com.lsm.pojo.Books;
import com.lsm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class BookServicesImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;


    @Override
    public void add(Books books) {
         bookMapper.add(books);
    }

    @Override
    public void delete(int id) {
        bookMapper.delete(id);
    }

    @Override
    public void updata(Books books) {
        bookMapper.updata(books);
    }

    @Override
    public Books IdfindAll(int id) {
        return bookMapper.IdfindAll(id);
    }

    @Override
    public List<Books> findAll() {
        return bookMapper.findAll();
    }

}
