import com.rj1814.dao.accountDao;
import com.rj1814.pojo.entity;
import com.rj1814.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {
    private  Logger logger = Logger.getLogger(test.class);
    @Test
    public void finAll(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        accountDao mapper = sqlSession.getMapper(accountDao.class);
        logger.info("finAll()执行了");
        List<entity> entities = mapper.finAll();
        System.out.println(entities);
    }

    @Test
    public void insert(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        accountDao mapper = sqlSession.getMapper(accountDao.class);
        logger.info("finAll()执行了");
        entity entity = new entity(4, "小兰", 18);
        mapper.insert(entity);
//        sqlSession.commit();
    }
}
