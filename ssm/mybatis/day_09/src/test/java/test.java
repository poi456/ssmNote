import com.rj1814.Dao.mybatisdao;
import com.rj1814.pojo.mybatisPojo;
import com.rj1814.utils.getSqlSession;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class test {
    @Test
    public void aa(){
        SqlSession sqlSession = getSqlSession.getSqlSession();
        mybatisdao mapper = sqlSession.getMapper(mybatisdao.class);
        mybatisPojo mybatisPojo = mapper.idFindAll(1);
        System.out.println(mybatisPojo);
//        sqlSession.clearCache();//手动清理缓存
//        mybatisPojo mybatisPojo2=new mybatisPojo(1,"龟儿子","女");
//        mapper.updata(mybatisPojo2);

        System.out.println("+++++++++++++++++++");
        mybatisPojo mybatisPojo1 = mapper.idFindAll(1);
        System.out.println(mybatisPojo);
        System.out.println(mybatisPojo==mybatisPojo1);
        sqlSession.close();
    }
//缓存
    @Test
    public void bb(){
        SqlSession sqlSession = getSqlSession.getSqlSession();
        SqlSession sqlSession1 = getSqlSession.getSqlSession();

        mybatisdao mapper = sqlSession.getMapper(mybatisdao.class);
        mybatisPojo mybatisPojo = mapper.idFindAll(1);
        System.out.println(mybatisPojo);
        sqlSession.close();
        mybatisdao mapper1 = sqlSession1.getMapper(mybatisdao.class);
        mybatisPojo mybatisPojo1 = mapper1.idFindAll(1);
        System.out.println(mybatisPojo1);

        System.out.println(mybatisPojo==mybatisPojo1);
        sqlSession1.close();
    }
}
