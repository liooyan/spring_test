package cn.lioyan.core.io;

import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * {@link org.springframework.core.io.ClassPathResource}<p>
 *     通过指定 ClassLoader对象，加载当前ClassLoader 上下文的文件<p>
 *    其核心方法为：this.classLoader.getResourceAsStream(this.path)<p>
 *
 *
 */
public class ClassPathResource {
    public static void main(String[] args) throws IOException {
        org.springframework.core.io.ClassPathResource classPathResource = new org.springframework.core.io.ClassPathResource("test.txt", ClassPathResource.class.getClassLoader());
        String path = classPathResource.getFile().getPath();
        System.out.println(path);
    }
}
