package boot.applicationListener.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:18 下午
 */
@Service
public class SimpleBean2 {

    @Autowired
    private SimpleBean simpleBean;


    public void send() {
        System.out.println(simpleBean);
        System.out.println("send system");
    }
}
