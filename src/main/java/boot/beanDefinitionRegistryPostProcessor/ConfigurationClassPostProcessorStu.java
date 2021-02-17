package boot.beanDefinitionRegistryPostProcessor;

import org.springframework.context.annotation.*;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;
import resourceLoader.PathMatchingResourcePatternResolverStu;

import java.util.function.Predicate;

/**
 * {@linkplain ConfigurationClassPostProcessor}
 *
 * 1、最终调用的是 {@linkplain org.springframework.context.annotation.ConfigurationClassParser#doProcessConfigurationClass(ConfigurationClass, ConfigurationClassParser.SourceClass, Predicate)}
 * 2、 第一步判断是否包含{@linkplain Component} 注解 解析其子类 //TODO
 * 3、第二步判断是否包含{@linkplain PropertySources} 与 {@linkplain PropertySources}  //TODO
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
 * 6、解析{@linkplain ImportResource}
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




}
