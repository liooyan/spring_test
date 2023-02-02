package cn.lioyan.context.suport;

/**
 * {@link org.springframework.context.support.AbstractApplicationContext} <br>
 * 上下文的抽象实现，实现ConfigurableApplicationContext 中的一下配置<br>
 *  主要方法为： refresh() 刷新上下文<br>
 * {@link org.springframework.context.support.AbstractApplicationContext#refresh()}<br>
 *<br>
 * prepareRefresh(); 准备刷新上下文：创建 Environment对象。<br>
 * obtainFreshBeanFactory(); 获取 BeanFactory ，这里用的{@link org.springframework.beans.factory.support.DefaultListableBeanFactory}<br>
 * prepareBeanFactory 填充BeanFactory， 设置了：StandardBeanExpressionResolver、ResourceEditorRegistrar等内容<br>
 * postProcessBeanFactory 在 填充完beanFactory后，还没有加载bean对象时，当前类为空实现，子类有修改<br>
 * invokeBeanFactoryPostProcessors 调用 BeanFactoryPostProcessors<br>
 * registerBeanPostProcessors 注册 BeanPostProcessors<br>
 * onRefresh 在单例对象刷新前调用，web容器就是在这里创建的<br>
 * registerListeners 注册 ApplicationListener 到当前 beanFeactory中<br>
 * finishBeanFactoryInitialization 实例化单例对象<br>
 * finishRefresh 完成刷新， 发送 ContextRefreshedEvent 事件<br>
 * <br>
 * <br>
 * 其中关于： BeanFactoryPostProcessors、BeanPostProcessors、ApplicationListener<br>
 * 首先是将ApplicationContext自身的对象进行注册，之后会从BeanFactory 中查询是否有这类型的bean，然后将他实例化，进行注册<br>
 * <br>
 * <br>
 * @author com.lioyan
 * @date 2023/2/2  13:41
 */
public class AbstractApplicationContext
{
}
