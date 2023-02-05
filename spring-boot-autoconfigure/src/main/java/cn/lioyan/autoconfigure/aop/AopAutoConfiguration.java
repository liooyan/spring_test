package cn.lioyan.autoconfigure.aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * {@link org.springframework.boot.autoconfigure.aop.AopAutoConfiguration}
 * 通过配置spring.aop.auto 开启aop。 默认为开启
 * 通过{@link EnableAspectJAutoProxy} 注解注入 @Import(AspectJAutoProxyRegistrar.class)
 * {@link  org.springframework.context.annotation.AspectJAutoProxyRegistrar} 在aop 中解析
 *
 *
 */
public class AopAutoConfiguration {
}
