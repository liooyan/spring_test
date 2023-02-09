package cn.lioyan.tomcat.tomcat.util.descriptor.web;

import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.FilterMap;

import javax.servlet.Filter;


/**
 * {@link org.apache.tomcat.util.descriptor.web.FilterDef}
 *<pre>web.xml 配置中的 filter元素
 * 内部包含 {@link Filter} 对象
 *   <filter>
 *     <filter-name>loginFilter</filter-name>
 *     <filter-class>com.kgc.web.filter.LoginFilter</filter-class>//过滤器的类所在位置
 *   </filter>
 * FilterDef 与 {@link FilterMap} 共同组成过滤器， 放到对应的 {@link Context} 中
 * </pre>
 * @author com.lioyan
 * @date 2023/2/9  13:49
 */
public class FilterDef
{
}
