package org.example.entities;

import org.example.entities.enums.Rol;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "empleado")
public class Empleado extends Persona implements Serializable {
    @Column(name = "id_empleado")
    private Rol empleado;
    @Column(name = "id_pedido")
    private Pedido pedido;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_imagen_empleado")
    private Imagen_Empleado imagenEmpleado;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_usuario_empleado")
    private Usuario_Empleado usuarioEmpleado;

    public Empleado() {
    }

    public Empleado(Rol empleado, Pedido pedido, Sucursal sucursal, Imagen_Empleado imagenEmpleado, Usuario_Empleado usuarioEmpleado) {
        this.empleado = empleado;
        this.pedido = pedido;
        this.sucursal = sucursal;
        this.imagenEmpleado = imagenEmpleado;
        this.usuarioEmpleado = usuarioEmpleado;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Usuario_Empleado getUsuarioEmpleado() {
        return usuarioEmpleado;
    }

    public Rol getEmpleado() {
        return empleado;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public Imagen_Empleado getImagenEmpleado() {
        return imagenEmpleado;
    }

    public Usuario_Empleado getUsuaroEmpleado() {
        return usuarioEmpleado;
    }

    public void setEmpleado(Rol empleado) {
        this.empleado = empleado;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public void setImagenEmpleado(Imagen_Empleado imagenEmpleado) {
        this.imagenEmpleado = imagenEmpleado;
    }

    public void setUsuaroEmpleado(Usuario_Empleado usuaroEmpleado) {
        this.usuarioEmpleado = usuaroEmpleado;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setUsuarioEmpleado(Usuario_Empleado usuarioEmpleado) {
        this.usuarioEmpleado = usuarioEmpleado;
    }
}
