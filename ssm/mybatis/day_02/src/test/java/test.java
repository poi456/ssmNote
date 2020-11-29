import com.rj1814.dao.accountDao;
import com.rj1814.pojo.entity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

    @Test
    public void finAll() throws IOException {
        //获取配置文件路径 通过io流读取
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = build.openSession();
        accountDao mapper = session.getMapper(accountDao.class);
        List<entity> entities = mapper.finAll();
        System.out.println(entities);
    }
    @Test
    public void insert() throws IOException {
        //获取配置文件路径 通过io流读取
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = build.openSession();
        accountDao mapper = session.getMapper(accountDao.class);
        Map<String,Object> map=new HashMap<String,Object>();
       map.put("name","小");
        map.put("age", 12);

        mapper.inser(map);
       session.commit();
    }
    @Test
    public void a() throws IOException {
        //获取配置文件路径 通过io流读取
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = build.openSession();
        accountDao mapper = session.getMapper(accountDao.class);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("value","%小%");
        List<entity> entities = mapper.FuzzyQuery(map);
        System.out.println(entities);
    }
}
