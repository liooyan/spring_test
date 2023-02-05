package cn.lioyan.boot.test;

import cn.lioyan.boot.test2.Send2;
import cn.lioyan.boot.test2.Send4;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
 * {@link Send}
 *
 * @author com.lioyan
 * @date 2023/2/1  11:11
 */
@Import(Send2.class)
@Component
public class Send
{



    public void send(){
        System.out.println(1111);
    }
}
