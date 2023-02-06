package cn.lioyan.aop.aspectj;

import org.aspectj.weaver.tools.JoinPointMatch;


/**
 * {@link org.springframework.aop.aspectj.AspectJAfterReturningAdvice}
 * 实现 afterReturning 方法。
 * 参数注入的是{@link JoinPointMatch}，如果切面的returnValue 与 被代理返回的类型符合，就执行。也是调用父类invokeAdviceMethod
 * @author com.lioyan
 * @date 2023/2/6  11:52
 */
public class AspectJAfterReturningAdvice
{
}
