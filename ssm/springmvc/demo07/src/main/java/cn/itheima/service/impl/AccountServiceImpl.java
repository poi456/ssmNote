package cn.itheima.service.impl;

import cn.itheima.dao.AccountDao;
import cn.itheima.pojo.account;
import cn.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountDao accountDao;

    @Override
    public List<account> findAll() {
        System.out.println("来了Service层");
        return accountDao.findAll();
    }
    @Override
    public List<account> FuzzyQuery(String FuzzyQuery) {
        System.out.println("来了Service层");
        System.out.println(accountDao.FuzzyQuery(FuzzyQuery));
        return accountDao.FuzzyQuery(FuzzyQuery);
    }


    @Override
    public void saveAccount(account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void delete(String name) {
            System.out.println("来了Service层");
//        System.out.println(accountDao. delete(id));
            accountDao.delete(name);
        }

    @Override
    public void updata(String password, String name) {
        System.out.println("来了Service层");
        accountDao.updata(password,name);
    }

    @Override
    public account IdfindAll(String name) {
        System.out.println("来了Service层");

        return accountDao.IdfindAll(name);
    }
}

