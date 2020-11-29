package cn.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class account {
    private String name;
    private String password;
    private String sex;
    private String phone;
    private String email;
    private String levela;
}
