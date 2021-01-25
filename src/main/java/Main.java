import base.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/1/25 4:33 下午
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:config.xml");
        SimpleBean bean = context.getBean(SimpleBean.class);
        bean.send();
        context.close();
    }
}

