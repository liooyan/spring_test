package jdbc.start;

import boot.beanDefinitionRegistryPostProcessor.ConfigurationClassPostProcessorStu;
import org.springframework.boot.autoconfigure.data.AbstractRepositoryConfigurationSourceSupport;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.EntityManagerFactoryBuilderCustomizer;
import org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;

/**
 * 应该是jpa的一些基本类型解析
 * {@linkplain JpaRepositoriesAutoConfiguration}
 * 注入一个对象 {@linkplain EntityManagerFactoryBuilderCustomizer}
 * 其他
 * 1、import {@linkplain org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesRegistrar}
 * 2、after {@linkplain TaskExecutionAutoConfiguration}
 *
 * {@linkplain JpaRepositoryFactoryBean}
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/1 5:26 下午
 */
public class JpaRepositoriesAutoConfigurationStu {
    /**
     *
     *  {@linkplain org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesRegistrar}
     *
     * //TODO
     *
     */
    public static class  JpaRepositoriesRegistrarStu{

        /**
         *
         * {@linkplain AbstractRepositoryConfigurationSourceSupport}
         * Abstract 抽象
         * Repository 知识库
         * Configuration 配置
         * Source 来源
         * Support 支持
         * 其父类：{@linkplain ImportBeanDefinitionRegistrar}
         * 所有这些解析见：{@linkplain ConfigurationClassPostProcessorStu#ImportStu}
         *
         * 最终效果：将指定的接口保存在 bean定义中
         *
         *
         */
        public static class AbstractRepositoryConfigurationSourceSupportStu{

        }
    }
}
