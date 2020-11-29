import com.Lsm.pojo.Hello;
import com.Lsm.servic.impl.accImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
@Test
    public void aa(){
    ApplicationContext context  = new ClassPathXmlApplicationContext("bean.xml");
    Hello hello = context.getBean("hello", Hello.class);
    System.out.println(hello);
}

    @Test
    public void bb(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("bean.xml");
        accImpl hello = context.getBean("acc", accImpl.class);
        hello.aa();
        System.out.println(hello);
    }


}
