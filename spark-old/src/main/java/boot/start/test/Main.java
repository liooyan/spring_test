package boot.start.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/1/25 4:33 下午
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(Main.class, "--liyan=1231");
        Object bean2 = context.getBean("beanOnBeanTest");
        System.out.println(bean2);
        context.close();
    }
//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:config-depends.xml");
//        SimpleBean bean = context.getBean(SimpleBean.class);
//        Object bean2 = context.getBean("beanOnBeanTest");
//        System.out.println(bean2);
//        bean.send();
//        context.close();
//    }
}

