package cn.lioyan.beans;

/**
 * {@link org.springframework.beans.PropertyAccessor} <br>
 * 属性访问器，这个接口定义方法，使 访问class的成员变量 就如同访问 properties 一样<br>
 * 其中： 属性通过 xxx.xxx 这样可以访问嵌套的属性<br>
 * 如果属性是数组或者map 集合 可以通过[] 来访问如： xxx[0].xxxx<br>
 * @author com.lioyan
 * @date 2023/2/1  14:02
 */
public interface PropertyAccessor
{
}
