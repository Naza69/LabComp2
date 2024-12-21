package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "imagen_cliente")

public class Imagen_Cliente extends Base implements Serializable {
    private String denominacion;

    public Imagen_Cliente() {
    }

    public Imagen_Cliente(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
