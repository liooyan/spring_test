package cn.lioyan.beans.factory.config;

/**
 * {@link org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor} <br>
 * InstantiationAwareBeanPostProcessor 的派生接口 <br>
 * 1 、 predictBeanType预测bean最终的class。bean可能因为代理与原来的类型不同 <br>
 * 2、determineCandidateConstructors 明确bean的构造函数 <br>
 * 3、getEarlyBeanReference 提前返回bean的代理对象 <br>
 *
 */
public interface SmartInstantiationAwareBeanPostProcessor {
}
