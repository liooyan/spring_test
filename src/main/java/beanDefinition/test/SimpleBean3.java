package beanDefinition.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:18 下午
 */
@Service
public class SimpleBean3 implements SimpleBean3Sup {


    public void send(){

        System.out.println("send system");
    }

}
