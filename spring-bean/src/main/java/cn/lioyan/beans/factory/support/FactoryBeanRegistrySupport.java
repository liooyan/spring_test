package cn.lioyan.beans.factory.support;

import cn.lioyan.beans.factory.config.SingletonBeanRegistry;


/**
 * {@link org.springframework.beans.factory.support.FactoryBeanRegistrySupport} <br>
 * {@link SingletonBeanRegistry} 对 FactoryBean的支持<br>
 * <br>
 * 通过成员变量 factoryBeanObjectCache 保存所有FactoryBean 对象产生的bean对象。<br>
 * <br>
 * 我们直接注入的FactoryBean对象是在 {@link DefaultSingletonBeanRegistry} 中保存，<br>
 * 而如果FactoryBean  获取到的bean也是单例，就在这个factoryBeanObjectCache中进行保存<br>
 * <br>
 *
 * @author com.lioyan
 * @date 2023/1/31  15:52
 */
public class FactoryBeanRegistrySupport
{
}
