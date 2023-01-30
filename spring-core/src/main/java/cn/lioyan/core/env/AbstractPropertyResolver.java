package cn.lioyan.core.env;


import org.springframework.util.PropertyPlaceholderHelper;

/**
 * {@link org.springframework.core.env.AbstractPropertyResolver} <br>
 * 属性解析器的抽象实现<br>
 * <br>
 * 实现了：<br>
 * 1、 ConfigurableConversionService 默认使用{@link org.springframework.core.convert.support.DefaultConversionService}<br>
 * 2、定义了默认的：placeholderSuffix、placeholderPrefix、valueSeparator<br>
 * 3、实现了{@link  org.springframework.core.env.AbstractPropertyResolver#resolveNestedPlaceholders(String)} 方法<br>
 * 解析嵌套的属性值，通过 {@link  PropertyPlaceholderHelper} 实现<br>
 * 4、实现了{@link  org.springframework.core.env.AbstractPropertyResolver#convertValueIfNecessary(Object, Class)}<br>
 * 对于属性结果，进行类型转换，通过{@link org.springframework.core.convert.support.DefaultConversionService#convert(Object, Class)} 实现<br>
 * <br>
 * <br>
 * <br>
 *
 *
 *
 */
public class AbstractPropertyResolver {
}
