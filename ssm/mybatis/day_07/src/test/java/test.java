import com.rj1814.Dao.teacher;
import com.rj1814.pojo.teacherpojo;
import com.rj1814.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void aa(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        teacher mapper = sqlSession.getMapper(teacher.class);

    }

    @Test
    public void bb(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        teacher mapper = sqlSession.getMapper(teacher.class);
        teacherpojo teacherpojos = mapper.gitTeacher(1);
        System.out.println(teacherpojos);
    }
}
