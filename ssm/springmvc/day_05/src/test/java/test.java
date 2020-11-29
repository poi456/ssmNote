import com.lsm.dao.BookMapper;
import com.lsm.pojo.Books;
import com.lsm.service.BookService;
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
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = build.openSession();
        BookMapper mapper = session.getMapper(BookMapper.class);
        List<Books> all = mapper.findAll();
        System.out.println(all);
        session.commit();
    }
@Test
    public void bb(){
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//    System.out.println(context);

    BookService bookServiceImpl = context.getBean("BookServiceImpl", BookService.class);
    List<Books> all = bookServiceImpl.findAll();
    System.out.println(all);
}
}
