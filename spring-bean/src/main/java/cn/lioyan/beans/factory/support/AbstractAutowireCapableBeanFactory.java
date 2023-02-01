package cn.lioyan.beans.factory.support;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.factory.support.RootBeanDefinition;


/**
 * {@link org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory} <br>
 * 实现spring bean的完整创建流程，核心方法： <br>
 * {@link org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#createBean(String, RootBeanDefinition, Object[])}  } <br>
 * <br>
 * 1、前置处理 Object bean = resolveBeforeInstantiation(beanName, mbdToUse); 如果有这个bean处理器，就直接返回对象<br>
 * 2、调用 doCreateBean 方法，真正的创建bean<br>
 * 3、instanceWrapper = createBeanInstance(beanName, mbd, args); 创建对象， 将结果封装为{@link BeanWrapper} 对象<br>
 * 4、调用BeanPostProcessor 的 postProcessMergedBeanDefinition 方法<br>
 * 5、将bean 实例保存在singletonFactories 中，其中调用了getEarlyBeanReference 。如果有代理，对象会本替换为代理对象<br>
 * 6、调用 populateBean 进行属性注入<br>
 * 7、调用 initializeBean 进行 bean初始化<br>
 * <br>
 * <br>
 * <br>
 * {@link org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#createBeanInstance(String, RootBeanDefinition, Object[])}  }<br>
 * <br>
 * <br>
 * 1、通过后置处理器：determineCandidateConstructors 确定使用的 构造函数<br>
 * 2、 如果有构造函数就使用{@link  org.springframework.beans.factory.support.ConstructorResolver} 委托 创建对象<br>
 * 3、 如果没有，就使用默认无参的构造函数<br>
 * <br>
 * <br>
 * {@link  org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#populateBean(String, RootBeanDefinition, BeanWrapper)} <br>
 * 填充bean对象，主要是属性的注入： <br>
 * 1、 先调用了： postProcessAfterInstantiation <br>
 * 2、 通过 postProcessProperties 注入 属性 <br>
 * <br>
 * {@link  org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#initializeBean(String, Object, RootBeanDefinition)} <br>
 * 初始化bean <br>
 * 1、 几种 Ware 对象 <br>
 * 2、 调用 postProcessBeforeInitialization  处理注解的初始化 <br>
 * 3、 判断是否是 InitializingBean 子类，处理其过程 <br>
 * <br>
 * <br>
 * <br>
 * <br>
 * <br>
 *
 * @author com.lioyan
 * @date 2023/2/1  10:46
 */
public class AbstractAutowireCapableBeanFactory
{
}
