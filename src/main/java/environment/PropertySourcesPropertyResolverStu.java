package environment;

import org.springframework.core.env.*;
import org.springframework.util.PropertyPlaceholderHelper;

/**
 * {@linkplain PropertySourcesPropertyResolver}
 *
 * 为 {@linkplain PropertySources} 对象提供解析功能
 * 继承关系
 * {@linkplain PropertyResolver}
 * {@linkplain ConfigurablePropertyResolver}
 * {@linkplain AbstractPropertyResolver}
 * {@linkplain PropertySourcesPropertyResolver}
 * @author top.lioyan
 * @version 1.0
 * @date 2021/1/29 2:27 下午
 */
public class PropertySourcesPropertyResolverStu {

    /**
     * {@linkplain PropertyResolver}
     * 解析见 {@linkplain StandardEnvironmentStu.PropertyResolverStu}
     */
    public class PropertyResolverStu{

    }

    /**
     * {@linkplain ConfigurablePropertyResolver}
     * 解析见 {@linkplain StandardEnvironmentStu.ConfigurablePropertyResolverStu}
     */
    public class PConfigurablePropertyResolverStu{

    }

    /**
     * {@linkplain AbstractPropertyResolver}
     * 设置各个分割符的字符：
     * 前缀: ${
     * 后缀: }
     * 默认: 冒号
     * 并提供各自的设置方法
     *
     * 其中 有 {@linkplain AbstractPropertyResolver#getPropertyAsRawString(String)} 方法为抽象方法
     * 交由子类实现，此方法为根据 key 获取对应的 值，不解决 占位符问题。
     * 所有占位符问题都委托给 {@linkplain PropertyPlaceholderHelper}
     *
     *
     */
    public class AbstractPropertyResolverStu{

    }

    /**
     * {@linkplain PropertySourcesPropertyResolver}
     * 实现父亲类定义的 {@linkplain AbstractPropertyResolver#getPropertyAsRawString(String)} 方法
     * 其中通过遍历 PropertySources 中的每个集合来查找需要的属性值。
     *
     *
     */
    public class  PropertySourcesPropertyResolverStuClass{

    }

}
