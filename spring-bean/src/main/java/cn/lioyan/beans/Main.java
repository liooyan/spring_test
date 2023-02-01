package cn.lioyan.beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class Main
{

    public static void main(String[] args)
    {

        ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        Send bean = run.getBean(Send.class);
        bean.send();
    }
}
