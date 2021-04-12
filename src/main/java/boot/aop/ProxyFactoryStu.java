package boot.aop;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;

/**
 * {@linkplain ProxyFactory}
 *  将目标与切面组装
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/4/10 10:45 下午
 */
public class ProxyFactoryStu {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
       // proxyFactory.copyFrom(this);



    }


    private static  class MyAdvisor implements Advisor{
        @Override
        public Advice getAdvice() {
            return null;
        }

        @Override
        public boolean isPerInstance() {
            return false;
        }
    }


}
