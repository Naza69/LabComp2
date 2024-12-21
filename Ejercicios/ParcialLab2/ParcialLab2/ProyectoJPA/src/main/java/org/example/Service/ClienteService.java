package org.example.Service;

import org.example.Repository.ClienteRepository;
import org.example.entities.Cliente;
import javax.persistence.EntityManager;
import java.util.List;

import java.util.List;

public class ClienteService {
    private ClienteRepository clienteRepository;

    public ClienteService(EntityManager entityManager) {
        this.clienteRepository = new ClienteRepository(entityManager);
    }

    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public Cliente findClienteById(Long id) {
        return clienteRepository.findById(id);
    }

    public List<Cliente> findAllClientes() {
        return clienteRepository.findAll();
    }

    public void updateCliente(Cliente cliente) {
        clienteRepository.update(cliente);
    }

    public void deleteCliente(Long id) {
        clienteRepository.delete(id);
    }

}