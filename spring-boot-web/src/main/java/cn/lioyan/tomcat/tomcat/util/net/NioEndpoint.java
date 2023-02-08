package cn.lioyan.tomcat.tomcat.util.net;

import java.nio.channels.SelectionKey;


/**
 * {@link org.apache.tomcat.util.net.NioEndpoint}
 * <pre>
 * 针对 nio 的 endpoint
 * - bind 方法
 *  调用{@link org.apache.tomcat.util.net.NioEndpoint#initServerSocket}
 *  通过 ServerSocketChannel.open() 创建serverSock
 *  serverSock.bind 端口
 *
 * - serverSocketAccept 的实现
 *      通过 serverSock.accept() 获取新的连接
 *
 *
 * - setSocketOptions
 *      接收的Socket对象后，将其封装为{@link org.apache.tomcat.util.net.NioEndpoint.NioSocketWrapper}
 *      之后放到 events 队列中
 *
 * - {@link org.apache.tomcat.util.net.NioEndpoint#startInternal}
 *      创建子类 Poller,开启新线程，
 *      同时 开启了{@link Acceptor}
 *
 * - {@link org.apache.tomcat.util.net.NioEndpoint.Poller}
 *      这里也是一个循环，
 *      首先调用{@link org.apache.tomcat.util.net.NioEndpoint.Poller#events()} 做如下处理：
 *          获取events队列里的数据。进行事件处理，处理过程，如下：
 *          - 如果 事件为 OP_REGISTER ，连接事件，则将当前Socket的OP_READ 事件注册到自己的 selector 上
 *      之后从selector内获取事件，调用{@link org.apache.tomcat.util.net.NioEndpoint.Poller#processKey(SelectionKey, org.apache.tomcat.util.net.NioEndpoint.NioSocketWrapper)} 进行处理
 *      最终：交给 父类 {@link org.apache.tomcat.util.net.AbstractEndpoint#processSocket}    处理
 *
 *
 * - {@link org.apache.tomcat.util.net.NioEndpoint.SocketProcessor }
 *      在新的线程中，对读写事件的处理
 *      具体的处理过程交给 Handler 处理
 * - {@link org.apache.tomcat.util.net.AbstractEndpoint.Handler} 具体处理协议的方法
 * </pre>
 *
 * @author com.lioyan
 * @date 2023/2/7  11:48
 */
public class NioEndpoint
{
}
