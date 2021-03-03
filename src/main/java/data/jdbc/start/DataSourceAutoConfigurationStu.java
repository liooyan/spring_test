package data.jdbc.start;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceSchemaCreatedEvent;
import org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvidersConfiguration;
import org.springframework.boot.jdbc.metadata.DataSourcePoolMetadataProvider;

import javax.sql.DataSource;

/**
 * {@linkplain DataSourceAutoConfiguration}
 *
 * 1、PooledDataSourceConfiguration
 *  设置链接池，默认会初始化{@linkplain org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration.Hikari}
 *  当没有其他 {@linkplain DataSource} 时 执行
 * 2、EmbeddedDatabaseConfiguration 没有执行。。关于执行条件的优先级，//TODO
 *
 *
 * 其中有2个import
 *  {@linkplain DataSourcePoolMetadataProvidersConfiguration}
 *      返回一个 {@linkplain DataSourcePoolMetadataProvider}对象。 //TODO 暂时没有看到在哪里用
 *  {@linkplain DataSourceInitializationConfiguration}
 *      又导入2个
 *      {@linkplain org.springframework.boot.autoconfigure.jdbc.DataSourceInitializerInvoker}
 *      {@linkplain org.springframework.boot.autoconfigure.jdbc.DataSourceInitializationConfiguration.Registrar}
 *          注入名称为 dataSourceInitializerPostProcessor 的对象，
 *              {@linkplain org.springframework.boot.autoconfigure.jdbc.DataSourceInitializerPostProcessor}
 *               作用：在所有bean完成前 初始化 {@linkplain org.springframework.boot.autoconfigure.jdbc.DataSourceInitializerInvoker}对象
 *          对象:{@linkplain org.springframework.boot.autoconfigure.jdbc.DataSourceInitializerInvoker} 监听：{@linkplain DataSourceSchemaCreatedEvent} 事件
 *
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/1 2:36 下午
 */
public class DataSourceAutoConfigurationStu {

    /**
     * {@linkplain org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration.Hikari}
     * 当 spring.datasource.type 为 com.zaxxer.hikari.HikariDataSource 时 生效
     * 参数：
     *      {@linkplain DataSourceProperties}是关于 spring.datasource 配置的封装
     * 逻辑：
     *       几个基本参数传入，创建对象。
     */
    public void pooledDataSourceConfiguration(){


    }



}
