import cn.itheima.dao.AccountDao;
import cn.itheima.pojo.account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class test {

    @Test
    public  void select() throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao mapper = session.getMapper(AccountDao.class);
        List<account> all = mapper.findAll();
        System.out.println(all);
        session.close();
        in.close();
    }

    @Test
    public  void dda() throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao mapper = session.getMapper(AccountDao.class);
        List<account> accounts = mapper.FuzzyQuery("%a%");
        System.out.println(accounts);
        session.close();
        in.close();
    }

    @Test
    public  void bb() throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao mapper = session.getMapper(AccountDao.class);
//      name=root, password=123, sex=男, phone=12345678911, email=123@qq.com, levela=管理员
        account account=new account("admin","123","男","12345632111","123456@qq.com","员工");
        mapper.saveAccount(account);
        session.commit();
    }

    @Test
    public  void cc() throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao mapper = session.getMapper(AccountDao.class);
        account account=new account("admin","456","男","12345632111","123456@qq.com","员工");
//        mapper.saveAccount(account);
        mapper.updata(account.getPassword(),account.getName());
        session.commit();
    }

    @Test
    public  void dd() throws Exception {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();
        AccountDao mapper = session.getMapper(AccountDao.class);
        account account=new account("admin","456","男","12345632111","123456@qq.com","员工");
//        mapper.saveAccount(account);
        mapper.delete("admin");
        session.commit();
    }
}
