package cn.lioyan.tomcat.web.multipart;

import cn.lioyan.tomcat.web.multipart.support.StandardServletMultipartResolver;


/**
 * {@link org.springframework.web.multipart.MultipartResolver}
 *<pre>
 * 用于解析上传文件的解析器，默认实现：{@link StandardServletMultipartResolver}

 判断是否位文件上传
 boolean isMultipart(HttpServletRequest request);

 解析协议，返回 MultipartHttpServletRequest
 MultipartHttpServletRequest resolveMultipart(HttpServletRequest request) throws MultipartException;

 文件上传协议如下：

 ----------------------------060104629903327142137689
 Content-Disposition: form-data; name="file1"; filename="Main.java"
 Content-Type: text/x-java-source

 文本内容
 ----------------------------060104629903327142137689
 Content-Disposition: form-data; name="file2"; filename="Servlet.java"
 Content-Type: text/x-java-source

 文本内容
 ----------------------------060104629903327142137689
 Content-Disposition: form-data; name="name"

 run
 ----------------------------060104629903327142137689--



 *
 *
 *</pre>
 * @author com.lioyan
 * @date 2023/2/14  10:04
 */
public interface MultipartResolver
{
}
