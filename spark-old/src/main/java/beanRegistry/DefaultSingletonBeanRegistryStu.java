package beanRegistry;

import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.core.AliasRegistry;
import org.springframework.core.SimpleAliasRegistry;

/**
 * {@linkplain DefaultSingletonBeanRegistry}
 * Default 默认的
 * Singleton 单例
 * Registry 登记处
 * <p>
 * 继承关系:
 * {@linkplain AliasRegistry}
 * {@linkplain SimpleAliasRegistry}   {@linkplain SingletonBeanRegistry}
 * {@linkplain DefaultSingletonBeanRegistry}
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/1/31 4:47 下午
 */
public class DefaultSingletonBeanRegistryStu {

    /**
     * {@linkplain AliasRegistry}
     * 别名注册
     */
    public static class AliasRegistryStu {

    }


    /**
     * {@linkplain SimpleAliasRegistry}
     * Simple 简单的
     * 通过 Map<String, String> aliasMap = new ConcurrentHashMap<>(16) 记录别名
     * 其中 key 为别名
     * value 为 bean 名称
     *
     *
     */
    public static class SimpleAliasRegistryStu{


    }

    /**
     *  {@linkplain SingletonBeanRegistry}
     *  单例对象注册表接口
     *  定义了
     *  获取单例对象，注册单例对象、获取单例对象名称、数量等接口
     *
     *
     */
    public static class SingletonBeanRegistryStu{


    }

    /**
     * {@linkplain DefaultSingletonBeanRegistry}
     * 默认的 单例对象注册表实现
     *
     * 1、添加 单例对象
     * {@linkplain DefaultSingletonBeanRegistry#registerSingleton(String, Object)}
     * 其中 一共有 3个map 保存对象，具体如下：
     * {@linkplain DefaultSingletonBeanRegistry#singletonObjects}
     * {@linkplain DefaultSingletonBeanRegistry#singletonFactories}
     * {@linkplain DefaultSingletonBeanRegistry#earlySingletonObjects}
     *
     *
     * singletonObjects 为最终保存单例的map
     * 具体处理流程为:
     * spring 单例在没有注入属性前 为 ObjectFactory 对象。
     * 首先被保存在 singletonFactories 对象中，
     * 当初始化其他bean时，需要待对象，此时从singletonFactories 中删除放入earlySingletonObjects 中。
     * 最后在这个bean完全创建完成后，被保存在 singletonObjects 中。
     *
     * 其他不再详细说明差不多都一样。
     *
     *
     */
    public static class DefaultSingletonBeanRegistryClass{

    }




}
