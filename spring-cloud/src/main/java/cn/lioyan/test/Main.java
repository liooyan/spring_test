package cn.lioyan.test;

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
    }
}
