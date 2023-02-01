package cn.lioyan.beans.test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


/**
 * {@link Sends}
 *
 * @author com.lioyan
 * @date 2023/2/1  11:11
 */
@Service
public class Sends extends AbSend
{



    public void send(){
        System.out.println(1111);
    }
}
