package cn.lioyan.core.io.support;

import cn.lioyan.core.io.ResourceLoader;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * {@link org.springframework.core.io.support.PathMatchingResourcePatternResolver} <p>
 * 路径匹配资源解析器。 是 {@link  ResourceLoader}的实现， <p>
 * <p>
 * 使用的语法解析器是：{@link  org.springframework.util.AntPathMatcher} <p>
 * {@link org.springframework.core.io.support.PathMatchingResourcePatternResolver#getResources(String)} 方法解析： <p>
 * 1 、classpath*: 开头，加载所有jar内的文件
 * 2、如果路径中保护ant语法就通过 findPathMatchingResources 解析出所有符合语法的数据
 * 3、否则就正常加载
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 *{@link org.springframework.core.io.support.PathMatchingResourcePatternResolver#findPathMatchingResources(String)}<p>
 *<p>
 * 首先将路径以第一个 * 截取， 递归调用getResources 方法 。获取到所有可能符合要求的资源路径。<p>
 * 后面将这些所有路径全部继续匹配<p>
 */
public class PathMatchingResourcePatternResolver {

    public static void main(String[] args) throws IOException {
        org.springframework.core.io.support.PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new org.springframework.core.io.support.PathMatchingResourcePatternResolver();
        Resource[] resources = pathMatchingResourcePatternResolver.getResources("classpath*:/META-INF/*.txt");
        System.out.println(resources.length);
    }
}
