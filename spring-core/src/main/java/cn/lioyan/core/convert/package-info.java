/**
 * 对应 spring-core包下的 {@link  org.springframework.core.convert} <br>
 * 数据类型转换包，提供将对象类型 A 转换为 B 的方法<br>
 * <br>
 * 主要接口：
 * <li>{@link org.springframework.core.convert.ConversionService} 转换服务，</li>
 * <li>{@link org.springframework.core.convert.converter.Converter} 转换器，提供具体的某种类型数据的转换</li>
 * <br>
 * 每一个Converter 的实例都提供一种数据类型的转换：如：EnumToIntegerConverter 为枚举转int，EnumToStringConverter 为 枚举转string <br>
 * 而 我们可以将 Converter 注册到 ConversionService 中，这样 ConversionService 就可以提供对应 数据类型的转 <br>
 * <br>
 * ConversionService 提供两个接口： <br>
 * canConvert 判断当前两个类型是否可以转换 <br>
 * convert 将指定类型进行转换 <br>
 * <br>
 * <li></li>
 */
package cn.lioyan.core.convert;