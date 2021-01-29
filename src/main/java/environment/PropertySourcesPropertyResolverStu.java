package environment;

import org.junit.Test;
import org.springframework.core.env.*;
import org.springframework.util.PropertyPlaceholderHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * {@linkplain PropertySourcesPropertyResolver}
 * <p>
 * 为 {@linkplain PropertySources} 对象提供解析功能
 * 继承关系
 * {@linkplain PropertyResolver}
 * {@linkplain ConfigurablePropertyResolver}
 * {@linkplain AbstractPropertyResolver}
 * {@linkplain PropertySourcesPropertyResolver}
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/1/29 2:27 下午
 */
public class PropertySourcesPropertyResolverStu {

    /**
     * {@linkplain PropertyResolver}
     * 解析见 {@linkplain StandardEnvironmentStu.PropertyResolverStu}
     */
    public static class PropertyResolverStu {

    }

    /**
     * {@linkplain ConfigurablePropertyResolver}
     * 解析见 {@linkplain StandardEnvironmentStu.ConfigurablePropertyResolverStu}
     */
    public static class ConfigurablePropertyResolverStu {

    }

    /**
     * {@linkplain AbstractPropertyResolver}
     * 设置各个分割符的字符：
     * 前缀: ${
     * 后缀: }
     * 默认: 冒号
     * 并提供各自的设置方法
     * <p>
     * 其中 有 {@linkplain AbstractPropertyResolver#getPropertyAsRawString(String)} 方法为抽象方法
     * 其中 resolvePlaceholders 方法，所有占位符问题都委托给 {@linkplain PropertyPlaceholderHelper}
     */
    public static class AbstractPropertyResolverStu {

    }

    /**
     * {@linkplain PropertySourcesPropertyResolver}
     * 实现父亲类定义的 {@linkplain AbstractPropertyResolver#getPropertyAsRawString(String)} 方法
     * 其中通过遍历 PropertySources 中的每个集合来查找需要的属性值。
     * 其中关于占位符问题也是交给 {@linkplain PropertyPlaceholderHelper} 解决
     */
    public static class PropertySourcesPropertyResolverStuClass {

    }

    /**
     * 无继承关系， 主要解决属性 占位符的问题
     * {@linkplain PropertyPlaceholderHelper#replacePlaceholders(String, Properties)}
     * 通过递归的方法来实现 递归占位符问题
     */

    public static class PropertyPlaceholderHelperStu {

        /**
         * {@linkplain PropertyPlaceholderHelper#replacePlaceholders(String, Properties)}
         */
        @Test
        public void parseStringValueTest() {
            Map<String, String> property = new HashMap<>();
            property.put("test1", "test1");
            property.put("test2", "${test1}_test2");
            property.put("test3", "testqqqq");
            property.put("test1testqqqq", "test1+test2");

            //不设置解析默认值
            PropertyPlaceholderHelper propertyPlaceholderHelper = new PropertyPlaceholderHelper("${", "}");
            String s = propertyPlaceholderHelper.replacePlaceholders("${test1${test3}}+${test2}", property::get);
            System.out.println(s);

            //设置默认值的解析
            propertyPlaceholderHelper = new PropertyPlaceholderHelper("${", "}", ":", false);
            s = propertyPlaceholderHelper.replacePlaceholders("${test1${test3}}+${test2}+${asda:213}", property::get);
            System.out.println(s);

        }

    }

}
