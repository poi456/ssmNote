import com.lsm.dao.userDao;
import com.lsm.pojo.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    @Test
    public void aa() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = build.openSession(true);
        userDao mapper = session.getMapper(userDao.class);
        List<user> all = mapper.findAll();
        System.out.println(all);
    }
    @Test
    public void bb(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        userDao userDao = context.getBean("userDao", userDao.class);
        List<user> all = userDao.findAll();
        System.out.println(all);
    }

    @Test
    public void cc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        userDao userDao = context.getBean("userDao", userDao.class);
        user user =new user(2,"asd","asd");
        userDao.insert(user);
        userDao.delete(2);
//        System.out.println(all);
    }
    @Test
    public void dd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        userDao userDao = context.getBean("userDao", userDao.class);

    }
}
