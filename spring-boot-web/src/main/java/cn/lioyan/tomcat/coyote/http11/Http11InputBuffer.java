package cn.lioyan.tomcat.coyote.http11;

import org.apache.tomcat.util.buf.MessageBytes;


/**
 * {@link org.apache.coyote.http11.Http11InputBuffer}
 * <pre>
 * 解析网络的 InputBuffer， 将解析结果保存在{@link org.apache.coyote.Request} 中
 * 
 * 
 * -  {@link org.apache.coyote.http11.Http11InputBuffer#parseRequestLine(boolean, int, int)}
 *  对于 http 协议第一行内容的解析，如：GET /search?hl=zh-CN HTTP/1.1  的内容解析
 *  对于 url中的参数，都是通过 request 中的{@link  MessageBytes} 进行保存
 *
 * -  {@link org.apache.coyote.http11.Http11InputBuffer#parseHeaders}
 *
 *  </pre>
 * @author com.lioyan
 * @date 2023/2/7  14:53
 */
public class Http11InputBuffer
{
}
