package cn.lioyan.web.servlet.handler;

import cn.lioyan.web.servlet.HandlerExecutionChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsProcessor;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * {@link org.springframework.web.servlet.handler.AbstractHandlerMapping}
 *<pre>
 * 在初始化的时候， 从spirng中注入：{@link  MappedInterceptor}
 *
 *
 *  {@link org.springframework.web.servlet.handler.AbstractHandlerMapping#getHandler}
 *  1、调用 getHandlerInternal 获取到 handler 子类实现
 *  2、获取符合要求的{@link HandlerInterceptor}
 *  3、组装为{@link HandlerExecutionChain}
 *  4、添加{@link CorsProcessor} 在请求前执行 {@link CorsProcessor#processRequest} 方法
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/14  11:52
 */
public class AbstractHandlerMapping
{
}
