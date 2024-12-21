package org.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "usuario_cliente")

public class Usuario_Cliente extends Base implements Serializable {
    private String auth0Id;
    @Column(name = "nombre_de_usuario")
    private String username;

    @Column(name = "id_cliente")
    private Cliente cliente;

    public Usuario_Cliente() {
    }

    public Usuario_Cliente(String auth0Id, String username, Cliente cliente) {
        this.auth0Id = auth0Id;
        this.username = username;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getAuth0Id() {
        return auth0Id;
    }

    public String getUsername() {
        return username;
    }

    public void setAuth0Id(String auth0Id) {
        this.auth0Id = auth0Id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
