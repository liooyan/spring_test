package boot.beanDefinitionRegistryPostProcessor.test;

import javax.annotation.ManagedBean;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:18 下午
 */
@ManagedBean
public class SimpleBeanManaged {


    public void send(){

        System.out.println("send SimpleBeanManaged");
    }
}
