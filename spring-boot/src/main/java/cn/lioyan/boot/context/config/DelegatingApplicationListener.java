package cn.lioyan.boot.context.config;

/**
 * {@link org.springframework.boot.context.config.DelegatingApplicationListener} <br>
 * 委托 ApplicationListener。<br>
 * 从 ApplicationEnvironmentPreparedEvent 事件开始，从Environment 的context.listener.classes 中加载 配置的监听器。<br>
 * 并在以后的事件中委托调用<br>
 * @author com.lioyan
 * @date 2023/2/3  15:29
 */
public class DelegatingApplicationListener
{
}
