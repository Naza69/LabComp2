package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "domicilio")

public class Domicilio extends Base implements Serializable {
    private String calle;
    private Integer numero;
    private Integer cp;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_localidad")
    private Localidad localidad;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_cliente")
    private Cliente clientes;

    public Domicilio() {
    }

    public Domicilio(String calle, Integer numero, Integer cp, Localidad localidad, Cliente clientes) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.localidad = localidad;
        this.clientes = clientes;
    }

    public String getCalle() {
        return calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getCp() {
        return cp;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }
}
