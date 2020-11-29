import com.rj1814.Dao.student;
import com.rj1814.Dao.teacher;
import com.rj1814.pojo.studentpojo;
import com.rj1814.pojo.teacherpojo;
import com.rj1814.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void a(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        teacher mapper = sqlSession.getMapper(teacher.class);
        teacherpojo teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }
    @Test
    public void b(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        student mapper = sqlSession.getMapper(student.class);
        List<studentpojo> teacherpojos = mapper.getStudent();
        System.out.println(teacherpojos);
    }
    @Test
    public void c(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        student mapper = sqlSession.getMapper(student.class);
        List<studentpojo> teacherpojos = mapper.getStudent1();
        System.out.println(teacherpojos);
    }
}
