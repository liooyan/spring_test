package boot.beanDefinitionRegistryPostProcessor.main;

import boot.beanDefinitionRegistryPostProcessor.imports.SimpleBeanImports;
import boot.beanDefinitionRegistryPostProcessor.imports.SimpleBeanImports2;
import boot.beanDefinitionRegistryPostProcessor.test.SimpleBean;
import boot.beanDefinitionRegistryPostProcessor.test.SimpleBeanManaged;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/13 10:17 下午
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = SimpleBean.class,excludeFilters = { @ComponentScan.Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
@Import(SimpleBeanImports.class)
public class Main {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(Main.class, "--liyan=1231");
        final SimpleBean bean = run.getBean(SimpleBean.class);
        final SimpleBeanManaged simpleBeanManaged = run.getBean(SimpleBeanManaged.class);
        final SimpleBeanImports simpleBeanImports = run.getBean(SimpleBeanImports.class);
        final SimpleBeanImports2 simpleBeanImports2 = run.getBean(SimpleBeanImports2.class);
        bean.send();
        simpleBeanManaged.send();
        simpleBeanImports.send();
        simpleBeanImports2.send();
    }


    public static class A{


    }

    public  class B{


    }

    public String a (){
        return "liyan";
    }
}
