package cn.lioyan.beans;

import org.springframework.core.convert.ConversionService;

import java.beans.PropertyEditor;


/**
 * {@link org.springframework.beans.TypeConverterSupport}
 * 继承自 ：PropertyEditorRegistrySupport与 TypeConverter
 * 其中 实现都交给{@link org.springframework.beans.TypeConverterDelegate} 委托
 * 首先通过{@link PropertyEditor} 转换，如果不行，再通过{@link ConversionService}
 *
 *
 * @author com.lioyan
 * @date 2023/2/1  14:33
 */
public class TypeConverterSupport
{
}
