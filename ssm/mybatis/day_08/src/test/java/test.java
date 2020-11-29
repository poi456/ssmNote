import com.rj1814.dao.BlogMapper;
import com.rj1814.pojo.IBlog;
import com.rj1814.utils.IDutils;
import com.rj1814.utils.getSqlSession;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class test {
    @Test
    public void add() {
        SqlSession sqlSession = getSqlSession.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        IBlog ib = new IBlog();
        ib.setId(IDutils.getId());
        ib.setTitle("mybatis如此简单");
        ib.setAuthor("先网易");
        ib.setCreate_time(new Date());
        ib.setViews(99);
        System.out.println(mapper.addBlog(ib));
        sqlSession.commit();
    }
    @Test
    public void IfSelect(){
        SqlSession sqlSession = getSqlSession.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","mybatis如此简单");
//        map.put("views","99");
        List<IBlog> iBlogs = mapper.ifaddBlog(map);
        for (IBlog iBlog : iBlogs) {
            System.out.println(iBlog);
        }

    }

    @Test
    public void whereSelect(){
        SqlSession sqlSession = getSqlSession.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("views","99");
        map.put("title","mybatis如此简单");

        List<IBlog> iBlogs = mapper.whereaddBlog(map);
        for (IBlog iBlog : iBlogs) {
            System.out.println(iBlog);
        }

    }

    @Test
    public void weSelect(){
        SqlSession sqlSession = getSqlSession.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("views","99");
        map.put("title","mybatis如此简单");
        map.put("author","先网易");
        List<IBlog> iBlogs = mapper.trsaddBlog(map);
        for (IBlog iBlog : iBlogs) {
            System.out.println(iBlog);
        }

    }


    @Test
    public void set(){
        SqlSession sqlSession = getSqlSession.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("id","73324adca4894311a5f59a39c92bf791");
        map.put("title","mybatis如此简单");
        map.put("views",123);
//        map.put("author","网易云盘");
       mapper.updata(map);


    }

    @Test
    public void forEach(){
        SqlSession sqlSession = getSqlSession.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        map.put("list",list);
        List<IBlog> iBlogs = mapper.ForEaddBlog(map);
        System.out.println(iBlogs);
    }
}
