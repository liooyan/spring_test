package cn.lioyan.beans.annotation;

import org.springframework.beans.TypeConverter;
import org.springframework.beans.factory.config.DependencyDescriptor;

import java.util.Set;


/**
 * {@link org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor} <br>
 * 用于处理 ：Autowired、Value、Inject 注解。  <br>
 * 继承自：{@link  cn.lioyan.beans.factory.support.MergedBeanDefinitionPostProcessor} 和 {@link cn.lioyan.beans.factory.config.InstantiationAwareBeanPostProcessor} <br>
 * <br>
 * postProcessMergedBeanDefinition 通过 findAutowiringMetadata 方法， 遍历当前class的所有成员遍历和方法的注解，选择我们需要的Autowired、Value、Inject 注解。并将解决保存在一个map中 <br>
 * postProcessProperties 注入依赖： 通过 {@link org.springframework.beans.factory.support.DefaultListableBeanFactory#resolveDependency(DependencyDescriptor, String, Set, TypeConverter)} <br>
 * 如果是field 就实在设置。<br>
 * <br>
 * <br>
 *
 *
 * <br>
 * <br>
 * <br>
 * @author com.lioyan
 * @date 2023/2/2  10:00
 */
public class AutowiredAnnotationBeanPostProcessor
{
}
