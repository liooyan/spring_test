package cn.lioyan.cloud.bootstrap;

import org.springframework.cloud.bootstrap.BootstrapConfiguration;
import org.springframework.cloud.bootstrap.BootstrapImportSelectorConfiguration;


/**
 * {@link org.springframework.cloud.bootstrap.BootstrapApplicationListener}
 * <pre>
 * bootstrap 上下文引导器
 * 在 ApplicationEnvironmentPreparedEvent 时间，就 Environment 准备好后，顺序为  Ordered.HIGHEST_PRECEDENCE + 5
 * 比 application 文件加载高 5
 * 初始化一个父上下文， 父上下文有子上下文所有的监听器与初始化器。Environment 加载的是bootstrap 文件。
 * 在完成后使用{@link org.springframework.cloud.bootstrap.BootstrapApplicationListener.AncestorInitializer} 将这个上下文指定为我们的父上下文
 * 因为没有@SpringBootApplication 。所有没有自动扫描。
 * 但多了：{@link BootstrapImportSelectorConfiguration}， 会自动扫描 {@link BootstrapConfiguration} 内容
 * </pre>
 *
 * @author com.lioyan
 * @date 2023/2/16  15:08
 */
public class BootstrapApplicationListener
{
}
