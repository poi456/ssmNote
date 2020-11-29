package com.lsm.service;

import com.lsm.dao.BookMapper;
import com.lsm.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

public class BookServiceImpl implements BookService {
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public void insert(Books books) {

    }

    @Override
    public List<Books> findAll() {
        System.out.println("来到了services");

        return bookMapper.findAll();
    }
}
