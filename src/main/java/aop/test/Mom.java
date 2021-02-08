package aop.test;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/7 7:22 下午
 */
public class Mom {

    public void buy(){//前置通知
        System.out.println("买水果");
    }

    public void clear(){//后置通知
        System.out.println("收拾果核");
    }
}
