package cn.lioyan.aop.aspectj;

import org.aopalliance.intercept.MethodInvocation;


/**
 * {@link org.springframework.aop.aspectj.AspectJAfterAdvice} <br>
 * @After 切面的实现。主要逻辑在{@link  org.springframework.aop.aspectj.AspectJAfterAdvice#invoke(MethodInvocation)} 实现<br>
 * 先调用了 MethodInvocation（Joinpoint 的子类），proceed 调用了被代理的方法，<br>
 * 后面在 finally 中调用了父类的invokeAdviceMethod ，执行了代理方法<br>
 * <br>
 * @author com.lioyan
 * @date 2023/2/6  11:46
 */
public class AspectJAfterAdvice
{
}
