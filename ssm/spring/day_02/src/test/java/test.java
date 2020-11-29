import com.Lsm.pojo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void aa(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        pojo namea = context.getBean("a", pojo.class);
        System.out.println(namea.getName());
    }
}
