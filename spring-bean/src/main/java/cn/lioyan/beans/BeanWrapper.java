package cn.lioyan.beans;

import cn.lioyan.beans.test.Send;
import org.springframework.beans.BeanWrapperImpl;


/**
 * {@link org.springframework.beans.BeanWrapper} <br>
 * Spring底层JavaBeans基础设施的中心接口。<br>
 * 提供分析和操作bean对象的方法<br>
 * @author com.lioyan
 * @date 2023/2/1  14:08
 */
public interface BeanWrapper
{
    public static void main(String[] args)
    {
        BeanWrapperImpl beanWrapper = new BeanWrapperImpl(new Send());
        beanWrapper.setPropertyValue("a1","123");
    }
     class Send{
        private String a1;
        private String a2;
    }
}
