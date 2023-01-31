package cn.lioyan.core.env;


/**
 *
 * {@link org.springframework.core.env.PropertySource} <br>
 * 属性资源的基础接口定义，以k-v格式保存某一批 属性值。如：某个 配置文件、系统属性、java属性。都可以是一个PropertySource<br>
 *<br>
 * 方法： getProperty ：通过 key 获取属性值。<br>
 * 一般不会单独使用，而是通过{@link  PropertySources} ，聚合所有属性资源一起使用。<br>
 *
 */
public interface PropertySource {
}
