package beanExpressionResolver;

import beanExpressionResolver.test.SimpleBean;
import org.springframework.beans.factory.config.BeanExpressionContext;
import org.springframework.beans.factory.config.BeanExpressionResolver;
import org.springframework.context.expression.StandardBeanExpressionResolver;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * {@linkplain StandardBeanExpressionResolver}
 * 继承关系
 * {@linkplain BeanExpressionResolver}
 * {@linkplain StandardBeanExpressionResolver}
 *
 * Standard 标准
 * Expression 表达式
 * Resolver 解决、解析
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/1 11:17 上午
 */
public class StandardBeanExpressionResolverStu {

    /**
     * 表达式解析
     * 唯一方法
     * {@linkplain BeanExpressionResolver#evaluate(String, BeanExpressionContext)}
     * 通过给定字符传解析 需要的值
     *
     */
    public static  class BeanExpressionResolverStu{


    }



    /**
     * {@linkplain StandardBeanExpressionResolver}
     * 对于 bean 的注入 除了 使用ref 注入外，
     * 默认可以通过该类实现 通过value 使用 #{} 表达式注入
     *
     *
     */
    public static class StandardBeanExpressionResolverClass{

    }


    public static class SPELTest{


        public static void main(String[] args) {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:config-spel.xml");
            SimpleBean bean = context.getBean("simpleBean",SimpleBean.class);
            bean.send();
            context.close();
        }







    }


}
