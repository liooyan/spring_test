package cn.lioyan.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.weaver.tools.JoinPointMatch;


/**
 * {@link org.springframework.aop.aspectj.AbstractAspectJAdvice} <br>
 * Advice 的 抽象实现。<br>
 * 构造函数：<br>
 * <li>Method aspectJAdviceMethod 当前切面的Method 对象</li>
 * <li>AspectJExpressionPointcut pointcut 当前切面的pointcut ，用户判断代理目标是否符合当前切面的要求 </li>
 * <li>AspectInstanceFactory aspectInstanceFactory 切面的实例工厂对象，一般为我们的beanFactory 封装对象</li>
 * <br>
 * 主要方法：{@link   org.springframework.aop.aspectj.AbstractAspectJAdvice#invokeAdviceMethod(JoinPoint, JoinPointMatch, Object, Throwable)}<br>
 * 1、通过{@link  org.springframework.aop.aspectj.AbstractAspectJAdvice#argBinding(JoinPoint, JoinPointMatch, Object, Throwable)} 生成参数<br>
 * 2、 调用 invokeAdviceMethodWithGivenArgs 调用切面， 实现就是通过反射实现。<br>
 *
 * 这里我们主要解析的就是 参数的绑定<br>
 * {@link  org.springframework.aop.aspectj.AbstractAspectJAdvice#argBinding(JoinPoint, JoinPointMatch, Object, Throwable)} 生成参数<br>
 * 根据 calculateArgumentBindings 方法，确定的参数，注入需要的参数<br>
 *{@link  org.springframework.aop.aspectj.AbstractAspectJAdvice#calculateArgumentBindings()}  计算参数绑定<br>
 * 计算当前切面都有哪些参数可以用来绑定。主要有：<br>
 * 1、一个个必须为：{@link JoinPoint} 或者{@link ProceedingJoinPoint}<br>
 * 2、 后续的一下参数可以为 returning、throwing 分别为返回值或者 异常<br>
 *
 * @author com.lioyan
 * @date 2023/2/6  10:33
 */
public class AbstractAspectJAdvice
{
}
