package boot.applicationListener.test;

import org.springframework.stereotype.Service;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:18 下午
 */
@Service
public class SimpleBean {

    private SimpleBean2 simpleBean;

    public SimpleBean(SimpleBean2 simpleBean) {
        this.simpleBean = simpleBean;
    }

    public void send() {
        simpleBean.send();
        System.out.println("send system");
    }
}
