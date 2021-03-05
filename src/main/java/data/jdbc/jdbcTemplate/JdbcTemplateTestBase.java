package data.jdbc.jdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/5 9:58 上午
 */
public abstract class JdbcTemplateTestBase {


    private JdbcTemplate jdbcTemplate;
    /**
     *
     */
    public JdbcTemplateTestBase() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl("jdbc:mysql://192.169.4.34:3306/kg_tbea?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false");
        hikariDataSource.setUsername("root");
        hikariDataSource.setPassword("Root@hiekn##");
        hikariDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(hikariDataSource);
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate(){

        return jdbcTemplate;
    }


}
