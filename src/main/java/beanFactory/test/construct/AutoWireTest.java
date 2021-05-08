package beanFactory.test.construct;

import beanFactory.test.beaTest.BeanParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/5/8 11:43 上午
 */
@Component
public class AutoWireTest {

    public AutoWireTest() {

    }

    @Autowired
    public AutoWireTest(BeanParser beanParser) {
    }

}
