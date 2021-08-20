package boot.beanDefinitionRegistryPostProcessor.main;

import beanDefinition.test.SimpleBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/31 6:14 下午
 */

@ConditionalOnBean(SimpleBean.class)
public class EnableAutoconfigureTest {

    public EnableAutoconfigureTest() {

        System.out.println("创建测试");
    }
}
