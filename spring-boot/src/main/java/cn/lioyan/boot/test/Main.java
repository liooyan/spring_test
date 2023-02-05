package cn.lioyan.boot.test;

import cn.lioyan.boot.test2.Send3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;


@SpringBootApplication
public class Main
{

    public static void main(String[] args)
    {

        ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        List<String> strings = AutoConfigurationPackages.get(run);
        System.out.println(strings);
        Send3 bean = run.getBean(Send3.class);
        bean.send();
    }
}
