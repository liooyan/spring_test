package cn.lioyan.core.env;


import org.springframework.core.env.MutablePropertySources;

/**
 * {@link  org.springframework.core.env.StandardEnvironment} <br>
 * {@link Environment}的实现<br>
 * 1、 属性解析器是通过{@link  PropertySourcesPropertyResolver} 代理实现。<br>
 * 2、 属性资产是通过{@link  MutablePropertySources} 实现。<br>
 * 默认添加了两个资产： <br>
 * <li>systemProperties</li>
 * <li>systemEnvironment</li>
 */
public class StandardEnvironment {
}
