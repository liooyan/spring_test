package cn.lioyan.boot.web.embedded.tomcat;

import org.springframework.boot.web.servlet.ServletContextInitializer;


/**
 * {@link org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory}
 *<pre>
 *     {@link  TomcatWebServer} 的工厂类
 * 主要实现：{@link org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory#getWebServer(ServletContextInitializer...)}
 *      参数为{@link ServletContextInitializer}
 *      主要对于tomcat 的各种组件的定制
 *      其中：通过{@link TomcatStarter} 对象将{@link ServletContextInitializer} 转换为 ServletContainerInitializer
 *
 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/9  10:37
 */
public class TomcatServletWebServerFactory
{
}
