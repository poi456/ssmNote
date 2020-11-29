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

public class text {
    @Test
    public void aa() throws IOException {
        //读取配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = build.openSession(true);
        BookMapper mapper = session.getMapper(BookMapper.class);
//        查询全部
        List<Books> all = mapper.findAll();
        System.out.println(all);

        session.close();
    }
@Test
public void cc(){
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    BookService bookServicesImpl = context.getBean("BookServicesImpl", BookService.class);
    List<Books> all = bookServicesImpl.findAll();
    System.out.println(all);
}
    @Test
    public void bb() throws IOException {
        //读取配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = build.openSession(true);
        BookMapper mapper = session.getMapper(BookMapper.class);
//      修改
        Books a=new Books(0,"asd",56,"asd");
        mapper.updata(a);
        session.commit();
        session.close();
    }
}
