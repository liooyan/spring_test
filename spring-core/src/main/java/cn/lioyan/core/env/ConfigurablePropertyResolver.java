package cn.lioyan.core.env;

import org.springframework.core.convert.support.ConfigurableConversionService;

/**
 * {@link org.springframework.core.env.ConfigurablePropertyResolver}
 * 可配置的资源解析器，是对 {@link  PropertyResolver }接口的扩展
 * 定义了一些，可以关于属性解析的相关配置
 *
 * 1、 类型转换相关
 * <li>{@link org.springframework.core.env.ConfigurablePropertyResolver#getConversionService()}</li>
 * <li>{@link org.springframework.core.env.ConfigurablePropertyResolver#setConversionService(ConfigurableConversionService)}
 * 获取与返回ConfigurableConversionService ，也就是将string类型的资源转换为我们需要类型的数据
 * </li>
 * 2、 属性解析相关， 也就是我们常在配置中用到的${} 表达式
 * <li>setPlaceholderPrefix 设置表达式前缀</li>
 * <li>setPlaceholderSuffix 设置表达式后缀</li>
 * <li>setValueSeparator 默认值分隔符</li>
 * <li>setValueSeparator 对于表达式无法解析的，是否抛异常</li>
 * <li>validateRequiredProperties 严重解析式中是否有空值</li>
 *
 *
 */
public interface ConfigurablePropertyResolver {
}
