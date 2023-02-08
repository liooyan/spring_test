package cn.lioyan.tomcat.catalina.connector;

import org.apache.catalina.mapper.MappingData;


/**
 * {@link org.apache.catalina.connector.CoyoteAdapter} <br>
 *<pre>
 *   postParseSuccess = postParseRequest(req, request, res, response);
 *   准备request， 如我们会将符合要求的{@link  org.apache.catalina.Host} 添加到 request 的{@link MappingData} 中
 *
 *    connector.getService().getMapper() 找到对应的host、context
 *
 *
 *
 *  通过 connector.getService().getContainer().getPipeline()  调用Pipeline 管道
 *
 *
 *  </pre>
 * @author com.lioyan
 * @date 2023/2/8  13:41
 */
public class CoyoteAdapter
{
}
