package cn.lioyan.tomcat.catalina.util;

import cn.lioyan.tomcat.catalina.Lifecycle;


/**
 * {@link org.apache.catalina.util.LifecycleBase}
 * <pre>
 * {@link Lifecycle } 的抽象实现
 * 1、实现对监听器的管理
 * 2、init、start、stop 等接口实现运行状态的切换，并分别使用invalidTransition、startInternal、stopInternal 这几个方法，让子类实现
 * 3、 在start方法中，如果还没有初始化，就先进行init方法，如果启动失败，就调用stop方法
 *
 *
 * </pre>
 * @author com.lioyan
 * @date 2023/2/7  10:43
 */
public class LifecycleBase
{
}
