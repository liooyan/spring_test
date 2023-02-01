package cn.lioyan.beans;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

import java.util.ArrayList;
import java.util.List;


/**
 * {@link org.springframework.beans.AbstractNestablePropertyAccessor}<br>
 * 实现基本的属性访问逻辑，其中包括： 嵌套的属性访问， 和属性类型转换。而具体的PropertyValue的设置则是通过{@link  org.springframework.beans.AbstractNestablePropertyAccessor.PropertyHandler} 实现<br>
 * <br>
 * <br>
 * <br>
 * {@link org.springframework.beans.AbstractNestablePropertyAccessor#setPropertyValue(String, Object)} 设置属性<br>
 * <br>
 * 通过{@link org.springframework.beans.AbstractNestablePropertyAccessor#getNestedPropertyAccessor(String)} 获取嵌套最底层的AbstractNestablePropertyAccessor 对象如qq.a1 获取到的就是a1 的 AbstractNestablePropertyAccessor<br>
 * <br>
 * <br>
 * 调用刚获取到的对象的{@link org.springframework.beans.AbstractNestablePropertyAccessor#setPropertyValue(org.springframework.beans.AbstractNestablePropertyAccessor.PropertyTokenHolder, PropertyValue)} 注入属性<br>
 * {@link org.springframework.beans.AbstractNestablePropertyAccessor.PropertyTokenHolder} 有两个属性 actualName 与class 属性完全相同的名字，canonicalName 可能带[] 的名字<br>
 * <br>
 * <br>
 * <br>
 * <br>
 * getNestedPropertyAccessor 方法<br>
 * 递归 getPropertyAccessorForPropertyPath， 创建 AbstractNestablePropertyAccessor 对象，创建过程由子类实现<br>
 * <br>
 * <br>
 * <br>
 * setPropertyValue 与 getPropertyValue 都是 通过 PropertyHandler 实现<br>
 * 子类创建
 *
 *
 *
 * @author com.lioyan
 * @date 2023/2/1  15:10
 */
public class AbstractNestablePropertyAccessor
{
    public static void main(String[] args)
    {
        BeanWrapperImpl beanWrapper = new BeanWrapperImpl(new Send());
        beanWrapper.setPropertyValue("a1", "123");
        beanWrapper.setPropertyValue("qq.a1", "123");
        beanWrapper.setPropertyValue("qq2[1]", new Send2());
        beanWrapper.setPropertyValue("qq2[1].a2", "asdf");
        Object rootInstance = beanWrapper.getRootInstance();
        System.out.println(rootInstance);
    }

    static class Send
    {
        private String a1;

        private String a2;

        private Send2 qq = new Send2();

        private List<Send2> qq2 = new ArrayList<>();

        public List<Send2> getQq2()
        {
            return qq2;
        }

        public void setQq2(List<Send2> qq2)
        {
            this.qq2 = qq2;
        }

        public Send2 getQq()
        {
            return qq;
        }

        public void setQq(Send2 qq)
        {
            this.qq = qq;
        }

        public String getA1()
        {
            return a1;
        }

        public void setA1(String a1)
        {
            this.a1 = a1;
        }

        public String getA2()
        {
            return a2;
        }

        public void setA2(String a2)
        {
            this.a2 = a2;
        }

        @Override
        public String toString()
        {
            return "Send{" + "a1='" + a1 + '\'' + ", a2='" + a2 + '\'' + ", qq=" + qq + '}';
        }
    }


    static class Send2
    {
        private String a1;

        private String a2;

        public String getA1()
        {
            return a1;
        }

        public void setA1(String a1)
        {
            this.a1 = a1;
        }

        public String getA2()
        {
            return a2;
        }

        public void setA2(String a2)
        {
            this.a2 = a2;
        }

        @Override
        public String toString()
        {
            return "Send2{" + "a1='" + a1 + '\'' + ", a2='" + a2 + '\'' + '}';
        }
    }

}
