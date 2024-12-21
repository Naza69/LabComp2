package org.example.entities;

import org.example.entities.enums.Rol;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cliente")

public class Cliente extends Persona implements Serializable {
    private Rol cliente;
    @Column(name = "id_domicilio")
    private Domicilio domicilios;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_usuario_cliente")
    private Usuario_Cliente usuarioCliente;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_imagen_cliente")
    private Imagen_Cliente imagenCliente;
    @Column(name = "id_pedido")
    private Pedido pedidos;

    public Cliente() {
    }

    public Cliente(Rol cliente, Domicilio domicilios, Usuario_Cliente usuarioCliente, Imagen_Cliente imagenCliente, Pedido pedidos) {
        this.cliente = cliente;
        this.domicilios = domicilios;
        this.usuarioCliente = usuarioCliente;
        this.imagenCliente = imagenCliente;
        this.pedidos = pedidos;
    }

    public Pedido getPedidos() {
        return pedidos;
    }

    public Rol getCliente() {
        return cliente;
    }

    public Domicilio getDomicilios() {
        return domicilios;
    }

    public Usuario_Cliente getUsuarioCliente() {
        return usuarioCliente;
    }

    public Imagen_Cliente getImagenCliente() {
        return imagenCliente;
    }

    public void setCliente(Rol cliente) {
        this.cliente = cliente;
    }

    public void setDomicilios(Domicilio domicilios) {
        this.domicilios = domicilios;
    }

    public void setUsuarioCliente(Usuario_Cliente usuarioCliente) {
        this.usuarioCliente = usuarioCliente;
    }

    public void setImagenCliente(Imagen_Cliente imagenCliente) {
        this.imagenCliente = imagenCliente;
    }

    public void setPedidos(Pedido pedidos) {
        this.pedidos = pedidos;
    }
}
