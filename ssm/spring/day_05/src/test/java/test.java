import com.lsm.pojo.user;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void aa(){
       ApplicationContext context = new ClassPathXmlApplicationContext("applecationContext.xml");
        user user = context.getBean("user", user.class);
        System.out.println(user);
    }
}
