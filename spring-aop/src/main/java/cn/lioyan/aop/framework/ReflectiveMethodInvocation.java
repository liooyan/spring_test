package cn.lioyan.aop.framework;

/**
 * {@link org.springframework.aop.framework.ReflectiveMethodInvocation} <br>
 * {@link  cn.lioyan.aop.ProxyMethodInvocation} 的实现。 aop就说通过这个类实现的代理 <br>
 * 构造函数 <br>
 * Object proxy 代理后的对象 <br>
 *  Object target 被代理的对象 <br>
 *  Method method 代理方法 <br>
 *  Object[] arguments 代理参数 <br>
 *  Class<?> targetClass  被代理对象的类型 <br>
 *  List<Object> interceptorsAndDynamicMethodMatchers 所有切面组成的list <br>
 *  <br>
 *  <br>
 *   <br>
 * {@link org.springframework.aop.framework.ReflectiveMethodInvocation#proceed()} 依次调用interceptorsAndDynamicMethodMatchers 内的切面<br>
 *
 *
 *
 *
 * @author com.lioyan
 * @date 2023/2/6  13:49
 */
public class ReflectiveMethodInvocation
{
}
