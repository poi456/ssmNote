import com.l.dao.UserMapper;
import com.l.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    @Test
    public void aa(){
       ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
//        System.out.println(context);
        SqlSessionFactory bean = context.getBean(SqlSessionFactory.class);
        SqlSession session = bean.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.queryAll();
        System.out.println(users);
    }

    @Test
    public void bb(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml");
        System.out.println(context);
    }
}
