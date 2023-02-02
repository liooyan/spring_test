package cn.lioyan.context.annotation;

import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;


/**
 * {@link  org.springframework.context.annotation.ClassPathBeanDefinitionScanner} <br>
 * 扫描指定路径下 的class BeanDefinition 并注册到spring中。 在{@link AnnotatedBeanDefinitionReader} 默认创建。{@link ConfigurationClassPostProcessor} 也创建了对象，用在spring-boot中。<br>
 * mybaity也是使用这个类进行扫描<br>
 * 父类：ClassPathScanningCandidateComponentProvider 中定义默认的includeFilters 。扫描 Component、javax.annotation.ManagedBean、javax.inject.Named 这几个注解<br>
 * resourcePattern 属性默认 {@link ClassPathScanningCandidateComponentProvider#DEFAULT_RESOURCE_PATTERN} 扫描所有文件<br>
 * <br>
 * <br>
 * ClassPathBeanDefinitionScanner 主要方法  {@link  org.springframework.context.annotation.ClassPathBeanDefinitionScanner#doScan(String...)}<br>
 * 1、通过 {@link  org.springframework.context.annotation.ClassPathBeanDefinitionScanner#findCandidateComponents(String)} 扫描到所有符合要的类<br>
 * 2、如果是 AnnotatedBeanDefinition 类型的BeanDefinition ，检查各自不同的注解 Lazy、Primary、DependsOn、Role、Description<br>
 * 3、注册BeanDefinition<br>
 * <br>
 * <br>
 * <br>
 * <br>
 * {@link  org.springframework.context.annotation.ClassPathBeanDefinitionScanner#findCandidateComponents(String)}<br>
 * 通过 ResourcePatternResolver 加载到所有的class文件，之后通过 includeFilters与excludeFilters 过滤符合要求的数据<br>
 * <br>
 * <br>
 * <br>
 *
 * @author com.lioyan
 * @date 2023/2/2  15:48
 */
public class ClassPathBeanDefinitionScanner
{
}
