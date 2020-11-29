package cn.itheima.service;

import cn.itheima.pojo.account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountService {
    //查询所有
    public List<account> findAll();
    //模糊查询
    public List<account> FuzzyQuery(String FuzzyQuery);
    //添加
    public void saveAccount(account account);
    //删除
    public void delete(String name);

    //删除
    public void updata(String password, String name);

    public account IdfindAll(String name);
}
