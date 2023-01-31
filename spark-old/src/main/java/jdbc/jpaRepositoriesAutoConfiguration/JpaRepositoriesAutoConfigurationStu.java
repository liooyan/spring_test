package jdbc.jpaRepositoriesAutoConfiguration;

import org.springframework.aop.interceptor.ExposeInvocationInterceptor;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.dao.support.PersistenceExceptionTranslationInterceptor;
import org.springframework.data.jpa.repository.support.DefaultJpaContext;
import org.springframework.data.jpa.repository.support.EntityManagerBeanDefinitionRegistrarPostProcessor;
import org.springframework.data.jpa.repository.support.JpaEvaluationContextExtension;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;
import org.springframework.orm.jpa.AbstractEntityManagerFactoryBean;
import org.springframework.orm.jpa.SharedEntityManagerCreator;
import org.springframework.orm.jpa.support.PersistenceAnnotationBeanPostProcessor;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import javax.persistence.EntityManagerFactory;

/**
 *
 * {@linkplain JpaRepositoriesAutoConfiguration}
 *
 * 添加一下beanDefinition
 * {@linkplain EntityManagerBeanDefinitionRegistrarPostProcessor}  //特殊处理 EntityManagerFactory AbstractEntityManagerFactoryBean JndiObjectFactoryBean
 * {@linkplain org.springframework.data.jpa.repository.config.JpaMetamodelMappingContextFactoryBean} //TODO 不明白
 * {@linkplain PersistenceAnnotationBeanPostProcessor} //和注入有关 这个注入的是新创建的对象，而不是在beanFactory内的对象
 * {@linkplain DefaultJpaContext}  // 加一个普通对象，需要看看在哪用
 * {@linkplain org.springframework.data.jpa.util.JpaMetamodelCacheCleanup}  // 加一个普通对象，需要看看在哪用
 * {@linkplain JpaEvaluationContextExtension}  // 加一个普通对象，需要看看在哪用
 *
 *
 * 创建bean时，的advisor
 *
 * {@linkplain ExposeInvocationInterceptor}  //TODO 用处不大
 * {@linkplain org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor.CrudMethodMetadataPopulatingMethodInterceptor} //TODO 针对现有的方法进行拦截，但不是具体的处理过程
 * {@linkplain PersistenceExceptionTranslationInterceptor}  //TODO 统一异常处理
 * {@linkplain TransactionInterceptor} //事务
 * {@linkplain org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor}  //TODO 自定义的查询
 * {@linkplain RepositoryFactorySupport.ImplementationMethodExecutionInterceptor}
 *
 *
 * 扫描Repository
 *
 *
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/4/20 11:05 下午
 */
public class JpaRepositoriesAutoConfigurationStu {


    /**
     * {@linkplain EntityManagerBeanDefinitionRegistrarPostProcessor}
     *
     *  根据已有的 {@linkplain EntityManagerFactory} 和 {@linkplain AbstractEntityManagerFactoryBean}
     *  将其封装到 {@linkplain SharedEntityManagerCreator} 并将其添加到beanDefinitionRegister 中。
     *
     *  //TODO EntityManagerFactory可能是 各框架实现的db连接，具体通过SharedEntityManagerCreator 做统一的委托
     *
     *
     */
    public static class EntityManagerBeanDefinitionRegistrarPostProcessorStu{



    }
}
