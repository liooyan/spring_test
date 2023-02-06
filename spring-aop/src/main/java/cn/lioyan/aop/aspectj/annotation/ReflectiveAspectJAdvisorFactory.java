package cn.lioyan.aop.aspectj.annotation;

import cn.lioyan.aopalliance.intercept.Advice;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;


/**
 * {@link org.springframework.aop.aspectj.annotation.ReflectiveAspectJAdvisorFactory}
 * 实现{@link AspectJAdvisorFactory}
 *  getAdvisors ：{@link InstantiationModelAwarePointcutAdvisorImpl} 其中有Pointcut 对象：{@link AspectJExpressionPointcut}
 *  逻辑为根据 {@link Aspect} 注解
 *  getAdvice： 根据不同的注解 生成 不同的{@link Advice}
 *
 * @author com.lioyan
 * @date 2023/2/6  17:25
 */
public class ReflectiveAspectJAdvisorFactory
{
}
