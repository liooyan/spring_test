package cn.lioyan.context.annotation;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;

/**
 * {@link org.springframework.context.annotation.ConfigurationClassPostProcessor} <br>
 *  BeanDefinitionRegistryPostProcessor 子类， 在用于文件扫描，并加载扫描到的所有beanDefinition
 *  1、 找到当前spring中所有带有 @Configuration 注解的类进行扫描
 *  2、 一共可以识别以下几个注解
 *  <li>@PropertySources 加载配置文件，将配置文件加载到环境中 </li>
 *  <li>@ComponentScans 扫描指定路径下的类，并将扫到的beanDefinition注到spring中，
 *      同时，也会将当前扫描到的beanDefinition 递归当前方法，识别它们的注解，过程见：{@link ClassPathBeanDefinitionScanner}</li>
 *  <li>@Import  导入其他组件，下面详细说明</li>
 *  <li>@ImportResource 通过xml导入其他组件</li>
 *  <li>@Bean 的注解</li>
 *  最后也会将@Configuration 注解的对象注入到spring 中<br>
 *  <br>
 *  <br>
 *  <br>
 *  <br>
 *  <br>
 * @Import 对于 其属性 value 内对象的不同，效果也不同<br>
 * 1、{@link org.springframework.context.annotation.ImportSelector} 子类<br>
 *  它的方法 selectImports 会返回 一些bean 的名称，我们会把这些类当作 有 @Import 注解的类<br>
 *<br>
 * 2、{@link DeferredImportSelector} 延迟加载，在上面的都再加玩后再调用，也是和ImportSelector 一样的逻辑
 *
 * 3、{@link ImportBeanDefinitionRegistrar} 和上面一样，调用时直接将registry 传给我们，让我们自己注入
 *
 *
 *  <br>
 *  <br>
 *  <br>
 *  <br>
 *  <br>
 *  <br>
 *  <br>
 *  <br>
 *  <br>
 *  <br>
 * @author com.lioyan
 * @date 2023/2/2  16:43
 */
public class ConfigurationClassPostProcessor
{
}
