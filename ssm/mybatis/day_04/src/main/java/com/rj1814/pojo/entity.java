package com.rj1814.pojo;

public class entity {
    private Integer id;
    private String name;
    private int sex;
    public entity() {

    }

    public entity(Integer id, String name, int sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
