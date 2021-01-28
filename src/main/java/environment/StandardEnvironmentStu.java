package environment;


import org.springframework.core.convert.support.ConfigurableConversionService;
import org.springframework.core.env.*;

/**
 * 解读{@linkplain StandardEnvironment}<p>
 * Standard 标准<p>
 * Environment 环境<p>
 * Abstract 抽象<p>
 * 继承结构：<p>
 * |             {@linkplain PropertyResolver}<p>
 * | {@linkplain Environment}   {@linkplain ConfigurablePropertyResolver}<p>
 * |           {@linkplain ConfigurableEnvironment}<p>
 * |           {@linkplain AbstractEnvironment}<p>
 * |           {@linkplain StandardEnvironment}<p>
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/1/28 4:02 下午
 */
public class StandardEnvironmentStu {

    /**
     * {@linkplain PropertyResolver}
     * Property 属性
     * Resolver 解析其
     * 定义了 获取属性，和解析占位富接口{@linkplain PropertyResolver#resolvePlaceholders(String)}
     */
    private class PropertyResolverStu {

    }

    /**
     * {@linkplain Environment}
     * 其中定义了 与当前激活环境相关接口
     * 其中注释中说明：可以通过 {@linkplain AbstractEnvironment#ACTIVE_PROFILES_PROPERTY_NAME
     * "spring.profiles.active"} 或者 {@link ConfigurableEnvironment#setActiveProfiles(String...)}
     * 方法激活当前环境。
     * 包括：获取当前激活的环境、获取默认环境、判断给定的环境是否处于激活状态
     *
     */
    private class EnvironmentStu{

    }

    /**
     * {@linkplain ConfigurablePropertyResolver}
     * Configurable 可配置的
     * 设置与获取当前类的 {@linkplain ConfigurableConversionService} 属性
     * 占位符相关：
     * 并且设置占位符 的前缀、后缀、默认分割付 的字符
     * 对于无法解析的字符是否报错
     * 并且设置必须存在的属性值。同时校验该值
     *
     */
    private class ConfigurablePropertyResolverStu{


    }



}
