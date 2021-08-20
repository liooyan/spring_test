package boot.beanDefinitionRegistryPostProcessor;

import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.AutoConfigurationImportSelector;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.*;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.type.filter.AbstractTypeHierarchyTraversingFilter;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;
import resourceLoader.PathMatchingResourcePatternResolverStu;

import java.util.function.Predicate;

/**
 * {@linkplain ConfigurationClassPostProcessor}
 *
 * 1、最终调用的是 {@linkplain org.springframework.context.annotation.ConfigurationClassParser#doProcessConfigurationClass(ConfigurationClass, ConfigurationClassParser.SourceClass, Predicate)}
 * 2、 第一步判断是否包含{@linkplain Component} 注解 解析其子类 //TODO
 * 3、第二步判断是否包含{@linkplain PropertySources} 与 {@linkplain PropertySource}
 * 4、判断是否包含{@linkplain ComponentScans} 与 {@linkplain ComponentScan}
 *  4-1、 解析交给{@linkplain org.springframework.context.annotation.ComponentScanAnnotationParser}
 *      (1) nameGenerator 名字生成器
 *      （2） scopedProxy 作用域
 *      （3）scopeResolver 范围解析器
 *      （4）resourcePattern 资源加载规则。默认为**\/*.class
 *      （5）includeFilters
 *      （6）excludeFilters 排除
 *      （7）lazyInit 延迟加载
 *      （8）basePackages、basePackageClasses 如果没有则 默认当前报
 *  4-2、将上面的属性传给{@linkplain ClassPathBeanDefinitionScanner},调用 {@linkplain ClassPathBeanDefinitionScanner#doScan(String...)}
 *      （1）最终根据basePackages 拼为： classpath*:boot\/applicationListener\/test\/**\/*.class 交给 {@linkplain PathMatchingResourcePatternResolver}
 *              解析见 {@linkplain PathMatchingResourcePatternResolverStu.PathMatchingResourcePatternResolverStuClass}
 *       (2) 判断每个类 对于符合要求的 创建 {@linkplain ScannedGenericBeanDefinition} 返回
 *              判断条件 根据 includeFilters 与 excludeFilters 注解  //TODO
 *      （3） 将复合要求的bena定义注册到registry中，并返回新增加的bean定义
 *      （4）以当前解析到的class为对象，递归到第一步。循环检测。
 * 5、解析{@linkplain Import}
 * 6、解析{@linkplain ImportResource} 包含解析式的文件导入。
 * 7、解析{@linkplain @Bean}
 * 8、{@linkplain ConfigurationClassParser#processInterfaces(ConfigurationClass, ConfigurationClassParser.SourceClass)}
 *
 * 9、在所有导出完成后处理 延迟导入器 deferredImportSelectors
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/16 10:28 下午
 */
public class ConfigurationClassPostProcessorStu {


    /**
     * 关于 {@linkplain ComponentScan}
     * 根据 该 注解指定的路径，扫描当前类下的所有类。
     *
     * 1、basePackages、basePackageClasses 如果没有则 默认当前报
     *  示例见 {@linkplain boot.beanDefinitionRegistryPostProcessor.main.Main}
     *  虽然main方法在main的包下，但依然通过basePackages 指定到了test的包下。
     * 2、includeFilters 对于扫描到的类，复合要求的解析。
     *    默认包含 {@linkplain AnnotationTypeFilter}  代码中
     *   对于有一下注解的代码进行加载。
     *    1、包含{@linkplain Component}
     *    2、包含{@linkplain javax.annotation.ManagedBean}
     *    3、包含{@linkplain javax.inject.Named}
     *
     * 3、excludeFilters 对于扫描到的类，复合要求的排除。代码中：{@linkplain AbstractTypeHierarchyTraversingFilter}, SpringBootApplication 注解中默认为 {@linkplain TypeExcludeFilter} {@linkplain AutoConfigurationExcludeFilter}
     *      ComponentScanAnnotationParser：
     *      1、排除注解类
     *      AutoConfigurationExcludeFilter
     *      1、排除 Configuration 与 EnableAutoConfiguration
     *      TypeExcludeFilter
     *      1、//TODO
     *
     */
    public void ComponentScanTest(){



    }

    /**
     * 关于 {@linkplain PropertySource} //TODO
     * 可以加载配置文件或者 xml等资源
     *
     *
     */
    public void PropertySourceStu(){



    }

    /**
     * 关于 {@linkplain Import}
     * 资源导入。分为3中
     * 1、{@linkplain ImportSelector} 子类
     *      DeferredImportSelector 延迟加载，在所有bean定义加载完成后加载。
     *          方法将 需要的内容以{@linkplain DeferredImportSelector.Group.Entry} 对象返回，之后按照 {@linkplain Import} 处理
     *          默认：{@linkplain AutoConfigurationImportSelector} 在配置文件中检索 org.springframework.boot.autoconfigure.EnableAutoConfiguration，将需要的内容
     *      其他立即加载
     *
     *
     * 2、{@linkplain ImportBeanDefinitionRegistrar} 子类
     *       默认：{@linkplain AutoConfigurationPackages.Registrar}
     *       在所有包导入完成后进行，相当与一个后置处理器。
     * 3、普通类
     *      将引入类加入，并且将器加载到扫描中如果需要再扫描器包下其他类需要配合 ComponentScan
     *
     *
     */
    public void ImportStu(){



    }



}
