package cn.lioyan.boot;

import cn.lioyan.boot.context.FileEncodingApplicationListener;
import cn.lioyan.boot.context.logging.LoggingApplicationListener;
import cn.lioyan.boot.context.config.DelegatingApplicationListener;
import org.springframework.boot.context.config.AnsiOutputApplicationListener;
import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationContextInitializer;


/**
 * {@link org.springframework.boot.SpringApplication} <br>
 * spring-boot 的启动类 ，springboot 就是以它的run方法为入口进行启动的。 <br>
 *  {@link org.springframework.boot.SpringApplication#run(String...)} <br>
 * 它将spring 的加载主要分为了： <br>
 * <li>准配 Environment 对象</li>
 * <li>创建 context 对象</li>
 * <li>配置 context 对象</li>
 * <li>刷新 context 对象</li>
 * 这几个主要步骤 <br>
 * 并且在这几个步骤直接穿插listener， 发生不同时期的事件。listener通过{@link org.springframework.core.io.support.SpringFactoriesLoader} 加载 <br>
 * 发送的事件有：
 * <li>{@link ApplicationStartingEvent} spring 开始启动时，这时，只有主函数的arg 和spring-boot的上下文</li>
 * <li>{@link ApplicationEnvironmentPreparedEvent} Environment 对象创建后</li>
 * <li>{@link ApplicationContextInitializedEvent} context 对象初始化后</li>
 * <li>{@link ApplicationPreparedEvent} context 配置完成后，这时，context 已经完成基本配置与完成main方法所在的类的注册</li>
 * <li>{@link ApplicationStartedEvent} spring-boot 启动完成后</li>
 * <li>{@link ApplicationReadyEvent} spring-boot 运行状态</li>
 *<br>
 *<br>
 * 另外：同样方法：加载{@link  ApplicationContextInitializer} 在context 创建完成 ，{@link ApplicationContextInitializedEvent}事件前，触发ContextInitializer 回调。对context 进行配置<br>
 * 在spring-boot 包中，默认配置了 7个 ApplicationListener，分别为：
 *  <li>{@link ClearCachesApplicationListener}</li>
 *  <li>{@link org.springframework.boot.builder.ParentContextCloserApplicationListener} 作用未知</li>
 *  <li>{@link FileEncodingApplicationListener}</li>
 *  <li>{@link AnsiOutputApplicationListener} 控制日志彩色输出</li>
 *  <li>{@link DelegatingApplicationListener} </li>
 *  <li>{@link LoggingApplicationListener} </li>
 *  <li>{@link cn.lioyan.boot.env.EnvironmentPostProcessorApplicationListener} </li>
 *
 *
 * ApplicationContextInitializer 目前没有特别需要关注的，后面再解析说明
 *
 * @author com.lioyan
 * @date 2023/2/3  10:46
 */
public class SpringApplication
{
}
