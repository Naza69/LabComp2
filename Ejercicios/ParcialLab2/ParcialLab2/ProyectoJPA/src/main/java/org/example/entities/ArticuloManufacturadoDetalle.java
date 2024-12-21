package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "detalle_articulo_manufacturado")
public class ArticuloManufacturadoDetalle extends Base implements Serializable {
    private Integer cantidad;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_articulo_insumo")
    private ArticuloInsumo articuloInsumo;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_articulo_manufacturado")
    private ArticuloManufacturado articuloManufacturado;

    public ArticuloManufacturadoDetalle() {
    }

    public ArticuloManufacturadoDetalle(Integer cantidad, ArticuloInsumo articuloInsumo,ArticuloManufacturado articuloManufacturado) {
        this.cantidad = cantidad;
        this.articuloInsumo = articuloInsumo;
        this.articuloManufacturado = articuloManufacturado;
    }

    public ArticuloManufacturado getArticuloManufacturado() {
        return articuloManufacturado;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public ArticuloInsumo getArticuloInsumo() {
        return articuloInsumo;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public void setArticuloInsumo(ArticuloInsumo articuloInsumo) {
        this.articuloInsumo = articuloInsumo;
    }

    public void setArticuloManufacturado(ArticuloManufacturado articuloManufacturado) {
        this.articuloManufacturado = articuloManufacturado;
    }
}
