package data.jdbc.jdbcTemplate;

import org.junit.Test;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

/**
 * {@linkplain JdbcOperations}
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/5 9:56 上午
 */
public class JdbcOperationsTest extends JdbcTemplateTestBase {

    /**
     *{@linkplain JdbcOperations#execute(String)}
     *执行一条 sql语句，sql中无参数
     *
     */
    @Test
    public void executeSql() {
        final JdbcTemplate jdbcTemplate = getJdbcTemplate();
        Random random = new Random();
        final int i = random.nextInt();
        jdbcTemplate.execute("INSERT INTO `kg_tbea`.`kg_hot_search`(`keyword`, `count`) VALUES ('dwdw', "+i+")");
    }

    @Test
    public void sqlSql() {
        final JdbcTemplate jdbcTemplate = getJdbcTemplate();
        Random random = new Random();
        final int i = random.nextInt();
        try {
            final List<KgTbea> kgTbeas = jdbcTemplate.queryForList("SELECT `keyword`, `count` from  kg_hot_search", KgTbea.class);

        }catch (Exception e){
            e.printStackTrace();
        }
        final List<Integer> integers = jdbcTemplate.queryForList("SELECT count from  kg_hot_search", Integer.class);
        System.out.println(integers);
    }

    public static class KgTbea{
        private String keyword;
        private int coutn;

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }

        public int getCoutn() {
            return coutn;
        }

        public void setCoutn(int coutn) {
            this.coutn = coutn;
        }
    }
}
