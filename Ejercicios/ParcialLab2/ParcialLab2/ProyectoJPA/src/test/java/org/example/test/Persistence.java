package org.example.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceTest {

    protected static EntityManagerFactory entityManagerFactory;
    protected static EntityManager entityManager;

    protected static void setUp() {
        entityManagerFactory = Persistence.createEntityManagerFactory("example-test-unit");
        entityManager = entityManagerFactory.createEntityManager();
    }

    protected static void tearDown() {
        if (entityManager != null) {
            entityManager.close();
        }
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
        }
    }
}
