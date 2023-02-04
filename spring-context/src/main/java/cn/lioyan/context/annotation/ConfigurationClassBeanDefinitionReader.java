package cn.lioyan.context.annotation;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.Conditional;

/**
 * {@link  org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader}<br>
 * loadBeanDefinitionsForConfigurationClass 方法：判断通过注解 Configuration 注入的bean条件<br>
 * registerBeanDefinitionForImportedConfigurationClass 判断通过 注解 @Import 注入的bean条件<br>
 * loadBeanDefinitionsForBeanMethod 判断通过 注解 @Bean 注入的bean条件<br>
 * <br>
 * <br>
 * <br>
 * 上面的所有方法都是通过 {@link org.springframework.context.annotation.ConditionEvaluator} 进行判断<br>
 * 所有内容都是通过{@link Conditional} 注解里的value值进行判断 它的值为{@link Condition} 子类<br>
 *
 * <br>
 * <br>
 * <br>
 *
 */
public class ConfigurationClassBeanDefinitionReader {
}
