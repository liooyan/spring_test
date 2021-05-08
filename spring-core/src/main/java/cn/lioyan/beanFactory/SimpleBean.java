package cn.lioyan.beanFactory;

import org.springframework.stereotype.Service;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/1/25 4:58 下午
 */
@Service
public class SimpleBean {

    public void send(){
        System.out.println("I am send method from SimpleBean!");
    }
}
