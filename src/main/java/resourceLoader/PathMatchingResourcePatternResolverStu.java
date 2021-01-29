package resourceLoader;

import org.junit.Test;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

/**
 *
 * {@linkplain PathMatchingResourcePatternResolver}
 * 针对 ANT风格的资源路径加载类
 * Path 路径
 * Matching 匹配
 * Resource 资源
 * Pattern 模式
 * Resolver 解析器
 * 继承关系
 * |  {@linkplain ResourceLoader}
 * |  {@linkplain ResourcePatternResolver}
 * |  {@linkplain PathMatchingResourcePatternResolver}
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/1/29 5:28 下午
 */
public class PathMatchingResourcePatternResolverStu {
    /**
     *{@linkplain ResourceLoader}
     * 资源加载器，
     * 提供 获取资源 与获取classLoader 接口定义
     *
     * Loader 加载器
     */
    public static class ResourceLoaderStu{

    }

    /**
     * {@linkplain ResourcePatternResolver}
     *
     * 适用与ANT 风格的 资源解析器。
     * 定义了getResources 接口。通过路径返回所有匹配的资源
     *
     *
     */
    public static  class ResourcePatternResolverStu{

    }


    /**
     * {@linkplain PathMatchingResourcePatternResolver}
     *
     */
    public static class PathMatchingResourcePatternResolverStuClass{

        /**
         * 以 classpath* 开头的资源路径
         */
        @Test
        public void startClasspath_() throws IOException {

            PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();

            final Resource[] resources = pathMatchingResourcePatternResolver.getResources("classpath*:/META-INF/MANIFEST.MF");

            for (Resource resource:resources){
                System.out.println(resource.getURL().getPath());
            }


        }
        /**
         * 以 classpath 开头的资源路径
         */
        @Test
        public void startClasspath() throws IOException {

            PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();

            final Resource[] resources = pathMatchingResourcePatternResolver.getResources("classpath:/META-INF/MANIFEST.MF");

            for (Resource resource:resources){
                System.out.println(resource.getURL().getPath());
            }


        }
        /**
         * 以 / 开头的资源路径
         */
        @Test
        public void startPath() throws IOException {

            PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();

            final Resource[] resources = pathMatchingResourcePatternResolver.getResources("classpath:/META-INF/MANIFEST.MF");

            for (Resource resource:resources){
                System.out.println(resource.getURL().getPath());
            }


        }

        /**
         * 以 file: 开头的资源路径
         */
        @Test
        public void startFilePath() throws IOException {

            PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();

            final Resource[] resources = pathMatchingResourcePatternResolver.getResources("file:/META-INF/MANIFEST.MF");

            for (Resource resource:resources){
                System.out.println(resource.getURL().getPath());
            }
        }

        /**
         * 读取 网络 资源
         */
        @Test
        public void startHttpPath() throws IOException {

            PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();

            final Resource[] resources = pathMatchingResourcePatternResolver.getResources("https://github.com/lioyan1994111/spring_test");

            for (Resource resource:resources){

                final InputStream inputStream = resource.getInputStream();
                String result = new BufferedReader(new InputStreamReader(inputStream))
                        .lines().collect(Collectors.joining(System.lineSeparator()));
                System.out.println(result);
            }
        }

    }

}
