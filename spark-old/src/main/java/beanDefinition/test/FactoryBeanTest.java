package beanDefinition.test;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Role;
import org.springframework.stereotype.Service;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/24 5:37 下午
 */
@Service
@Role(2)
@Description("这是一段描述")
public class FactoryBeanTest implements FactoryBean {


    @Override
    public Object getObject() throws Exception {
        return new FactoryBeanS();
    }

    @Override
    public Class<?> getObjectType() {
        return FactoryBeanS.class;
    }

    public class FactoryBeanS{}
}
