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
    public void log4j(){
        logger.info("info   log4j()");
        logger.debug("debug   log4j()");
        logger.error("error log4j()");
    }

    @Test
    public void a(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        accountDao mapper = sqlSession.getMapper(accountDao.class);
        logger.info("finAll()执行了");
        Map<String,Object> map=new HashMap<>();
        map.put("begin",0);
        map.put("end",1);
        List<entity> limin = mapper.limin(map);

        System.out.println(limin);
    }
}
