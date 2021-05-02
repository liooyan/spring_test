package data.jdbc.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author top.lioyan
 * @version 1.0
 * @date 2021/4/22 2:14 下午
 */
@Service

public class Test {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private EntityManager entityManager2;

    @PersistenceContext
    private EntityManager entityManager3;

    @Autowired
    private EntityManager entityManager4;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public EntityManager getEntityManager2() {
        return entityManager2;
    }

    public void setEntityManager2(EntityManager entityManager2) {
        this.entityManager2 = entityManager2;
    }

    public EntityManager getEntityManager3() {
        return entityManager3;
    }

    public void setEntityManager3(EntityManager entityManager3) {
        this.entityManager3 = entityManager3;
    }

    public EntityManager getEntityManager4() {
        return entityManager4;
    }

    public void setEntityManager4(EntityManager entityManager4) {
        this.entityManager4 = entityManager4;
    }
}
