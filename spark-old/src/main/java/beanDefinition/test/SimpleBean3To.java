package beanDefinition.test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:18 下午
 */
@Service
@Primary
public class SimpleBean3To implements SimpleBean3Sup {


    public void send(){

        System.out.println("send system");
    }

}
