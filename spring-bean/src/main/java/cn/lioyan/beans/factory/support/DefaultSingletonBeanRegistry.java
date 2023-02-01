package cn.lioyan.beans.factory.support;

/**
 * {@link org.springframework.beans.factory.support.DefaultSingletonBeanRegistry} <br>
 * 接口：{@link cn.lioyan.beans.factory.config.SingletonBeanRegistry} 的实现<br>
 * <br>
 * 他通过 3个 map 分别保存 不同时期的 bean对象<br>
 * <br>
 * <li>singletonObjects 保存完整的单例对象</li>
 * <li>earlySingletonObjects 保存刚创建完成，但还没有注入依赖的单例对象</li>
 * <li>singletonFactories 当前单例需要代理时，会被封装到ObjectFactory，通过ObjectFactory 方法获取代理对象</li>
 * <br>
 * 完整的bean创建过程如下：<br>
 * <br>
 * 开始将bean 存放在 singletonFactories 中，如果由aop就会被封装为代理对象<br>
 * 之后如果被其他bean循环依赖，就会提取从singletonFactories 中获取，将bean对象存放在earlySingletonObjects中<br>
 * 全部初始化完成后，就将bean 存放在singletonObjects中<br>
 * <br>
 * {@link org.springframework.beans.factory.support.DefaultSingletonBeanRegistry#getSingleton(String)} <br>
 * 依次从singletonObjects --> earlySingletonObjects--> singletonFactories 获取bean对象，<br>
 * <br>
 * <br>
 * <br>
 * TODO TypeConverter 的创建
 *
 * @author com.lioyan
 * @date 2023/1/31  9:41
 */
public class DefaultSingletonBeanRegistry
{
}
