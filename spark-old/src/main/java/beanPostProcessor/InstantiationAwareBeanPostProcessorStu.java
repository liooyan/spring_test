package beanPostProcessor;

import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * {@linkplain InstantiationAwareBeanPostProcessor}
 * 使用xml的时候居然没有
 *
 * 在springboot 中 普通的方法中没有该类型的实例
 * 最先被调用的bean后置处理器，在bean被创建前调用。调用方法
 *
 * {@linkplain InstantiationAwareBeanPostProcessor#postProcessBeforeInstantiation(Class, String)}
 * 允许返回 bean对象。代替初始化。
 * 之后调用 postProcessAfterInitialization
 *
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/7 5:43 下午
 */
public class InstantiationAwareBeanPostProcessorStu {
}
