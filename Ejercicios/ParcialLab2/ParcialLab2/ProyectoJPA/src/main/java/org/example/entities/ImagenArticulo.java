package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "imagen_articulo")

public class ImagenArticulo extends Base implements Serializable {
    private String denominacion;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_articulo")
    private Articulo articulo;

    public ImagenArticulo() {
    }

    public ImagenArticulo(String denominacion, Articulo articulo) {
        this.denominacion = denominacion;
        this.articulo = articulo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }
}
