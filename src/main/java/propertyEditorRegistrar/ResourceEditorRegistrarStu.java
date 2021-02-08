package propertyEditorRegistrar;

import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.support.ResourceEditorRegistrar;

/**
 *
 * {@linkplain ResourceEditorRegistrar}
 * Resource 资源
 * Editor 编辑
 * Registrar 登记处
 *
 * 类型转换登记员，将规定的一些转换器登记到转换器登记处。
 * 其中会被 登记在 overriddenDefaultEditors
 * 或者 registerCustomEditor 中
 * 比如：
 *  {@linkplain ResourceEditorRegistrar#registerCustomEditors(PropertyEditorRegistry)}
 * 将class 和文件读取相关内容 转换其加载到参数传进来的登记处中
 * 解析见：{@linkplain PropertyEditorRegistrySupportStu}
 *
 *
 * https://www.jianshu.com/p/a0ce60d05778
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/2/1 2:53 下午
 */
public class ResourceEditorRegistrarStu {






}
