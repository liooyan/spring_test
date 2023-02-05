package cn.lioyan.aop.test;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;


/**
 * {@link Send}
 *
 * @author com.lioyan
 * @date 2023/2/1  11:11
 */
@Component
public class Send
{



    public void send(){
        System.out.println(1111);
    }
}
