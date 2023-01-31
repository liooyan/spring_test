package boot.applicationListener.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:17 下午
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(Main.class, "--liyan=1231");
        final SimpleBean bean = run.getBean(SimpleBean.class);
        bean.send();
    }


    public static class A{


    }

    public  class B{


    }

    public String a (){
        return "liyan";
    }
}
