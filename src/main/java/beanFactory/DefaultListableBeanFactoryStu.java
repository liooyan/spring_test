package beanFactory;

import beanRegistry.DefaultSingletonBeanRegistryStu;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.beans.factory.support.*;

/**
 * {@linkplain DefaultListableBeanFactory}
 * 该类主要实现了3个顶级接口分别是:
 * {@linkplain BeanDefinitionRegistry} 解析见:{@linkplain beanDefinitionRegistry.DefaultListableBeanFactoryStu}
 * {@linkplain SingletonBeanRegistry} 解析见：{@linkplain DefaultSingletonBeanRegistryStu}
 * {@linkplain BeanFactory} 本次解析重点
 * {@linkplain BeanFactory}
 * <p>
 * 继承关系
 * ｜                              {@linkplain BeanFactory}
 * ｜{@linkplain ListableBeanFactory}  {@linkplain HierarchicalBeanFactory} {@linkplain AutowireCapableBeanFactory}
 * ｜                                {@linkplain ConfigurableBeanFactory}
 * ｜                           {@linkplain ConfigurableListableBeanFactory}
 * <p>
 * <p>
 * 其他抽象类
 * {@linkplain FactoryBeanRegistrySupport}
 * {@linkplain AbstractBeanFactory}
 * {@linkplain AbstractAutowireCapableBeanFactory}
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/1 5:32 下午
 */
//TODO 目前先不解析了
public class DefaultListableBeanFactoryStu {


    //接口继承关系

    /**
     * {@linkplain BeanFactory}
     * 1、getBean的所有接口
     * 2、getBeanProvider 延迟获取bean
     * 3、是否包含bean
     * 4、单例判断
     * 5、bean类型匹配
     * 6、bean类型获取
     */
    public static class BeanFactoryStu {


    }

    /**
     * {@linkplain ListableBeanFactory}
     * 按照要求可以获取一定的bean名称
     */
    public static class ListableBeanFactoryStu {


    }


    /**
     * {@linkplain HierarchicalBeanFactory}
     * 父工厂相关定义
     */
    public static class HierarchicalBeanFactoryStu {


    }



    // 抽象类解析

    /**
     * {@linkplain FactoryBeanRegistrySupport}
     *
     * 添加 {@linkplain FactoryBean}的 注册。
     * {@linkplain FactoryBeanRegistrySupport.factoryBeanObjectCache}
     */
    public static class FactoryBeanRegistrySupportStu{

    }


}
