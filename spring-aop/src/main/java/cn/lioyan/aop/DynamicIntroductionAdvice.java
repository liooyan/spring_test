package cn.lioyan.aop;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultIntroductionAdvisor;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;


/**
 * {@link org.springframework.aop.DynamicIntroductionAdvice}
 * 接口动态增强切面。通过这个接口切面，可以实现类似 多继承的功能， 实例如下：
 * @author com.lioyan
 * @date 2023/2/6  10:13
 */
public interface DynamicIntroductionAdvice
{

    public static void main(String[] args)
    {

        ProxyFactory factory = new ProxyFactory(new AopDemo());
        factory.setProxyTargetClass(true);
        // 创建顾问，指定 Advice 和 引介增强接口 IAopPlusDemo
        Advisor advisor = new DefaultIntroductionAdvisor(new CustomIntroductionInterceptor(), IAopPlusDemo.class);
        factory.addAdvisor(advisor);

        final Object proxy = factory.getProxy();
        // 执行 IAopDemo 的 say 方法
        IAopDemo aopDemo = (IAopDemo) proxy;
        aopDemo.say("IAopDemo");
        // 执行 引介增强 接口 IAopPlusDemo  的 sayPlus  方法
        IAopPlusDemo aopPlusDemo = (IAopPlusDemo) proxy;
        aopPlusDemo.sayPlus("IAopPlusDemo");
    }

    public static interface IAopDemo {
        void say(String msg);
    }
    // 引介增强的接口
    public static interface IAopPlusDemo {
        void sayPlus(String msg);
    }
    // 代理接口的实现类
    public static class AopDemo implements IAopDemo {
        public void say(String msg) {
            System.out.println("AopDemo.say : " + msg);
        }
    }

    // 引介拦截器的实现。这里注意，如果使用DelegatingIntroductionInterceptor，则需要强制实现增强的接口，比如这里是 IAopPlusDemo 接口
    public static class CustomIntroductionInterceptor extends DelegatingIntroductionInterceptor implements IAopPlusDemo {

        @Override
        public void sayPlus(String msg) {
            System.out.println("CustomIntroductionInterceptor.sayPlus : " + msg);
        }
    }

}
