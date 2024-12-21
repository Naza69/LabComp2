package org.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "articulo_insumo")

public class ArticuloInsumo extends Articulo implements Serializable {
    @Column(name = "precio_de_compra")
    private double precioCompra;
    @Column(name = "stock_actual")
    private Integer stockActual;
    @Column(name = "stock_maximo")
    private Integer stockMaximo;
    @Column(name = "es_para_elaborar")
    private boolean esParaElaborar;

    public ArticuloInsumo() {
    }

    public ArticuloInsumo(double precioCompra, Integer stockActual, Integer stockMaximo, boolean esParaElaborar) {
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }


    public double getPrecioCompra() {
        return precioCompra;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public boolean isEsParaElaborar() {
        return esParaElaborar;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public void setEsParaElaborar(boolean esParaElaborar) {
        this.esParaElaborar = esParaElaborar;
    }
}
