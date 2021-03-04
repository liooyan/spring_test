package data.jdbc.dataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.pool.HikariPool;
import com.zaxxer.hikari.util.DriverDataSource;
import org.junit.Test;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * {@linkplain HikariDataSource}
 * 对象创建：
 * 通过{@linkplain org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration#createDataSource(DataSourceProperties, Class)}
 * 传入默认参数：
 * driverClassName
 * url
 * username
 * password
 * poolName
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/4 10:28 上午
 */
public class HikariDataSourceStu {

    /**
     * HikariDataSource
     * 继承关系：
     * {@linkplain HikariConfig} 关于所有的配置
     * {@linkplain DataSource} 数据源
     * Source 来源
     * 逻辑：
     * 连接池主要通过:{@linkplain HikariPool}来实现
     * 参数为 HikariConfig
     *
     *
     * {@linkplain HikariPool}
     *
     *
     *
     *
     *
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {

        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl("jdbc:mysql://192.169.4.34:3306/kg_tbea?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("Root@hiekn##");
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");


        final Connection connection = hikariDataSource.getConnection();
        final Statement statement = connection.createStatement();
        final ResultSet resultSet = statement.executeQuery("select * from kg_hot_search");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("keyword"));
        }

    }

    /**
     *
     * {@linkplain HikariPool}
     * pool 池子
     * 父类
     * {@linkplain com.zaxxer.hikari.pool.PoolBase}
     *
     * 持有DriverDataSource {@linkplain DataSource} 对象。
     *  具体内容为:new DriverDataSource(jdbcUrl, driverClassName, dataSourceProperties, username, password);
     *  对于{@linkplain DriverDataSource}对象的 getConnection 方法。每次都是一个新的对象。
     *
     *
     *
     */
    @Test
    public void HikariPoolTest() throws SQLException {
        HikariDataSource hikariConfig = new HikariDataSource();
        hikariConfig.setJdbcUrl("jdbc:mysql://192.169.4.34:3306/kg_tbea?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false");
        hikariConfig.setUsername("root");
        hikariConfig.setPassword("Root@hiekn##");
//        hikariConfig.setDriverClassName("com.mysql.jdbc.Driver");
        hikariConfig.validate();


        HikariPool hikariPool = new HikariPool(hikariConfig);
        final Statement statement = hikariPool.getConnection().createStatement();
        final Statement statement2 = hikariPool.getConnection().createStatement();
        final Statement statement3 = hikariPool.getConnection().createStatement();
        final Statement statement4 = hikariPool.getConnection().createStatement();
        final Statement statement5 = hikariPool.getConnection().createStatement();
        final ResultSet resultSet = statement.executeQuery("select * from kg_hot_search");
        hikariPool.getConnection().close();
        while (resultSet.next()) {
            System.out.println(resultSet.getString("keyword"));
        }
    }



}
