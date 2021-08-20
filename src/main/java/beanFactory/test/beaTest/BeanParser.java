package beanFactory.test.beaTest;

import beanFactory.WordTest;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 *
 * 关于bean 的一些解析
 * @author top.lioyan
 * @version 1.0
 * @date 2021/4/4 6:22 下午
 */
@Component
public class BeanParser {

    @Bean
    public BeanOnBeanTest beanOnBeanTest(){
        return new BeanOnBeanTest();
    }



    public static class  BeanOnBeanTest{

    }
}
