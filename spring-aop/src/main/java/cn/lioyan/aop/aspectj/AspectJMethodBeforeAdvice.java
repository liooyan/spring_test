package cn.lioyan.aop.aspectj;



/**
 * {@link org.springframework.aop.aspectj.AspectJMethodBeforeAdvice} <br>
 *  封装的 @Before 这些方法， <br>
 * 继承子 {@link  AbstractAspectJAdvice} 与 {@link cn.lioyan.aop.MethodBeforeAdvice}， 实现 before 方法 <br>
 * 就是调用父类的invokeAdviceMethod ， <br>
 * 同时实现 isBeforeAdvice与isAfterAdvice 固定返回 ture与false <br>
 *
 */
public class AspectJMethodBeforeAdvice {
}
