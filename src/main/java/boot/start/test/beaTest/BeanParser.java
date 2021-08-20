package boot.start.test.beaTest;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

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
//    @ConditionalOnBean(WordTest.class)
    public BeanOnBeanTest beanOnBeanTest(){
        return new BeanOnBeanTest();
    }



    public static class  BeanOnBeanTest{



    }
}
