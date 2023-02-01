package cn.lioyan.beans.factory.support;

import org.springframework.beans.TypeConverter;
import org.springframework.beans.factory.annotation.QualifierAnnotationAutowireCandidateResolver;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.config.DependencyDescriptor;
import org.springframework.beans.factory.support.AutowireCandidateResolver;

import java.util.Set;


/**
 * {@link org.springframework.beans.factory.support.DefaultListableBeanFactory} <br>
 * spring 中默认使用的 BeanFactory <br>
 * 1、 resolveDependency 解决依赖， 在 构造函数、注解的属性注入的时候都是通过这个方法 <br>
 * 2、 各自通过类型获取bean对象 <br>
 * 3、 通过注解获取bean对象 <br>
 *
 *{@link org.springframework.beans.factory.support.DefaultListableBeanFactory#resolveDependency(DependencyDescriptor, String, Set, TypeConverter)}
 * 1、 3种情况：类型是 Optional、结果封装为Optional 、ObjectFactory 封装为 ObjectFactory 对象，是在用户调用get 方法时调用doResolveDependency ，其他调用doResolveDependency获取对象
 * 2、判断当前注入是否有@Value 注解，如果有委托{@link  AutowireCandidateResolver} 进行获取，并解析 ${} 字符串
 * 3、调用 resolveMultipleBeans 方法 处理多返回值。这个里面就有 对 数组、list、map 类型的判断
 * 4、调用 {@link org.springframework.beans.factory.support.DefaultListableBeanFactory#findAutowireCandidates(String, Class, DependencyDescriptor)} 获取所有候选，这里就是注解Qualifier 的逻辑
 * 4-1、 调用：{@link  QualifierAnnotationAutowireCandidateResolver#isAutowireCandidate(BeanDefinitionHolder, DependencyDescriptor)} 判断当前是否为候选，如： Qualifier 注解
 * 5、如果候选有多个，进行判断
 * 5-1、遍历、有某个类时 Primary 类型、通过@Primary 设置，就直接返回
 * 5-2、HighestPriority 判断
 * 5-3、按照名称筛选
 * 结束
 * @author com.lioyan
 * @date 2023/2/1  18:45
 */
public class DefaultListableBeanFactory
{
}
