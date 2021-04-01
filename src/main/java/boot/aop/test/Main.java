package boot.aop.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:17 下午
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        final ConfigurableEnvironment environment = run.getEnvironment();
        final String test = environment.getProperty("test");
        final Integer number = environment.getProperty("number", Integer.class);
        final String placeholderTest = environment.getProperty("placeholderTest${test}");
        final String property = environment.getProperty("default:test");
        final SimpleBean bean = run.getBean(SimpleBean.class);
        bean.send();
    }
}
