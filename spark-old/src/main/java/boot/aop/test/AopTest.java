package boot.aop.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:18 下午
 */
@Aspect
@Component
public class AopTest {

    @Around("execution(* boot.aop.test.SimpleBean.send(..))")
    public Object send(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("环绕通知的前："+proceedingJoinPoint.getSignature().getName());
        try {
            Object obj = proceedingJoinPoint.proceed();
            System.out.println("环绕通知的后："+proceedingJoinPoint.getSignature().getName());
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }




    @Before("execution(* boot.aop.test.SimpleBean.send(..))")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        System.out.println(joinPoint.getArgs());
    }

    @After("execution(* boot.aop.test.SimpleBean.send(..))")
    public void doAfter(JoinPoint joinPoint) throws Throwable {
        // 接收到请求，记录请求内容
        System.out.println(joinPoint.getArgs());
    }

}
