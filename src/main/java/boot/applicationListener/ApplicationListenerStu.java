package boot.applicationListener;

import boot.applicationEvent.ApplicationEventStu;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.GenericApplicationListener;
import org.springframework.context.event.GenericApplicationListenerAdapter;
import org.springframework.context.event.SmartApplicationListener;

/**
 * {@linkplain ApplicationListener}
 * Application 应用
 * Listener 监听器
 *
 *
 * 1、获取
 *  读取 文件 META-INF/spring.factories 下的 key为 : org.springframework.context.ApplicationListener
 *  其中 值必为：{@linkplain ApplicationListener} 子类
 * 2、各监听过程
 *  对于不同时间段。spring 会发送对应的事件，
 *  见 {@linkplain ApplicationEventStu}
 *
 * 3、是否发送筛选
 * 3-1 一方面通过 {@linkplain GenericApplicationListener} 的子类，来判断事件类型与事件源判断是否需要发送事件。
 * 3-2 另一方面通过 {@linkplain GenericApplicationListenerAdapter} 根据监听器的泛型来确定当前事件是否发送。
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:13 下午
 */
public class ApplicationListenerStu {


    /**
     * {@linkplain GenericApplicationListener}
     *
     * Generic 通用的
     *
     * 在父类基础上添加了2各方法
     * 1、supportsEventType 判断当前监听器是否支持给定的事件类型，只有返回true时才会发送事件
     * 2、supportsSourceType 判断当前监听器是否支持给定的事件源头。只有返回true时才会发送事件
     *      在springboot 启动时，该事件源是：{@linkplain SpringApplication}
     */
    public static class  GenericApplicationListenerStu{



    }
    /**
     * {@linkplain GenericApplicationListenerAdapter}
     * Adapter 适配器
     * 见非 GenericApplicationListener 子类的监听器转换为具有 supportsEventType、supportsSourceType 方法的类。
     *
     * 具体实现：
     * {@linkplain SmartApplicationListener} 如果是该子类。与 GenericApplicationListener 相同。其他情况
     * 1、supportsEventType 通过判断 范型的具体类型，来确定是否支持当前事件。
     * 2、永远返回true
     *
     *
     */
    public static class  GenericApplicationListenerAdapterStu{



    }




}
