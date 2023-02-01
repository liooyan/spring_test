package cn.lioyan.beans.factory.support;

import org.springframework.beans.factory.ObjectFactory;


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
 * 当bean被刚创建时，还没有注入属性。会被保存在earlySingletonObjects 中，这时，对于spring来说不是一个完整的bean对象。<br>
 * 当bean的初始化完成后，会被从earlySingletonObjects 移除， 存放到singletonObjects 中，也就是 bean单例最终的存放位置<br>
 * <br>
 * 当有循环依赖时：<br>
 * 一个bean 创建后在 earlySingletonObjects中，这个时候需要注入属性，可能会去先创建其他bean对象。<br>
 * 而这个时候，其他的bean又依赖了我们本来的bean对象，这个时候就需要先从earlySingletonObjects 中获取对象，注入给其他对象。<br>
 * <br>
 * 这样就解决了循环依赖的问题。<br>
 * <br>
 * <br>
 * 当有aop代理时：<br>
 * 刚创建完的对象会被从 earlySingletonObjects 中移除，封装为ObjectFactory，放在singletonFactories中。<br>
 * 这样如果存在循环依赖，我们从singletonFactories中获取的就是代理后的对象，而不是原始对象<br>
 *
 * 当获取bean对象时， 从 singletonFactories 中移除， 获取到代理对象放到 earlySingletonObjects ，后面属性注入，将直接使用
 * <br>
 * <br>
 *
 * {@link org.springframework.beans.factory.support.DefaultSingletonBeanRegistry#getSingleton(String)} <br>
 * 依次从singletonObjects --> earlySingletonObjects--> singletonFactories 获取bean对象，
 *
 * @author com.lioyan
 * @date 2023/1/31  9:41
 */
public class DefaultSingletonBeanRegistry
{
}
