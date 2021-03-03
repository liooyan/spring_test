package data.jdbc;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * 可能相关的自动装配类{@linkplain EnableAutoConfiguration}
 * 默认配置下：
 * org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration //TODO 没看到
 * org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration
 * org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
 * org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration
 * org.springframework.boot.autoconfigure.jdbc.JndiDataSourceAutoConfiguration //TODO 初始化 DataSourceAutoConfiguration 后没办法再初始化。
 * org.springframework.boot.autoconfigure.jdbc.XADataSourceAutoConfiguration  //TODO 优先初始化 DataSourceAutoConfiguration 之后，没办法再重复执行
 * org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration //TODO 最后执行。但默认没有执行，应该是有其他类初始化了 TransactionManager
 * org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration //TODO
 * org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration
 * org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/1 11:37 上午
 */
public class Start {
}
