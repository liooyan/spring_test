package cn.lioyan.beans.factory.support;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

import java.lang.reflect.Constructor;


/**
 * {@link org.springframework.beans.factory.support.ConstructorResolver} <br>
 * bean 调用构造函数，创建对象的委托类<br>
 * <br>
 * <br>
 * <br>
 * {@link org.springframework.beans.factory.support.ConstructorResolver#autowireConstructor(String, RootBeanDefinition, Constructor[], Object[])} <br>
 *  调用 AbstractAutowireCapableBeanFactory的resolveDependency 解决依赖， 在{@link  DefaultListableBeanFactory} 实现 <br>
 *  <br>
 *  <br>
 *  <br>
 *  <br>
 *  <br>
 * @author com.lioyan
 * @date 2023/2/1  17:45
 */
public class ConstructorResolver
{
}
