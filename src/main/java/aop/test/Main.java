package aop.test;

import base.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/1/25 4:33 下午
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:config-aop.xml");
        Child bean = context.getBean(Child.class);
        bean.eat();
        context.close();
    }
}

