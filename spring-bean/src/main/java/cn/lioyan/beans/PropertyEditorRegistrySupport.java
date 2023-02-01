package cn.lioyan.beans;



/**
 * {@link org.springframework.beans.PropertyEditorRegistrySupport}
 * {@link  PropertyEditorRegistry} 接口的实现，
 * 通过 customEditors 保存 按照类型转换的PropertyEditor <br>
 * 通过 customEditorsForPath 保存 按照path转换的PropertyEditor
 *
 * 其他默认内置了多个默认的PropertyEditor，包括：
 * 基础类型、时间、资源、集合、数组等类型转换，但必须通过{@link org.springframework.beans.PropertyEditorRegistrySupport#getDefaultEditor(Class)} 方法调用
 *
 * @author com.lioyan
 * @date 2023/2/1  14:34
 */
public class PropertyEditorRegistrySupport
{
}
