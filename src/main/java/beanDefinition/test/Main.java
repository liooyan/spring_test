package beanDefinition.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:17 下午
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        final SimpleBean bean = run.getBean(SimpleBean.class);
        final SimpleBean2 bean2 = run.getBean(SimpleBean2.class);
        final SimpleBeanPrototype simpleBeanPrototype = run.getBean(SimpleBeanPrototype.class);
        final SimpleBeanPrototype simpleBeanPrototype2 = run.getBean(SimpleBeanPrototype.class);

        final Object factoryBeanTest = run.getBean("factoryBeanTest");
        final Object factoryBeanTest2 = run.getBean("factoryBeanTest");
        final ConstructorTest constructorTest = run.getBean(ConstructorTest.class);


        bean.send();
    }
}
