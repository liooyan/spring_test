package cn.lioyan.boot.test;

import cn.lioyan.boot.test2.Send2;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;


/**
 * {@link Send}
 *
 * @author com.lioyan
 * @date 2023/2/1  11:11
 */
@Service
@Import(Send2.class)
public class Send
{



    public void send(){
        System.out.println(1111);
    }
}
