package beanDefinitionRegistry;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.core.AliasRegistry;

/**
 * {@linkplain DefaultListableBeanFactory}
 * Listable 列出的
 * 当前只解析关于{@linkplain BeanDefinitionRegistry} 的接口实现。
 * 继承关系
 * {@linkplain AliasRegistry}
 * {@linkplain BeanDefinitionRegistry}
 * {@linkplain DefaultListableBeanFactory}
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/1 10:33 上午
 */
public class DefaultListableBeanFactoryStu {

    /**
     * {@linkplain AliasRegistry}
     * Alias 别名
     * 别名记录处
     * 定义接口 获取别名、删除别名、判断别名存在、获取某个bean的别名
     *
     */
    public static class AliasRegistryStu{

    }


    /**
     * {@linkplain BeanDefinitionRegistry}
     * 注册所有bean定义接口
     * 接口包括
     * 注册bean定义
     * 移除bean定义
     * 获取bean定义
     * 判断bean定义是否存在
     * 获取所有bean定义名称
     * 获取bean定义数量
     *
     *
     *
     */
    public static class BeanDefinitionRegistryStu{

    }

    /**
     * 关于{@linkplain DefaultListableBeanFactory}的
     * {@linkplain BeanDefinitionRegistry} 接口实现部分
     *
     * 注册bean定义
     * 1、{@linkplain DefaultListableBeanFactory#registerBeanDefinition(String, BeanDefinition)}
     *
     * 所有bean定义保存在 {@linkplain DefaultListableBeanFactory#beanDefinitionMap} 属性中，
     * 首先根据名称获取旧的bean定义。
     * 如果存在，
     *  根据 {@linkplain DefaultListableBeanFactory#allowBeanDefinitionOverriding} 属性判断是否允许覆盖，默认允许
     *  如果允许覆盖则直接保存在beanDefinitionMap 中，否则报错
     * 如果不存在
     *  将bean定义保存在 beanDefinitionMap中
     *  并且在 {@linkplain DefaultListableBeanFactory#beanDefinitionNames} 中添加bean名称
     *
     * 注意: 还有部分疑问
     *
     *
     * 删除并定义
     * 2、{@linkplain DefaultListableBeanFactory#removeBeanDefinition(String)}
     * 删除map与bean定义名称
     * 但对于 {@linkplain DefaultListableBeanFactory#resetBeanDefinition(String)} 不明白
     *
     *
     *
     *
     */
    public static class  DefaultListableBeanFactoryClass{

    }


}
