package context;

/**
 * 刷新上下文 refresh()
 * {@linkplain org.springframework.context.support.AbstractApplicationContext}
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 *
 * 属性准备
 * prepareRefresh();
 *
 * 获取beanFactory
 * 在使用xml context 上时，会加载bean定义
 * ConfigurableListableBeanFactory beanFactory = obtainFreshBeanFactory();
 *
 * 准备beanFactory
 * 比如:
 * 1、配置bean表达式解析式
 * 2、属性编辑器（转换器）的注册表
 * 3、几个bean后置处理器
 * 4、bean自动加载忽略接口
 * prepareBeanFactory(beanFactory);
 *
 * beanFactory的后置处理器 空实现
 * postProcessBeanFactory(beanFactory);
 *
 * 从各种地方获取与执行BeanFactoryPostProcessor
 * invokeBeanFactoryPostProcessors(beanFactory);
 *
 * 获取并向beanFactory 中 注册 BeanPostProcessor
 * registerBeanPostProcessors(beanFactory);
 *
 * 国际化
 * initMessageSource();
 *
 * 从上下文中获取 ApplicationEventMulticaster
 * initApplicationEventMulticaster();
 *
 * 空实现，允许在上下文刷新前执行内容。
 * onRefresh();
 *
 * 将监听时间注册到 ApplicationEventMulticaster中
 * registerListeners();
 *
 * 刷新bean
 * finishBeanFactoryInitialization(beanFactory);
 *
 * 发布完成刷新的事件
 * finishRefresh();
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/4 11:53 上午
 */
public class RefreshContext {
}
