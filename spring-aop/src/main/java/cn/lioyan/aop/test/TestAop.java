package cn.lioyan.aop.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Configuration
public class TestAop {
    @Before("execution (public * cn.lioyan.aop.test.Send.*(..) )")
    public void deoBefore(JoinPoint joinPoint) {
        System.out.println("方法执行前...");
    }

    @After("execution (public * cn.lioyan.aop.test.Send.*(..) )")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("方法执行后");
    }
    @AfterReturning(value = "execution (public * cn.lioyan.aop.test.Send.*(..) )",returning = "returnValue")
    public void doAfterReturning(JoinPoint joinPoint, Object returnValue) {
        System.out.println("方法执行后AfterReturning");
    }

}
