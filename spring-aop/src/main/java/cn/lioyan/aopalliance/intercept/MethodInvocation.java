package cn.lioyan.aopalliance.intercept;

/**
 * {@link org.aopalliance.intercept.MethodInvocation}
 * 用于方法的连接点，也就说我们常使用的。继承自{@link  Joinpoint} 添加如下方法：
 * <li>getMethod 返回被代理的方法对象</li>
 * <li>getArguments 返回参数</li>
 * @author com.lioyan
 * @date 2023/2/6  14:48
 */
public interface MethodInvocation
{
}
