package cn.lioyan.boot.test2;

import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;


/**
 * {@link Send2}
 *
 * @author com.lioyan
 * @date 2023/2/1  11:11
 */
public class Send2
{



    public void send(){
        System.out.println(1111);
    }


    @Bean
    public Send3 lala(Environment environment){
        System.out.println(environment);
        return new Send3();
}
}
