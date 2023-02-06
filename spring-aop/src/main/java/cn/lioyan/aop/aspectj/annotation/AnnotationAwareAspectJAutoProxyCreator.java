package cn.lioyan.aop.aspectj.annotation;

/**
 * {@link org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator} <br>
 * aop 的BeanPostProcessor 。关于aop 的切面与注解都是通过它加载的.<br>
 * 主要有： getEarlyBeanReference 和 postProcessAfterInitialization 两个阶段。<br>
 * 如果有早期依赖，就通过getEarlyBeanReference 否则 postProcessAfterInitialization<br>
 * 都是{@link org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator#wrapIfNecessary(Object, String, Object)} 实现。<br>
 * 切面 就是扫描所有的beanDefinition。通过{@link AspectJAdvisorFactory} 创建<br>
 * 然后通过{@link cn.lioyan.aop.framework.ProxyFactory} 创建切面<br>
 */
public class AnnotationAwareAspectJAutoProxyCreator {
}
