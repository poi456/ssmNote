package com.lsm.pojo;

import java.util.*;

public class student {
    private String name;
    private Account account;
    private String[] books;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;
    private String wife;
    private Properties info;

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", account=" + account +
                ", books=" + Arrays.toString(books) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", wife='" + wife + '\'' +
                ", info=" + info +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }
}
