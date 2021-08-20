package org.springframework.context.annotation;

import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/17 12:45 上午
 */
public class AnnotationConfigUtilsTest {

    /***
     * 关于 如何通过class文件 判断是否包含需要的注解与获取器注解中的变量
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        Set<AnnotationAttributes> annotationAttributes =  AnnotationConfigUtils.attributesForRepeatable(
                AnnotationMetadata.introspect(boot.applicationListener.test.Main.class), ComponentScans.class, ComponentScan.class);
        System.out.println(annotationAttributes);
    }
}
