package cn.lioyan.java;

/**
 * {@link java.beans.PropertyEditorSupport} 接口： {@link java.beans.PropertyEditor}<br>
 *<br>
 * 属性编辑器， java自己提供。 <br>
 * 可以将string 与任意类型的 数据进行转换。<br>
 * 其中 setAsText 是将string转为对应类型。getValue 为获取转换后的数据。<br>
 * 因为转换是将结果保存在class中的value里，所有在使用时，不可用单例。<br>
 *<br>
 * 同时提供监听器，在当value发生变化时，触发注册的监听器。<br>
 */
public class PropertyEditorSupport {
}
