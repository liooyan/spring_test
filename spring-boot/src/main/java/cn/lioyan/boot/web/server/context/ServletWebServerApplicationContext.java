package cn.lioyan.boot.web.server.context;

import org.springframework.boot.web.server.WebServerFactory;


/**
 * {@link org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext}
 * <pre>
 *     web 类型的 上下文
 *     主要是{@link org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext#onRefresh}
 *     这里通过getWebServerFactory 方法 获取到{@link WebServerFactory} 默认为tomcat 类型
 *
 *      在创建 webServer 时， 注入 ServletContextInitializer 对象为：{@link org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext#selfInitialize}
 *
 *
 *
 * - {@link org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext#selfInitialize}
 //TODO
 *      1、 spring 注入 ：{@link org.springframework.web.context.support.ServletContextScope}
 *      2、
 *
 *
 * </pre>
 * @author com.lioyan
 * @date 2023/2/9  11:24
 */
public class ServletWebServerApplicationContext
{
}
