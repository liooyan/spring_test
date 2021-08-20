package beanExpressionResolver.test;

import beanExpressionResolver.StandardBeanExpressionResolverStu;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/1 11:47 上午
 */
public  class SimpleBean{

    private SimpleValueBean simpleValueBean;

    public SimpleValueBean getSimpleValueBean() {
        return simpleValueBean;
    }

    public void setSimpleValueBean(SimpleValueBean simpleValueBean) {
        this.simpleValueBean = simpleValueBean;
    }
    public void send(){
        System.out.println(simpleValueBean);
    }
}

