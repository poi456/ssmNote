import com.lsm.pojo.user;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void aa(){
       ApplicationContext context = new ClassPathXmlApplicationContext("applictionContext.xml");
        user user = context.getBean("user", user.class);
        user.getCat().show();
        user.getDog().show();
    }
}
