package data.jdbc.dataSource;

import java.sql.*;

/**
 *
 * //TODO 这里其实还有jdbc 的源码可以看
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/4 11:24 上午
 */
public class JdbcTest {
    /**
     *
     * 获取连接并执行
     *
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {


        String url = "jdbc:mysql://192.169.4.34:3306/kg_tbea?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
        String username = "root";
        String password = "Root@hiekn##";
        Connection conn = null;

      //2.获取与数据库的链接
        conn = DriverManager.getConnection(url, username, password);
        final Statement statement = conn.createStatement();
        final ResultSet resultSet = statement.executeQuery("select * from kg_hot_search");

        while (resultSet.next()) {
            System.out.println(resultSet.getString("keyword"));
        }

    }
}
