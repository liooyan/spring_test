package beanFactory.test.construct;

import beanFactory.test.beaTest.BeanParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/5/8 11:46 上午
 */
@Component
public class NotAutoWireTest {

    public NotAutoWireTest() {

    }

    public NotAutoWireTest(BeanParser beanParser) {
    }

}
