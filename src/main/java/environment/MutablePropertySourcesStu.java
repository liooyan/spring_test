package environment;

import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.core.env.PropertySources;

/**
 * 解读 {@linkplain MutablePropertySources}
 * <p>
 * 继承关系
 * |  {@linkplain PropertySources}
 * |  {@linkplain MutablePropertySources}
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/1/29 2:20 下午
 */
public class MutablePropertySourcesStu {

    /**
     * {@linkplain PropertySources}
     * Property 属性
     * Sources  数据资源
     * 整合 多个{@linkplain PropertySource}
     * 定义 遍历、通过名称获取 PropertySource 等接口
     */
    public static class PropertySourcesStu {

    }

    /**
     * {@linkplain MutablePropertySources}
     * Mutable 可变的
     * 接口的默认实现
     * 通过list保存多个 PropertySource ，通过遍历list 支持各个方法
     *
     */
    public static class MutablePropertySourcesStuClass {

    }
}

