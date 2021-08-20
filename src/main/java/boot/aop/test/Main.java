package boot.aop.test;

import org.aopalliance.aop.Advice;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJAroundAdvice;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.aspectj.AspectJMethodBeforeAdvice;
import org.springframework.aop.aspectj.annotation.BeanFactoryAspectInstanceFactory;
import org.springframework.aop.aspectj.annotation.LazySingletonAspectInstanceFactoryDecorator;
import org.springframework.aop.aspectj.annotation.MetadataAwareAspectInstanceFactory;
import org.springframework.aop.aspectj.annotation.PrototypeAspectInstanceFactory;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.target.SingletonTargetSource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.io.Serializable;
import java.lang.reflect.Method;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:17 下午
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        final ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        run.getBean(SimpleBean.class).send();
//        final ConfigurableEnvironment environment = run.getEnvironment();
//
//
//        // 按照源码创造一个切面
//        final Method send = AopTest.class.getMethod("send", ProceedingJoinPoint.class);
//        final Method doBefore = AopTest.class.getMethod("doBefore", JoinPoint.class);
//        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
//        aspectJExpressionPointcut.setBeanFactory(run.getBeanFactory());
//        aspectJExpressionPointcut.setPointcutDeclarationScope(AopTest.class);
//        aspectJExpressionPointcut.setExpression("execution(* boot.aop.test.SimpleBean.send(..))");
//
//
//        //有 AspectMetadata 对象。里面变量切入点的父类，找到正在的方法
//        //看样子应该是返回切面对象用的
//        MetadataAwareAspectInstanceFactory factory =
//                new PrototypeAspectInstanceFactoryStu(run.getBeanFactory(), "aopTest");
//        // 和参数是相同的类型，区别上面工厂返回的是同一个实例
//        LazySingletonAspectInstanceFactoryDecorator lazySingletonAspectInstanceFactoryDecorator = new LazySingletonAspectInstanceFactoryDecorator(factory);
//
//
//        Advice aspectJAroundAdvice = new AspectJAroundAdvice(send, aspectJExpressionPointcut, lazySingletonAspectInstanceFactoryDecorator);
//        Advice aspectJAroundAdvice2 = new AspectJMethodBeforeAdvice(doBefore, aspectJExpressionPointcut, lazySingletonAspectInstanceFactoryDecorator);
//
//
//        MyAdvisor myAdvisor = new MyAdvisor();
//        MyAdvisor myAdvisor2 = new MyAdvisor();
//        MyAdvisor[] myAdvisors = new MyAdvisor[]{myAdvisor,myAdvisor2};
//        myAdvisor.setAdvice(aspectJAroundAdvice);
//        myAdvisor2.setAdvice(aspectJAroundAdvice2);
//
//        ProxyFactory proxyFactory = new ProxyFactory();
//        SingletonTargetSource singletonTargetSource = new SingletonTargetSource(new SimpleBean());
//        proxyFactory.addAdvisors(myAdvisors);
//        proxyFactory.setTargetSource(singletonTargetSource);
//
//        proxyFactory.setFrozen(false);
//        proxyFactory.setPreFiltered(true);
//
//        /**
//         *
//         * {@linkplain ObjenesisCglibAopProxy}
//         *
//         *
//         */
//        SimpleBean proxy = (SimpleBean) proxyFactory.getProxy(Main.class.getClass().getClassLoader());
//        proxy.send();
    }

    public static class MyAdvisor implements Advisor {

        private Advice advice;

        public void setAdvice(Advice advice) {
            this.advice = advice;
        }

        @Override
        public Advice getAdvice() {
            return advice;
        }

        @Override
        public boolean isPerInstance() {
            return true;
        }
    }


    public static class PrototypeAspectInstanceFactoryStu extends BeanFactoryAspectInstanceFactory implements Serializable {

        /**
         * Create a PrototypeAspectInstanceFactory. AspectJ will be called to
         * introspect to create AJType metadata using the type returned for the
         * given bean name from the BeanFactory.
         *
         * @param beanFactory the BeanFactory to obtain instance(s) from
         * @param name        the name of the bean
         */
        public PrototypeAspectInstanceFactoryStu(BeanFactory beanFactory, String name) {
            super(beanFactory, name);
        }

    }


}
