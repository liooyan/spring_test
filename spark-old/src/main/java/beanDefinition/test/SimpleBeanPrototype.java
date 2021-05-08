package beanDefinition.test;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:18 下午
 */
@Service
@Scope("prototype")
@Lazy
@DependsOn("simpleBean2")
public class SimpleBeanPrototype {


    public void send(){

        System.out.println("send system");
    }


}
