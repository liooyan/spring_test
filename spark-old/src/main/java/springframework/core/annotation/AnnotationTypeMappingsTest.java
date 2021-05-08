package springframework.core.annotation;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.AnnotatedElement;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/17 12:18 上午
 */
public class AnnotationTypeMappingsTest {

    /**
     * 关于递归获取一个注解的所有父注解
     * 1、设置排除注解  "java.lang", "org.springframework.lang"
     * 2、最终 调用的方法是 jvm的方法：
     * AnnotatedElement annotatedElement = SpringBootApplication.class;
     * annotatedElement.getDeclaredAnnotations();
     *
     * @param args
     */
//    public static void main(String[] args) {
//
//        final AnnotationTypeMappings annotationTypeMappings = AnnotationTypeMappings.forAnnotationType(SpringBootApplication.class);
//        for (int i = 0; i < annotationTypeMappings.size(); i++) {
//            System.out.println(annotationTypeMappings.get(i).getAnnotationType());
//        }
//        AnnotatedElement annotatedElement = SpringBootApplication.class;
//        annotatedElement.getDeclaredAnnotations();
//
//    }
}
