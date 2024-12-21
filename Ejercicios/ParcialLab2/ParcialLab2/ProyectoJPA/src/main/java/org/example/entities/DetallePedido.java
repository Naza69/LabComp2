package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "detalle_pedido")
public class DetallePedido extends Base implements Serializable {
    private Integer cantidad;
    private double subTotal;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_pedido")
    private Pedido pedido;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_articulo")
    private Articulo articulo;

    public DetallePedido() {
    }

    public DetallePedido(Integer cantidad, double subTotal, Pedido pedido, Articulo articulo) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.pedido = pedido;
        this.articulo = articulo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
}
