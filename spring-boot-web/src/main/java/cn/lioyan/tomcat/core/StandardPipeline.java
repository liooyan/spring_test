package cn.lioyan.tomcat.core;

import org.apache.catalina.core.ContainerBase;


/**
 * {@link org.apache.catalina.core.StandardPipeline}
 * <pre>
 * 默认的管道对象，在每个 {@link ContainerBase}  中都有一个自己的Pipeline 对象。
 * 它内部维护一个{@link org.apache.catalina.Valve} Valve 是链式结构。
 * Pipeline 在 setValue 时， 通过 将新添加的 value 自动组成 链式。
 *
 *
 * </pre>
 * @author com.lioyan
 * @date 2023/2/8  15:15
 */
public class StandardPipeline
{
}
