package com.rj1814.pojo;

import lombok.Data;

import java.util.List;

@Data
public class teacherpojo {
    private int id;
    private String name;
    private List<studentpojo> student;
}
