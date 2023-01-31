package beanDefinition;

import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Role;
import org.springframework.context.annotation.Scope;

/**
 * {@link AnnotatedGenericBeanDefinition}
 *
 *
 *
 *
 *
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/24 11:18 上午
 *
 *
 */
public class   AnnotatedGenericBeanDefinitionStu {


    /**
     *
     * {@link BeanDefinition}
     *
     *
     * //TODO ParentName
     *
     * getBeanClassName class路径字符串
     * Scope 范围及是否单利，默认singleton
     *      其他情况：
     */
    public static class BeanDefinitionStu{


        /**
         * https://blog.csdn.net/jacklearntech/article/details/40157861
         * 关于 Scope 的说明
         * 在类上通过 {@linkplain Scope} 注解
         * singleton 单利
         * prototype 多例
         *
         * 在web中
         * request
         * session
         * global session
         *
         *
         */
        public void ScopeTest(){


        }

        /**
         * 懒加载
         * 通过 {@linkplain Lazy} 注解
         * 刷新上下文时不加载bean。只有当使用时才加载。
         *
         */
        public void LazyInit(){


        }

        /**
         * DependsOn 设置当前类的依赖
         * 当初始化当前class时，检测DependsOn 中设置的class 是否已经初始化。
         * 如果没有则优先初始化
         * 通过 {@linkplain DependsOn} 设置
         *
         */
        public void DependsOn(){

        }

        /**
         * autowireCandidate 当为true时，其他bean依赖时，会忽略此实例。默认为false
         * 在注解{@linkplain org.springframework.context.annotation.Bean}中 有此属性。
         *
         *
         *
         *
         */
        public void autowireCandidate(){

        }

        /**
         * 当类的候选有多个时，优先选用被{@linkplain org.springframework.context.annotation.Primary}修饰的
         *
         */
        public void primary(){

        }

        /**
         * factoryBeanName 在使用{@linkplain org.springframework.context.annotation.Bean}注解时会有
         * 时当前所在的类 的bean名称
         *
         */
        public void factoryBeanName(){

        }
        /**
         * factoryBeanName 在使用{@linkplain org.springframework.context.annotation.Bean}注解时会有
         * 时当前所在的类 的 方法名称
         *
         */
        public void factoryMethodName(){

        }

        /**
         * 在{@linkplain org.springframework.context.annotation.Bean} 中有
         *
         *
         */
        public void getConstructorArgumentValues(){

        }
        /**
         * 在{@linkplain org.springframework.context.annotation.Bean} 中有
         *
         *
         */
        public void getPropertyValues(){

        }

        /**
         * 通过注解{@linkplain javax.annotation.PostConstruct} 不会添加这个里面
         * 在{@linkplain org.springframework.context.annotation.Bean} 中有
         *
         *
         */
        public void getInitMethodName(){

        }
        /**
         * 通过{@linkplain Role} 注解
         * 一般不要改的
         *
         */
        public void getRole(){

        }

    }



}
