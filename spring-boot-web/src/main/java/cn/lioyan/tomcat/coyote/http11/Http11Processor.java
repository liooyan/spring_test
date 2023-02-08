package cn.lioyan.tomcat.coyote.http11;

import org.apache.coyote.Adapter;
import org.apache.tomcat.util.net.SocketWrapperBase;


/**
 * {@link org.apache.coyote.http11.Http11Processor}
 * <pre>
 * 将进去解析为 {@link  org.apache.coyote.Request} 对象， 并调用 {@link  Adapter}  执行业务代码
 *  Adapter 为构造函数传入
 *  Request 为自己new
 *  对于文本的继续在{@link  Http11InputBuffer} 中完成
 *
 *
 *
 *  - {@link org.apache.coyote.http11.Http11Processor#service(SocketWrapperBase)}
 *   1、 调用 Http11Processor 的parseRequestLine 解析url 和url中的参数保存在Request 对象
 *   2、调用 inputBuffer.parseHeaders() 解析请求头
 *
 *
 *  - getAdapter().service(request, response);
 *   最后调用 {@link Adapter} 的 service 方法，执行业务代码
 *
 * </pre>
 * @author com.lioyan
 * @date 2023/2/8  11:46
 */
public class Http11Processor
{
}
