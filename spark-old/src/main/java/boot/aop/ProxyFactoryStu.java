package boot.aop;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.*;

/**
 * {@linkplain ProxyFactory}
 *  将目标与切面组装
 *
 *  父类:
 *
 *
 *
 *
 *  {@linkplain ProxyConfig}    {@linkplain Advised}
 *     {@linkplain AdvisedSupport}
 *     {@linkplain ProxyCreatorSupport}
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/4/10 10:45 下午
 */
public class ProxyFactoryStu {


    /**
     * {@linkplain ProxyConfig}
     * 定义 代理相关配置
     *
     * setProxyTargetClass 是否强制代理当前类
     * setOptimize //TODO
     * setOpaque
     * setExposeProxy
     *
     *
     *
     *
     */
    public static class  ProxyConfigStu{

    }


    /**
     *
     * {@linkplain Advised}
     * 管理：TargetSource 和 被代理的class
     * 以及：{@linkplain Advisor}
     *
     *
     *
     *
     */
    public static class AdvisedStu{

    }



    /**
     *
     *
     *
     *
     */
    public static class AdvisedSupportStu{

    }


    /**
     *
     *
     *
     */
    public static class ProxyCreatorSupportStu{


    }


}
