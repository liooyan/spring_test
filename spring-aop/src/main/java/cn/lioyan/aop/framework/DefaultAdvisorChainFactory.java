package cn.lioyan.aop.framework;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;
import org.springframework.aop.framework.AdvisorChainFactory;


/**
 * {@link org.springframework.aop.framework.DefaultAdvisorChainFactory} <br>
 * 继承自{@link AdvisorChainFactory}，<br>
 * 方法： getInterceptorsAndDynamicInterceptionAdvice<br>
 * 通过Method method, @Nullable Class<?> targetClass 筛选除当前符合要求的{@link Advice}<br>
 * <br>
 * <br>
 * 对于 {@link PointcutAdvisor} 子类<br>
 * <br>
 * 就是通过 {@link Pointcut} getClassFilter与getMethodMatcher 进行过滤<br>
 * <br>
 * <br>
 *
 *
 * @author com.lioyan
 * @date 2023/2/6  15:53
 */
public class DefaultAdvisorChainFactory
{
}
