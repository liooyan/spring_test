package cn.lioyan.context.annotation;

import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;
import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;


/**
 * {@link org.springframework.context.annotation.AnnotatedBeanDefinitionReader} <br>
 * 用于注解的bean 读取适配器<br>
 * 在构造函数中调用：{@link org.springframework.context.annotation.AnnotationConfigUtils#registerAnnotationConfigProcessors(BeanDefinitionRegistry)} 注册注解相关内容<br>
 * 1、 在beanFaction 中添加 ：{@link ContextAnnotationAutowireCandidateResolver} 用于在beanFactory 解决依赖是，解析相关注解<br>
 * 2、 --------{@link AnnotationAwareOrderComparator} 用于排序时，解析排序注解<br>
 * 3、---------{@link ConfigurationClassPostProcessor} 处理 @Configuration 注解<br>
 * 4、---------{@link AutowiredAnnotationBeanPostProcessor} 用于解析 AutoWired 和 Value<br>
 * 5、---------{@link CommonAnnotationBeanPostProcessor} 用于解析 Resource、Resource<br>
 * 6、
 * @author com.lioyan
 * @date 2023/2/2  15:48
 */
public class AnnotatedBeanDefinitionReader
{
}
