package cn.lioyan.core.io.support;

/**
 * {@link org.springframework.core.io.support.ResourcePatternResolver}
 * 继承自{@link org.springframework.core.io.ResourceLoader}
 * 是对ResourceLoader 的扩展，可以通过匹配模式获取资源，如：Ant样式。例如“/WEB-INF/*-context.xml”
 * 在使用中可以通过 org.springframework.context.ResourceLoaderAware 加载当前方法。
 * 定义了一个新的前缀：classpath*:
 * 核心方法：
 * Resource[] getResources(String locationPattern) throws IOException; 返回多个路径
 */
public interface ResourcePatternResolver {

}
