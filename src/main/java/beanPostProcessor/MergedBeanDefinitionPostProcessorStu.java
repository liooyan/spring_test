package beanPostProcessor;


import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

/**
 *
 * 在bean刚new 出来，但未进行填充内容事调用
 * spring-boot 默认中包含
 * {@link CommonAnnotationBeanPostProcessor} 解析见{@link CommonAnnotationBeanPostProcessorStu}
 * {@link AutowiredAnnotationBeanPostProcessor} 解析见{@link AutowiredAnnotationBeanPostProcessorStu}
 * 在此处基本都是对于 注解的解析。
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/7 5:50 下午
 */
public class MergedBeanDefinitionPostProcessorStu {


    /**
     * {@linkplain org.springframework.context.support.ApplicationListenerDetector}
     *
     *
     */
    public static class ApplicationListenerDetectorStu{


    }

    /**
     * {@link CommonAnnotationBeanPostProcessor}
     * 检测每个方法是否包含 @PostConstruct和@PreDestroy 注解。并将其封装保存在
     * {@linkplain CommonAnnotationBeanPostProcessor#lifecycleMetadataCache}
     *
     * 其中在 postProcessBeforeInitialization 方法中将字段注入
     *
     */
    public static class CommonAnnotationBeanPostProcessorStu{


    }


    /**
     *
     *
     * 对方法检测 Autowired 和 Value 、javax.inject.Inject注解
     *
     *
     *
     */
    public static class AutowiredAnnotationBeanPostProcessorStu{


    }
}
