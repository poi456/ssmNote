import com.lsm.service.account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void aa(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        account account = (account)context.getBean("account");
        account.add();
    }
}
