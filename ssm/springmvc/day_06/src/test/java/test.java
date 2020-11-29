import com.lsm.dao.UserDao;
import com.lsm.pojo.User;
import com.lsm.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    @Test
    public void aa(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        SqlSessionFactory bean = context.getBean(SqlSessionFactory.class);
        SqlSession session = bean.openSession();
        UserDao mapper = session.getMapper(UserDao.class);
        System.out.println(mapper.findAll());
    }

    @Test
    public void bb(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        UserService userService = context.getBean("UserServiceImpl", UserService.class);
//        List<User> all = userService.findAll();
//        System.out.println(all);
    }
}
