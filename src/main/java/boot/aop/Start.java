package boot.aop;

import beanFactory.DefaultListableBeanFactoryStu;
import boot.beanDefinitionRegistryPostProcessor.ConfigurationClassPostProcessorStu;
import org.aopalliance.aop.Advice;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.TargetSource;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.aop.aspectj.annotation.BeanFactoryAspectJAdvisorsBuilder;
import org.springframework.aop.framework.AopInfrastructureBean;
import org.springframework.aop.framework.autoproxy.AbstractAdvisorAutoProxyCreator;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 启动
 * 导入依赖
 * <dependency>
 *   <groupId>org.springframework.boot</groupId>
 *   <artifactId>spring-boot-starter-aop</artifactId>
 * </dependency>
 *
 * 通过
 * 配置文件 EnableAutoConfiguration 引入 {@linkplain AopAutoConfiguration}
 * 在这个类上有 @ConditionalOnProperty(prefix = "spring.aop", name = "auto", havingValue = "true", matchIfMissing = true) 限制条件
 * 其中在类上是关于 {@linkplain EnableAspectJAutoProxy} 的注解
 * 在这个注解上有 @Import(AspectJAutoProxyRegistrar.class) {@linkplain org.springframework.context.annotation.AspectJAutoProxyRegistrar}
 * 其所有内容都是通过 Import 注解导入的
 * 而 AspectJAutoProxyRegistrar 又是 ImportBeanDefinitionRegistrar 子类
 * 所有这些解析见：{@linkplain ConfigurationClassPostProcessorStu#ImportStu}
 *
 *
 * 在 AspectJAutoProxyRegistrar 中 主要是向bean定义中添加
 *
 * {@linkplain AnnotationAwareAspectJAutoProxyCreator} 的定义
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/19 10:59 上午
 */
public class Start {


    /**
     * {@linkplain AnnotationAwareAspectJAutoProxyCreator}
     *
     * 这个类是 InstantiationAwareBeanPostProcessor 子类，解析见 {@linkplain DefaultListableBeanFactoryStu.AbstractAutowireCapableBeanFactoryStu#doCreateBean()}
     * 所以在bean创建的生命周期中一共会又一下几个方法调用
     * 1、在bean 创建前 执行 {@linkplain InstantiationAwareBeanPostProcessor#postProcessBeforeInstantiation(Class, String)}
     *  允许返回代理bean
     * 2、创建完bean对象后 执行 {@linkplain SmartInstantiationAwareBeanPostProcessor#getEarlyBeanReference(Object, String)}
     * 3、执行 {@linkplain InstantiationAwareBeanPostProcessor#postProcessAfterInstantiation(Object, String)} 判断是否需要执行后续
     * 4、在注入完成成员变量后 执行{@link InstantiationAwareBeanPostProcessor} 的postProcessProperties 和 postProcessPropertyValues
     * 5、之后在初始化前后分别执行 BeanPostProcessor的方法
     *
     *
     * 执行 ：postProcessBeforeInstantiation
     * 第一步：
     * 1、判断这些类不属于下面的子类：
     *  {@linkplain Advice} {@linkplain Pointcut} {@linkplain Advisor} {@linkplain AopInfrastructureBean}
     *  或者 asp中 不被 {@linkplain Aspect} 修饰
     *  经过上面的判断后，说明当前类可能会是被代理的类
     *
     * 2、//TODO 后面的一些逻辑有点看不懂
     *
     * 执行： getEarlyBeanReference
     * //TODO 暂不分析
     *
     * 执行： postProcessAfterInstantiation 永远返回true
     *
     * 执行：postProcessProperties 永远返回当前对象
     *
     * 执行：postProcessPropertyValues 无
     *
     * 执行：postProcessBeforeInitialization 无
     *
     * 执行：postProcessAfterInitialization 主要逻辑
     * 1、与postProcessBeforeInstantiation 相同，再判断一次逻辑
     * 2、主要逻辑 {@linkplain AbstractAdvisorAutoProxyCreator#getAdvicesAndAdvisorsForBean(Class, String, TargetSource)}
     *  1、第一次加载是获取到所有aop的类 逻辑在 {@linkplain BeanFactoryAspectJAdvisorsBuilder#buildAspectJAdvisors()}
     *     有 {@linkplain Aspect }注解的类
     *  2、在第一步找到的方法中 继续找每个类找到包含这注解的方法 Pointcut.class, Around.class, Before.class, After.class, AfterReturning.class, AfterThrowing.class
     *  将其保存起来，作为aop的切面
     *  3、对每个方法匹配aop却面。在 {@linkplain AopUtils#canApply(Advisor, Class, boolean)}
     *
     *
     *
     */
    public static  class  AnnotationAwareAspectJAutoProxyCreatorStu{

    }

}
