package boot.aop.test;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:18 下午
 */
@Component
public class SimpleBean2 {

    @Bean
    public String send(Map<String,SimpleBean> maps){

        System.out.println(maps);
        return "asda";
    }
}
