package beanPostProcessor;


import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;

/**
 *{@linkplain BeanPostProcessor}
 * 对于其不同子类，并且在不同时期的处理情况解析。
 * 1、{@linkplain InstantiationAwareBeanPostProcessor} 有4个接口
 *  作用：
 *  1.1 在bean实例化前调用 postProcessBeforeInstantiation 如果有返回对象则调用使用返回的对象。
 *  1.2 postProcessAfterInstantiation 判断当前类是否需要注入依赖。在 3 后面调用
 *  1.3 postProcessProperties 与 postProcessPropertyValues 都为属性注入。其中@AutoWire @Value就是在这里解决
 *
 *  其子类 ：
 *  {@linkplain ConfigurationClassPostProcessor.ImportAwareBeanPostProcessor}
 *  {@linkplain CommonAnnotationBeanPostProcessor} Resource的注解
 *  {@linkplain org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor}
 *
 * 2、{@linkplain SmartInstantiationAwareBeanPostProcessor}
 *  作用：通过determineCandidateConstructors 确定构造函数
 *  子类：
 *  {@linkplain org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor}
 *
 *
 * 3、{@linkplain MergedBeanDefinitionPostProcessor}
 *  作用：对象刚创建完成后
 * {@linkplain CommonAnnotationBeanPostProcessor}
 * {@linkplain org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor}
 *
 * 4、普通的类
 * 在执行 afterPropertiesSet 方法前后分别执行两个方法：
 * postProcessBeforeInitialization 和 postProcessAfterInitialization
 * postProcessBeforeInitialization 主要为aware注入
 *
 *
 *
 * {@linkplain org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#doCreateBean(String, RootBeanDefinition, Object[])}
 * 1、生成{@linkplain org.springframework.beans.BeanWrapper} 对象。调用方法： {@linkplain org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#createBeanInstance(String, RootBeanDefinition, Object[])}
 *  对于构造函数依赖，应该是在此执行。
 * 2、对于MergedBeanDefinition 执行  {@linkplain org.springframework.beans.factory.support.MergedBeanDefinitionPostProcessor#postProcessMergedBeanDefinition(RootBeanDefinition, Class, String)}
 * 3、如果当前类存在允许依赖，及当前类正在创建：调用{@linkplain org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor#getEarlyBeanReference(Object, String)}后直接注册在单例对象中。
 * 4、装配bean属性 {@linkplain org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#populateBean(String, RootBeanDefinition, BeanWrapper)}
 *   4.1 根据{@linkplain org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor#postProcessAfterInstantiation(Object, String)}判断当前类是否具有后置处理能力
 *   4.2 解决xml 中的自动装在。autowire="byType" 需要 get和set方法
 *   4.3 执行{@link org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor} 的postProcessProperties 和 postProcessPropertyValues
 *      应该是 自动装载属性
 *   4.4 {@link org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#applyPropertyValues(String, BeanDefinition, BeanWrapper, PropertyValues)}
 *      应该是把属性的值注入到 bean中
 * 5、初始化bean {@linkplain org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#initializeBean(String, Object, RootBeanDefinition)}
 *  5.1、判断Aware 子类。 注入对应属性
 *  5.2 执行 {@linkplain BeanPostProcessor#postProcessBeforeInitialization(Object, String)}
 *  5.3 执行 invokeInitMethods 方法 具体为：InitializingBean 的子类。或者 afterPropertiesSet 方法
 *  5.2 执行 {@linkplain BeanPostProcessor#postProcessAfterInitialization(Object, String)}
 *
 *
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/18 8:43 下午
 */
public class BeanPostProcessorStu {
    /**
     * {@linkplain org.springframework.context.support.ApplicationContextAwareProcessor}
     * 对于 Aware 子类处理
     *
     */
    public static class  ApplicationContextAwareProcessorStu{


    }

}
