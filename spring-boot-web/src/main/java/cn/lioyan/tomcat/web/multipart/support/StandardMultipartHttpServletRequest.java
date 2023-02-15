package cn.lioyan.tomcat.web.multipart.support;

import javax.servlet.http.HttpServletRequest;


/**
 * {@link org.springframework.web.multipart.support.StandardMultipartHttpServletRequest}
 * <pre>
 * 方法 parseRequest ，解析文本。将结果存放在 multipartFiles map中
 * 解析过程：通过 {@link  HttpServletRequest#getParts()} 方法解析上传的文件，
 * 这个时tomcat的方法，它会将上传文件零时保存在本地。
 *
 *
 *
 * </pre>
 * @author com.lioyan
 * @date 2023/2/14  10:31
 */
public class StandardMultipartHttpServletRequest
{
}
