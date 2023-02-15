package cn.lioyan.web.servlet.handler;

import org.springframework.web.method.HandlerMethod;


/**
 * {@link org.springframework.web.servlet.handler.AbstractHandlerMethodMapping}
 *<pre>
 *     Handler 为 Method 的 mapping映射
 *
 *     将符合要求的Method 对象保存到{@link  org.springframework.web.servlet.handler.AbstractHandlerMethodMapping.MappingRegistry} 中
 *
 * 拥有 afterPropertiesSet 方法，创建完成后初始化
 *
 * 扫描所有spring的bean。
 *  通过 isHandler 方法（子类实现），判断当前类是否为我们要找的类.
 *  遍历类的所有方法，通过 getMappingForMethod 方法，找到我们需要注入的对象
 *
 *
 * getHandlerInternal
 *  通过url 找到对应的处理器，{@link HandlerMethod }
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/14  15:55
 */
public class AbstractHandlerMethodMapping

{
}
