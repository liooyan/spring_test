package cn.lioyan.boot.env;

import org.springframework.boot.env.EnvironmentPostProcessor;


/**
 * {@link org.springframework.boot.env.EnvironmentPostProcessorApplicationListener}
 *  配置 环境变量。 监听：ApplicationEnvironmentPreparedEvent 、ApplicationPreparedEvent、ApplicationFailedEvent
 * 通过spring.factories 加载{@link EnvironmentPostProcessor} 对象，对Environment 做后置出来， 优先度：MIN+10
 *
 * 在spring-boot 中 默认有6个
 //TODO  需要解析
 * @author com.lioyan
 * @date 2023/2/3  15:38
 */
public class EnvironmentPostProcessorApplicationListener
{
}
