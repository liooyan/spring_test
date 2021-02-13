package boot.applicationEvent.test;

import org.springframework.stereotype.Service;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:18 下午
 */
@Service
public class SimpleBean {


    public void send(){

        System.out.println("send system");
    }
}
