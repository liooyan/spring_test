package cn.lioyan.boot.context;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;


/**
 * {@link org.springframework.boot.context.FileEncodingApplicationListener} <br>
 * 监听 {@link ApplicationEnvironmentPreparedEvent} 在Environment 创建完成后执行。最低的优先度 <br>
 * 判断环境中 spring.mandatory-file-encoding 与系统的file.encoding 是否相同，如果不同就直接抛出异常 <br>
 *
 * @author com.lioyan
 * @date 2023/2/3  14:59
 */
public class FileEncodingApplicationListener
{
}
