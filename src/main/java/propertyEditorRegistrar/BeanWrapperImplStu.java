package propertyEditorRegistrar;

import org.springframework.beans.*;
import org.springframework.core.convert.TypeDescriptor;

/**
 * {@linkplain BeanWrapperImpl}
 *
 *
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/8 8:03 下午
 */
public class BeanWrapperImplStu {


    /**
     * {@linkplain TypeConverter}
     * //TODO 好像和类型转换有关系
     *
     *
     */
    public static class TypeConverterStu{

    }

    /**
     * {@linkplain TypeConverterSupport}
     * 在父类基础上添加了 TypeConverter 实现
     * 具体都交给了
     * {@linkplain org.springframework.beans.TypeConverterDelegate}
     * 但目前是一个空的类。
     *
     *
     */
    public static  class TypeConverterSupportStu{

    }

    /**
     *
     * {@linkplain PropertyAccessor}
     * 定义了一些关于方法属性的接口，有：
     * 判断属性是否可读，可写
     * 返回方法class、或{@linkplain TypeDescriptor} //TODO 这个类需要详细解析
     * 返回属性值，设置属性值。 通过 {@linkplain PropertyValue} 设置属性值 //TODO 解析
     * 批量设置属性值。
     *
     * Accessor 存取器
     *
     *
     */
    public static  class  PropertyAccessorStu{

    }

    /**
     * {@linkplain ConfigurablePropertyAccessor}
     * Configurable 可配置的。
     * //TODO 具体再看吧
     *
     */
    public static  class  ConfigurablePropertyAccessorStu{


    }

    /**
     * {@linkplain AbstractPropertyAccessor}
     *
     * 1、将所有的属性设置都统一到 setPropertyValue(String propertyName, @Nullable Object value) 方法中。
     * 2、对于 ConfigurablePropertyAccessor 的设置提供默认实现
     *
     */
    public static  class AbstractPropertyAccessorStu{

    }

}
