package cn.lioyan.aop.framework;

import org.springframework.cglib.proxy.Enhancer;


/**
 * {@link org.springframework.aop.framework.ObjenesisCglibAopProxy} <br>
 * aop代理，其中{@link org.springframework.aop.framework.CglibAopProxy#getProxy()} 就是操作{@link  Enhancer} 生成代理对象的过程。<br>
 * 其中代理执行的方法为：{@link org.springframework.aop.framework.CglibAopProxy.DynamicAdvisedInterceptor}<br>
 * <br>
 * <br>
 * DynamicAdvisedInterceptor 的 intercept 方法， 就是先获取到所有的 advised ，再通过{@link DefaultAdvisorChainFactory} 筛选除当前符合要求的advised <br>
 * 最后就是调用 advised了。<br>
 *
 */
public class ObjenesisCglibAopProxy {
}
