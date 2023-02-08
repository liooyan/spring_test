package cn.lioyan.tomcat.coyote.http11;

import cn.lioyan.tomcat.coyote.AbstractProtocol;
import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.apache.coyote.http11.Http11Processor;
import org.apache.tomcat.util.net.NioEndpoint;


/**
 * {@link org.apache.coyote.http11.Http11NioProtocol}
 * <pre>
 * {@link  AbstractProtocol} 子类
 *  - createProcessor 在父类{@link AbstractHttp11Protocol}实现，创建的Processor子类就是{@link Http11Processor}  关于http11的协议
 *  - 构造函数创建的是{@link NioEndpoint} 是对nio 的实现
 * </pre>
 * @author com.lioyan
 * @date 2023/2/7  11:19
 */
public class Http11NioProtocol
{
}
