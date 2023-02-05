package cn.lioyan.boot.test2;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
 * {@link Send2}
 *
 * @author com.lioyan
 * @date 2023/2/1  11:11
 */
@Component
public class Send2
{



    public void send(){
        System.out.println(1111);
    }



}
