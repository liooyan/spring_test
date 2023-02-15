package cn.lioyan.boot.web.server;

import cn.lioyan.boot.web.embedded.tomcat.TomcatStarter;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletRegistrationBean;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletContextInitializer;


/**
 * {@link org.springframework.boot.web.servlet.ServletContextInitializerBeans}
 * <pre>
 *  从spring 中初始化ServletContextInitializer, 通过{@link TomcatStarter} 调用.
 * 构造函数中执行：
 *     1、在beanFactory中获取{@link ServletContextInitializer}.
 *     2、获取 {@link DispatcherServletRegistrationBean} 注册 Servlet
 *     3、获取{@link FilterRegistrationBean} 注册 Filter
 *
 *
 *
 * </pre>
 *
 * @author com.lioyan
 * @date 2023/2/9  11:50
 */

public class ServletContextInitializerBeans
{
}
