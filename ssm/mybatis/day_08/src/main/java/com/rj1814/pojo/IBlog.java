package com.rj1814.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class IBlog {
    private String id;
    private String title;
    private String author;
    private Date create_time;
    private int views;


}
