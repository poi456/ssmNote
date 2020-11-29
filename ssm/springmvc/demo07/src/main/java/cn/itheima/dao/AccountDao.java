package cn.itheima.dao;

import cn.itheima.pojo.account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountDao {
    //    写两个方法查询跟添加
    //查询所有
    @Select("select * from user")
     List<account> findAll();
    //模糊查询
    @Select("select * from user where name like #{FuzzyQuery}")
    List<account> FuzzyQuery(String FuzzyQuery);
    //添加
    @Insert("insert into user values(#{name},#{password},#{sex},#{phone},#{email},#{levela})")
     void saveAccount(account account);

    //删除
    @Insert("delete from user where name=#{name}")
    void delete(String name);
    //修改
    @Update("update user set password=#{password} where name=#{name}")
    void updata(@Param("password") String password, @Param("name") String name);


    //通过name进行查询
    @Select("select * from user where name=#{name}")
    account IdfindAll(@Param("name") String name);

}

