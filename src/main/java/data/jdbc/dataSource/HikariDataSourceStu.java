package data.jdbc.dataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.pool.HikariPool;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

import javax.sql.DataSource;
import java.sql.*;

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
        final PreparedStatement preparedStatement = connection.prepareStatement("select * from kg_hot_search");
        final ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println(connection);

    }
}
