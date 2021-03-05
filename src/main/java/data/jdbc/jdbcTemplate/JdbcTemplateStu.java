package data.jdbc.jdbcTemplate;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.support.JdbcAccessor;
import org.springframework.jdbc.support.SQLExceptionTranslator;

import javax.sql.DataSource;
import java.sql.Statement;
import java.util.List;

/**
 * {@linkplain JdbcTemplate}
 * template 模版
 *
 * 继承关系
 * {@linkplain JdbcAccessor}
 * Accessor 存取器
 * {@linkplain JdbcOperations}
 * operations  运作
 *
 *
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/5 9:44 上午
 */
public class JdbcTemplateStu {

    /**
     * {@linkplain JdbcAccessor}
     *
     * 设置与保存 {@linkplain DataSource} 与 {@linkplain SQLExceptionTranslator}
     *
     *
     */
    public static class  JdbcAccessorStu{

    }

    /**
     * {@linkplain JdbcOperations}
     * 定义 sql操作的接口，测试用例见:{@linkplain }
     *
     */
    public static class JdbcOperationsStu{

    }

    /**
     * {@linkplain JdbcTemplate}
     *
     */
    public static class JdbcTemplateStuClass{
        /**
         * {@linkplain JdbcTemplate#execute(StatementCallback, boolean)}
         * JdbcTemplate 的模版方法。
         * 其中参数StatementCallback 通过参数 {@linkplain Statement} 获取到sql执行结果
         * Statement 陈述
         * Callback 回调
         *
         * 该方法逻辑：
         * 1、获取dataSource
         * 2、通过dataSource  获取Statement
         * 3、设置Statement的基本设置，比如count最大值，返回超时时间
         * 4、执行StatementCallback 的方法，运行sql 获取返回值
         * 5、校验sql的Warnings 信息
         * 6、返回结果
         *
         * @param action
         * @param closeResources
         * @param <T>
         * @return
         * @throws DataAccessException
         */
        private <T> T execute(StatementCallback<T> action, boolean closeResources) throws DataAccessException {
            return null;
        }

        /**
         * {@linkplain JdbcTemplate#query(String, RowCallbackHandler)}
         *
         * 在 {@linkplain JdbcTemplate#execute(StatementCallback, boolean)} 基础上
         * 添加 RowCallbackHandler 参数
         * 参数 sql执行结果 ResultSet
         * 返回 范型T
         *
         *
         * @param sql
         * @param rse
         * @param <T>
         * @return
         * @throws DataAccessException
         */
        public <T> T query(final String sql, final ResultSetExtractor<T> rse) throws DataAccessException{
         return  null;
        }

        /**
         *  {@linkplain JdbcTemplate#query(String, RowMapper)}
         *  与上面相似
         *  只不过 RowMapper 为对没行的数据的单独出来
         *  具体方法是 T mapRow(ResultSet rs, int rowNum) throws SQLException;
         * @param sql
         * @param rowMapper
         * @param <T>
         * @return
         * @throws DataAccessException
         */
        public <T> List<T> query(String sql, RowMapper<T> rowMapper) throws DataAccessException{
            return null;
        }

        /**
         * {@linkplain JdbcTemplate#queryForList(String, Class)}
         * 这个是在上面基础上添加了对于 RowMapper 的实现具体为
         * {@linkplain SingleColumnRowMapper}
         * Single 单身的
         * Column 柱子
         * 注意：这个是对于查询结果只有一列的数据进行转换
         * //TODO 在看看吧。感觉一列有点奇怪
         * @param sql
         * @param elementType
         * @param <T>
         * @return
         */
        public <T> List<T> queryForList(String sql, Class<T> elementType){
            return null;
        }



    }

}
