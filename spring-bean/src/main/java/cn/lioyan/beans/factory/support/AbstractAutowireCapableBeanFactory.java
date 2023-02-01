package cn.lioyan.beans.factory.support;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.factory.support.RootBeanDefinition;


/**
 * {@link org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory} <br>
 * 实现spring bean的完整创建流程，核心方法： <br>
 * {@link org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#createBean(String, RootBeanDefinition, Object[])}  } <br>
 *
 * 1、前置处理 Object bean = resolveBeforeInstantiation(beanName, mbdToUse); 如果有这个bean处理器，就直接返回对象
 * 2、调用 doCreateBean 方法，真正的创建bean
 * 3、instanceWrapper = createBeanInstance(beanName, mbd, args); 创建对象， 将结果封装为{@link BeanWrapper} 对象
 * 4、调用BeanPostProcessor 的 postProcessMergedBeanDefinition 方法
 * 5、将bean 实例保存在singletonFactories 中，其中调用了getEarlyBeanReference 。如果有代理，对象会本替换为代理对象
 * 6、调用 populateBean 进行属性注入
 * 7、调用 initializeBean 进行 bean初始化
 * <br>
 * <br>
 * <br>
 * {@link org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory#createBeanInstance(String, RootBeanDefinition, Object[])}  }
 * <br>
 * <br>
 *
 *
 * <br>
 *
 * @author com.lioyan
 * @date 2023/2/1  10:46
 */
public class AbstractAutowireCapableBeanFactory
{
}
