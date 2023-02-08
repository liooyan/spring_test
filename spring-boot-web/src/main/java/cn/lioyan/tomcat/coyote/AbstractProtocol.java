package cn.lioyan.tomcat.coyote;

import org.apache.coyote.Processor;
import org.apache.tomcat.util.net.AbstractEndpoint;


/**
 * {@link org.apache.coyote.AbstractProtocol}
 * <pre>
 *     ProtocolHandler 的抽象实现，
 *     1、 网络端口的监听、数据reader事件的监听，都是通过{@link  cn.lioyan.tomcat.tomcat.util.net.AbstractEndpoint} 实现。通过 规则函数传入
 *     2、 对于具体的数据处理，也就是 {@link AbstractEndpoint.Handler} 对象，则是 AbstractProtocol 的子类 {@link org.apache.coyote.AbstractProtocol.ConnectionHandler}
 *     3、 Executor 线程池，则是直接转发给AbstractEndpoint
 *
 * - ConnectionHandler
 *      对于协议处理交给{@link  Processor}
 *      Processor 创建通过 {@link org.apache.coyote.AbstractProtocol#createProcessor()} 创建
 *
 *
 * </pre>
 * @author com.lioyan
 * @date 2023/2/7  11:23
 */
public class AbstractProtocol
{
}
