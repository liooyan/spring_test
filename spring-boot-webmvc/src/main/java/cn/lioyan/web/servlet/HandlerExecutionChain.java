package cn.lioyan.web.servlet;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * {@link org.springframework.web.servlet.HandlerExecutionChain}
 * <pre>
 * 内部包含：
 * 1、 请求处理器 handler
 * 2、多个 拦截器：{@link HandlerInterceptor}
 *
 *
 * 在{@link DispatcherServlet} 中， 通过{@link  HandlerMapping} 构建 此对象
 *
 * 1、并且在方法执行前调用{@link  HandlerInterceptor#preHandle} 如果返回false 就不执行处理方法，直接返回
 * 2、并且在方法执行后调用{@link  HandlerInterceptor#postHandle}
 *
 *
 * </pre>
 * @author com.lioyan
 * @date 2023/2/14  13:45
 */
public class HandlerExecutionChain
{
}
