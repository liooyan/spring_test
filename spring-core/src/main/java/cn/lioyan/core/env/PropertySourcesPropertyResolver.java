package cn.lioyan.core.env;

import org.springframework.core.env.PropertySources;

/**
 *
 * {@link org.springframework.core.env.PropertySourcesPropertyResolver}
 * {@link AbstractPropertyResolver} 的实现
 * 内部保存{@link  PropertySources}对象
 *
 * 当调用getProperty 时，遍历PropertySources 的每个PropertySource， 获取属性值，当有任意一个时，返回结果。
 *
 * 同时调用父类的resolveNestedPlaceholders 和 convertValueIfNecessary ，将结果进行解析
 *
 *
 */
public class PropertySourcesPropertyResolver {
}
