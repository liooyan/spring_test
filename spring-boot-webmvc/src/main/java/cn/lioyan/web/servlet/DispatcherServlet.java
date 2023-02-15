package cn.lioyan.web.servlet;

import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.theme.FixedThemeResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


/**
 * {@link org.springframework.web.servlet.DispatcherServlet}
 * <pre>
 * spring mvc 默认的 servlet.所有的请求都是经过这个类进行处理的
 *
 *
 * 初始化：在第一次接收到请求时，调用：{@link   org.springframework.web.servlet.DispatcherServlet#onRefresh}
 *  1、从spring中获取{@link  MultipartResolver} ， 在 {@link MultipartAutoConfiguration} 注入。
 *  2、获取{@link  LocaleResolver} 对象，实现本地化
 *  3、获取{@link FixedThemeResolver} 主题处理，在老项目中用于判断时移动还是pC端
 *  4、获取{@link HandlerMapping}，用于 请求与处理器的映射
 *  5、获取{@link HandlerAdapter}，用于 用于 参数绑定与返回值处理
 *  6、获取{@link HandlerExceptionResolver}，用于 异常处理
 *  7、获取{@link RequestToViewNameTranslator}，
 *  8、获取{@link ViewResolver}，
 *
 *
 * 处理请求方法 {@link org.springframework.web.servlet.DispatcherServlet#doDispatch}
 *1、 判断是否为文件上传，使用{@link MultipartResolver}
 * 2、通过{@link  HandlerMapping} 获取对应的 {@link HandlerExecutionChain}
 * 3、找到对应的{@link HandlerAdapter} 。
 * 4、通过{@link HandlerAdapter} 处理请求，并获取到{@link ModelAndView}
 * 6、 通过{@link ViewResolver} 获取到对应的{@link  View}。 并通过{@link View#render(Map, HttpServletRequest, HttpServletResponse)} 处理结果
 * 5、如果有异常，则是通过{@link HandlerExceptionResolver} 获取处理异常的{@link ModelAndView} 对象
 *
 *
 *
 * </pre>
 * @author com.lioyan
 * @date 2023/2/14  9:30
 */
public class DispatcherServlet
{
}
