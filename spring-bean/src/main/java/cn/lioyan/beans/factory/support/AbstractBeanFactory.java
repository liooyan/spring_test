package cn.lioyan.beans.factory.support;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;


/**
 * {@link org.springframework.beans.factory.support.AbstractBeanFactory} <br>
 * <br>
 * BeanFactory 的抽象实现， 这里主要实现的时doGetBean 方法，<br>
 * 主要时对于不同 作用范围的getBean 的实现，而对于bean 正在的创建过程通过{@link org.springframework.beans.factory.support.AbstractBeanFactory#createBean(String, RootBeanDefinition, Object[])} 由子类实现<br>
 * <br>
 * <br>
 * <br>
 * {@link org.springframework.beans.factory.support.AbstractBeanFactory#doGetBean(String, Class, Object[], boolean)} 解析<br>
 * <br>
 * 1、String beanName = transformedBeanName(name); 转换bena名字，获取到真实的bean名字，如别名、&
 * 2、从   {@link org.springframework.beans.factory.support.DefaultSingletonBeanRegistry#getSingleton(String)} )} 方法中获取单例对象。
 * 3、如果可以获取到 就返回对应的bean
 * 4、如果不行，就创建bean对象，通过createBean 创建，由子类实现。
 * 这里分为不同的几种作用域：
 * 4-1、 单例：调用 {@link org.springframework.beans.factory.support.DefaultSingletonBeanRegistry#getSingleton(String, ObjectFactory)}  )} 方法注册到spring中
 * 4-2、非单例：直接创建并返回
 * 4-3、其他作用域：注册到 {@link  org.springframework.beans.factory.config.Scope} 中
 * 5、 返回结果处理：
 * 5-1、调用：{@link org.springframework.beans.factory.support.AbstractBeanFactory#getObjectForBeanInstance(Object, String, String, RootBeanDefinition)}处理FactoryBean 对象的实例
 * 5-2、类型转换：通过：{@link org.springframework.beans.TypeConverter } 转换为我们需要的类型
 * <br>
 * <br>
 *
 * @author com.lioyan
 * @date 2023/2/1  10:05
 */
public class AbstractBeanFactory
{
}
