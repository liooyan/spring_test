package cn.lioyan.tomcat.tomcat.util.net;

/**
 * {@link org.apache.tomcat.util.net.AbstractEndpoint}
 * <pre>
 * 建立监听端口，接受请求。具体对数据的读取与解析在{@link cn.lioyan.tomcat.coyote.ProtocolHandler} 中处理。
 * 主要分为两步，
 *      1 监听端口，建立连接。交给{@link Acceptor}处理。
 *      2 监听reader 事件。
 * - 两个泛型具体含义：
 *      S ： 接收到请求后，与客户端建立连接的 Socket 对象，
 *      U 服务端监听端口的 Socket 对象。
 *
 * - 定义方法：
 *  1、 {@link org.apache.tomcat.util.net.AbstractEndpoint#bind}  创建服务端端口监听绑定端口
 *  2、 同样定义了生命周期接口 init 和start 相关方法
 *
 * - serverSocketAccept
 *      获取连接事件，抽象方法，子类实现
 *
 * - setSocketOptions
 *      设置一个新的连接，抽象方法，子类实现
 *
 *  - processSocket
 *      处理读或写事件，{@link org.apache.tomcat.util.net.AbstractEndpoint#processSocket}
 *      通过线程池，在新的线程中交给{@link SocketProcessorBase} 处理
 *
 *
 * - startAcceptorThread
 *      创建{@link Acceptor} 对象，并开启一个新线程执行
 *
 *  - setHandler
 * </pre>
 * @author com.lioyan
 * @date 2023/2/7  11:34
 */
public class AbstractEndpoint
{
}
