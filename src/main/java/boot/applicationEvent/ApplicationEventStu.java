package boot.applicationEvent;

import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * {@linkplain ApplicationEvent}
 * event   事件
 * 在spring 的不同时间点上会触发不同的事件。
 * 向不同 {@linkplain ApplicationListener} 发送该事件。
 * 本class 为解析spring-boot初始化的时候，发送的不同事件。
 *
 * 1、starting 启动事件。
 *  该事件在spring刚启动的时候发送。解析见：{@linkplain ApplicationStartingEventStu}
 * 2、environmentPrepared 环境准备完成
 *  当创建完成 Environment后触发该事件。解析见：{@linkplain ApplicationEnvironmentPreparedEventStu}
 * 3、contextPrepared context 创建完成后
 *  当创建完成 context后触发该事件，解析见：{@linkplain ApplicationContextInitializedEventStu}
 * 4、contextLoaded context load完成后
 *  当context load执行完成后触发，解析见：{@linkplain ApplicationPreparedEventStu}
 * 5、上下文refreshed 完成后
 *  触发事件：{@linkplain ContextRefreshedEvent}
 * 6、started spring 启动后
 *  触发事件：{@linkplain ApplicationStartedEvent}
 * 7、running spring正在运行事件
 *  触发事件：{@linkplain ApplicationReadyEvent}
 *
 *
 *
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:46 下午
 */
public class ApplicationEventStu {

    /**
     * {@linkplain ApplicationStartingEvent}
     * 当前事件有3各参数：
     * application springboot的启动类
     * args  springboot的参数
     * bootstrapContext spring的上下文
     *
     */
    public static class ApplicationStartingEventStu{

    }

    /**
     * {@linkplain ApplicationEnvironmentPreparedEvent}
     * 当前事件有3各参数：
     * application springboot的启动类
     * args  springboot的参数
     * bootstrapContext spring的上下文
     * environment 环境
     *
     */
    public static class ApplicationEnvironmentPreparedEventStu{

    }

    /**
     * {@linkplain ApplicationContextInitializedEvent}
     * 当前事件有3各参数：
     * application springboot的启动类
     * args  springboot的参数
     * bootstrapContext spring的上下文
     *
     */
    public static class ApplicationContextInitializedEventStu{

    }


    /**
     * {@linkplain ApplicationPreparedEvent}
     * 当前事件有3各参数：
     * application springboot的启动类
     * args  springboot的参数
     * bootstrapContext spring的上下文
     *
     */
    public static class ApplicationPreparedEventStu{

    }


}
