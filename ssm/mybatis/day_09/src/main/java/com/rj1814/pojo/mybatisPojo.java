package com.rj1814.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class mybatisPojo implements Serializable {
    private int id;
    private String name;
    private String sex;
}
