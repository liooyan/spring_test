package cn.lioyan.tomcat.catalina.connector;

import org.apache.catalina.connector.CoyoteAdapter;
import org.apache.coyote.http11.Http11NioProtocol;


/**
 * {@link org.apache.catalina.connector.Connector}
 * <pre>
 * 连接器，对于不同网络协议的解析方法。
 * 1 在实例化时，创建{@link  cn.lioyan.tomcat.coyote.ProtocolHandler} 对象
 *      默认情况下为：{@link Http11NioProtocol}
 * 2 在 初始化与启动时，分别执行Protocol 的初始化与启动
 *
 * - initInternal
 *      1、创建 ：{@link CoyoteAdapter} 用于 调用业务逻辑
 *
 *
 * </pre>
 *
 * @author com.lioyan
 * @date 2023/2/7  10:48
 */
public class Connector
{
}
