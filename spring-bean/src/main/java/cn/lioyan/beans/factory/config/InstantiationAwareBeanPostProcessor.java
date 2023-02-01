package cn.lioyan.beans.factory.config;

/**
 * {@link org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor}
 * 有初始化能力的BeanPostProcessor，这里主要有3个方法
 * <li>postProcessBeforeInstantiation 在bena实例化前调用，如果返回了对象，spring就不会自己在创建对象直接返回。并且不做其他属性注入，只会调用postProcessAfterInitialization </li>
 * <li>postProcessAfterInstantiation 在实例化后调用</li>
 * <li>postProcessProperties 后置属性处理，我们成员变量的注解就在这一步处理 </li>
 *
 *
 *
 */
public interface InstantiationAwareBeanPostProcessor {
}
