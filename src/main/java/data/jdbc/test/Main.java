package data.jdbc.test;

import com.zaxxer.hikari.HikariDataSource;
import data.jdbc.test.bean.KgHotSearchDo;
import data.jdbc.test.dao.KgHotDao;
import data.jdbc.test.dao.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;

/**
 *
 *
 * @author top.lioyan
 * @version 1.0
 * @date 2021/3/1 11:20 上午
 */
//@EnableJpaRepositories("data.jdbc.test.dao")
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(Main.class, args);
        final KgHotDao bean = run.getBean(KgHotDao.class);
        final Iterable<KgHotSearchDo> all = bean.findAll();
        final KgHotSearchDo 乙炔超标 = bean.findByKeyword("乙炔超标");
        final Test bean3 = run.getBean(Test.class);

        all.forEach(s-> System.out.println(s.getKeyword()));


        final LocalContainerEntityManagerFactoryBean bean1 = run.getBean(LocalContainerEntityManagerFactoryBean.class);

        final JpaVendorAdapter jpaVendorAdapter = bean1.getJpaVendorAdapter();
        final PersistenceProvider persistenceProvider = jpaVendorAdapter.getPersistenceProvider();





        final EntityManagerFactory object = bean1.getObject();
        final EntityManager entityManager = object.createEntityManager();
        final KgHotSearchDo kgHotSearchDo = entityManager.find(KgHotSearchDo.class, 3L);

        System.out.println(kgHotSearchDo);


    }
}