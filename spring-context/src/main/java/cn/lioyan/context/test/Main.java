package cn.lioyan.context.test;

import cn.lioyan.context.test2.Send2;
import cn.lioyan.context.test2.Send3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Main
{

    public static void main(String[] args)
    {

        ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        Send3 bean = run.getBean(Send3.class);
        bean.send();
    }
}
