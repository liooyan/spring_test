package data.jdbc.test;

import com.zaxxer.hikari.HikariDataSource;
import data.jdbc.test.bean.KgHotSearchDo;
import data.jdbc.test.dao.KgHotDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/1 11:20 上午
 */
//@EnableJpaRepositories
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        final KgHotDao bean = run.getBean(KgHotDao.class);
        final Iterable<KgHotSearchDo> all = bean.findAll();
        all.forEach(s-> System.out.println(s.getKeyword()));


        final HikariDataSource bean1 = run.getBean(HikariDataSource.class);


    }
}