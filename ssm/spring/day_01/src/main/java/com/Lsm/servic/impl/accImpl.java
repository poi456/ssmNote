package com.Lsm.servic.impl;

import com.Lsm.servic.acc;

public class accImpl implements acc {
    private accountImpl account;

    public void setAccount(accountImpl account) {
        this.account = account;
    }

    @Override
    public void aa() {
        System.out.println(account);
        System.out.println("其实是我在第一层");
    }
}
