package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "promocion_detalle")

public class PromocionDetalle extends Base implements Serializable {
    private int cantidad;
    @ManyToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_articulo")
    private Articulo articulo;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_promocion")
    private Promocion promocion;

    public PromocionDetalle() {
    }

    public PromocionDetalle(int cantidad, Articulo articulo, Promocion promocion) {
        this.cantidad = cantidad;
        this.articulo = articulo;
        this.promocion = promocion;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }
}
