package org.example.Repository;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ClienteRepositoryTest {
    private static ClienteRepository clienteRepository;

    @BeforeClass
    public static void setUpClass() {
        setUp();
        clienteRepository = new ClienteRepository(entityManager);
    }

    @AfterClass
    public static void tearDownClass() {
        tearDown();
    }

    @Test
    public void testSaveCliente() {

        Cliente cliente = new Cliente();
        cliente.setNombre("Juan Pérez");


        clienteRepository.save(cliente);


        assertNotNull(cliente.getId());
    }

    @Test
    public void testFindClienteById() {

        Cliente cliente = new Cliente();
        cliente.setNombre("María López");
        clienteRepository.save(cliente);


        Cliente clienteRecuperado = clienteRepository.findById(cliente.getId());


        assertNotNull(clienteRecuperado);
        assertEquals(cliente.getNombre(), clienteRecuperado.getNombre());
    }

    @Test
    public void testUpdateCliente() {

        Cliente cliente = new Cliente();
        cliente.setNombre("Pedro Ramirez");
        clienteRepository.save(cliente);


        cliente.setNombre("Pedro González");
        clienteRepository.update(cliente);


        Cliente clienteActualizado = clienteRepository.findById(cliente.getId());
        assertEquals("Pedro González", clienteActualizado.getNombre());
    }

    @Test
    public void testDeleteCliente() {

        Cliente cliente = new Cliente();
        cliente.setNombre("Ana Martínez");
        clienteRepository.save(cliente);

        clienteRepository.delete(cliente.getId());


        Cliente clienteBorrado = clienteRepository.findById(cliente.getId());
        assertNull(clienteBorrado);
    }

}
