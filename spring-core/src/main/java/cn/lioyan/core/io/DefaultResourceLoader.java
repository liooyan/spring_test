package cn.lioyan.core.io;

import org.springframework.core.io.Resource;

/**
 * {@link org.springframework.core.io.DefaultResourceLoader}<p>
 * <p>
 * 默认的资源加载器，继承自{@link  org.springframework.core.io.ResourceLoader},也是{@link org.springframework.core.io.ResourceEditor} 默认使用的加载器<p>
 *<p>
 * 它是以 class为上下文的一个资源加载器,加载的都是class上下文的文件<p>
 * 同样，可以使用file: 来指定加载本地文件，或者其他url协议路径
 * 最后 返回的都是 ：{@link org.springframework.core.io.ClassPathResource} 对象，解析见{@link  ClassPathResource}<p>
 */
public class DefaultResourceLoader {
    public static void main(String[] args) {
        org.springframework.core.io.DefaultResourceLoader resourceLoader = new  org.springframework.core.io.DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("test.txt");
        System.out.println(resource.exists());
    }
}
