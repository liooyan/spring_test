package cn.lioyan.beans.factory.config;

/**
 * {@link org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor}
 * 特殊的{@link BeanFactoryPostProcessor}
 * 在触发BeanFactoryPostProcessor 前调用，可以对 BeanDefinitionRegistry 进行修改，将自己的BeanDefinition 注入到BeanDefinitionRegistry 中
 * @author com.lioyan
 * @date 2023/2/2  14:45
 */
public interface BeanDefinitionRegistryPostProcessor
{
}
