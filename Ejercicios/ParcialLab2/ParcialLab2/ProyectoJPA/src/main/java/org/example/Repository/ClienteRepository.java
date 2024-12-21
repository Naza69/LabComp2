package org.example.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class ClienteRepository {

    private EntityManager entityManager;

    public ClienteRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Cliente cliente) {
        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
    }

    public Cliente findById(Long id) {
        return entityManager.find(Cliente.class, id);
    }

    public List<Cliente> findAll() {
        return entityManager.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
    }

    public void update(Cliente cliente) {
        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();
    }

    public void delete(Long id) {
        Cliente cliente = entityManager.find(Cliente.class, id);
        if (cliente != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(cliente);
            entityManager.getTransaction().commit();
        }
    }

}
