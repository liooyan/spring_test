package cn.lioyan.aopalliance.intercept;

import org.aopalliance.intercept.MethodInvocation;


/**
 * {@link org.aopalliance.intercept.MethodInterceptor} <br>
 * 方法拦截器，继承自 {@link Advice} 所有的方法切面都是它的子类。<br>
 * <br>
 * 方法：{@link org.aopalliance.intercept.MethodInterceptor#invoke(MethodInvocation)}<br>
 * 调用被代理方法，在这里添加切面逻辑。<br>
 *
 * @author com.lioyan
 * @date 2023/2/6  11:45
 */
public interface MethodInterceptor
{
}
