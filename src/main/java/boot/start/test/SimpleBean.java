package boot.start.test;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/6 6:27 下午
 */
public class SimpleBean {

    private SimpleBeanIn1 simpleBeanIn1;
    private SimpleBeanIn2 simpleBeanIn2;
    private SimpleBeanIn2 simpleBeanIn3;


    public SimpleBeanIn2 getSimpleBeanIn3() {
        return simpleBeanIn3;
    }

    public void setSimpleBeanIn3(SimpleBeanIn2 simpleBeanIn3) {
        this.simpleBeanIn3 = simpleBeanIn3;
    }

    public SimpleBean(SimpleBeanIn1 simpleBeanIn1, SimpleBeanIn2 simpleBeanIn2) {
        this.simpleBeanIn1 = simpleBeanIn1;
        this.simpleBeanIn2 = simpleBeanIn2;
    }

    public void send() {
        System.out.println(simpleBeanIn1);
        System.out.println(simpleBeanIn2);
    }
}
