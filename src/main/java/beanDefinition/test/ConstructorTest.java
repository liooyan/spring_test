package beanDefinition.test;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 *
 * 构造函数注入参数
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/24 5:54 下午
 */
@Service
public class ConstructorTest {


    private  SimpleBean simpleBean;
    private SimpleBean2 simpleBean2;

    public ConstructorTest(SimpleBean simpleBean, SimpleBean2 simpleBean2) {
        this.simpleBean = simpleBean;
        this.simpleBean2 = simpleBean2;
    }

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }

    public void setSimpleBean(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }

    public SimpleBean2 getSimpleBean2() {
        return simpleBean2;
    }

    public void setSimpleBean2(SimpleBean2 simpleBean2) {
        this.simpleBean2 = simpleBean2;
    }

    @PostConstruct
    private void test(){
        System.out.println("11111111---");
    }
}
