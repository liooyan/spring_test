package cn.lioyan.beans.factory;


/**
 * {@link org.springframework.beans.factory.BeanFactory}
 * spring bean 容器的顶级接口， <br>
 * 定义不同方法的 getBean 接口，方便我们获取spring 的bean对象<br>
 *<br>
 * 其中有 getBeanProvider 方法 返回{@link  org.springframework.beans.factory.ObjectProvider},允许返回0个或多个符合条件的bean对象<br>
 */
public interface BeanFactory {
}
