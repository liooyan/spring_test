package beanFactory;

import beanRegistry.DefaultSingletonBeanRegistryStu;
import org.springframework.beans.factory.*;
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
     * <p>
     * 添加 {@linkplain FactoryBean}的 注册。
     * {@linkplain FactoryBeanRegistrySupport.factoryBeanObjectCache}
     */
    public static class FactoryBeanRegistrySupportStu {

    }


    /**
     * 解析 {@linkplain AbstractBeanFactory}
     * 父类已经实现的有：
     * 1、单例的存储
     * 2、factoryBean的存储
     * 3、别名的识别
     * <p>
     * 本类主要实现的方法：
     * 1、 关于BeanFactory 的实现
     * 2、 关于父BeanFactory的实现
     * 3、关于{@linkplain ConfigurableListableBeanFactory}的实现
     * <p>
     * 方法：
     * getBean
     * 没有 <T> T getBean(Class<T> requiredType) throws BeansException; 的实现，其他都有
     * 最后都是通过 doGetBean 实现。具体见：{@linkplain AbstractBeanFactoryStu#doGetBean()}
     */
    //TODO ConfigurableListableBeanFactory 实现看不懂，需要在调用的地方查看
    public static class AbstractBeanFactoryStu {
        /**
         * {@linkplain AbstractBeanFactory#doGetBean(String, Class, Object[], boolean)}
         * String name   bean的名称
         * Class<T> requiredType 返回bean的类型
         * Object[] args bean需要的参数
         * boolean typeCheckOnly 是否检测
         * <p>
         * 1、获取真实的bean 名称 ：（1）去除 & ，转换别名
         * 2、调用 getSingleton 。尝试获取bean对象。 {@linkplain DefaultSingletonBeanRegistry#getSingleton(String)}
         * 2.1 可以获取到bean 时，调用getObjectForBeanInstance 解析见：{@linkplain AbstractBeanFactoryStu#getObjectForBeanInstance()}
         * 3、通过 {@linkplain AbstractBeanFactory#isPrototypeCurrentlyInCreation(String)} 判断bean 是否真正创建。应该是构造函数的循环依赖判断
         * 4、去父beanFacory尝试获取，详细不解析了
         * 5、合并bean的父定义。生成新的完整bean定义。继续见：{@linkplain AbstractBeanFactoryStu#getMergedBeanDefinition()}
         * 6、优先初始化依赖bean //@DependsOn 与 xml中的depends-on 属性。具体见：{@linkplain beanFactory.test.Main}
         * 7、分3种不同情况
         * 7.1 单例：
         * 7.2 多例：
         * 7.3 当前线程：
         * 所有情况都是通过抽象类创建对象：protected abstract Object createBean(String beanName, RootBeanDefinition mbd, @Nullable Object[] args)
         * 单例时，将其添加到{@linkplain DefaultSingletonBeanRegistry#getSingleton(String, ObjectFactory)}
         * 多例不保存
         * 当前线程，保存在当前线程的map中。
         * 最后都调用：{@linkplain AbstractBeanFactoryStu#getObjectForBeanInstance()} 方法转换bean；
         * <p>
         * <p>
         * <p>
         * 该方法 实现了getbean的方法。但将bean 的创建过程流给了子类进行实现。
         */
        public void doGetBean() {

        }


        /**
         * {@linkplain AbstractBeanFactory#getObjectForBeanInstance(Object, String, String, RootBeanDefinition)}
         * Object beanInstance bean对象
         * String name  可能包含 & 的name
         * String beanName  真实的bean 名称
         *
         * @Nullable RootBeanDefinition mbd bean定义
         * <p>
         * 1、判断是否以 & 开头。如果是 FactoryBean 子类，直接返回，也就是 &取出来的是bean工厂
         * 2、如果不是以 & 开头，不是 FactoryBean 子类，直接返回。
         * 3、调用{@linkplain FactoryBeanRegistrySupport#getCachedObjectForFactoryBean(String)} 获取缓存的 真实bean
         * 获取不到时{@linkplain FactoryBeanRegistrySupport#getObjectFromFactoryBean(FactoryBean, String, boolean)}调用getBean获取真实bean。
         * <p>
         * <p>
         * 也就是说：
         * 1、FactoryBean 的单例对象和其他bean一样保存在一起。
         * 2、FactoryBean 的getBean的真实bean 是保存在{@linkplain FactoryBeanRegistrySupport} 中
         */
        public void getObjectForBeanInstance() {

        }

        /**
         * https://blog.csdn.net/andy_zhang2007/article/details/86514320
         *
         *
         *
         *
         *
         */
        public void getMergedBeanDefinition() {

        }
    }


    /**
     * {@linkplain AbstractAutowireCapableBeanFactory}
     *
     *
     */
    public static class AbstractAutowireCapableBeanFactoryStu {


        /**
         * {@linkplain AbstractAutowireCapableBeanFactory#createBean(String, RootBeanDefinition, Object[])}
         *
         *
         *
         */
        public void createBean(){}


    }

}
