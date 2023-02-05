package cn.lioyan.aop.config;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

/**
 * {@link org.springframework.aop.config.AopConfigUtils}
 * aop 配置的工具类，其中通过注入 ：{@link AnnotationAwareAspectJAutoProxyCreator},一个 BeanPostProcessor ，用来处理aop的所有逻辑
 *
 * {@link org.springframework.aop.config.AopConfigUtils#registerAspectJAnnotationAutoProxyCreatorIfNecessary(BeanDefinitionRegistry)}
 *
 *
 *
 */
public class AopConfigUtils {
}
