package cn.lioyan.core.io;

/**
 * {@link  org.springframework.core.io.Resource} <br>
 * 资源描述接口， 主要是对任意位置的资源文件的抽象，主要方法有：<br>
 * <li>boolean exists(); 判断文件是否存在</li>
 * <li>URL getURL() 返回url，但不是所有资源都有url</li>
 * <li>File getFile() 返回File对象，但不是所有资源都有File对象</li>
 * <li> ReadableByteChannel readableChannel() 返回nio的读取通道 ，通过 getInputStream() 实现</li>
 * <li>InputStream getInputStream() 返回输入流，</li>
 */
public interface Resource {
}
