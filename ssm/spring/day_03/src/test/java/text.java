import com.lsm.pojo.Account;
        import com.lsm.pojo.student;
        import org.junit.Test;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class text {
    @Test
    public void aa(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplictionContext.xml");
        student student = context.getBean("student", student.class);
        System.out.println(student.toString());
    }

    @Test
    public void bb(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplictionContext.xml");
        student student = context.getBean("student", student.class);
        System.out.println(student.toString());
    }
}
