package org.example.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "articulos_manufacturados")

public class ArticuloManufacturado extends Articulo implements Serializable {
    private String descripcion;
    @Column(name = "minutos_estimados")
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    @JoinColumn(name = "id_articulo_manufacturado_detalle")
    private ArticuloManufacturadoDetalle detalles ;

    public ArticuloManufacturado() {
    }

    public ArticuloManufacturado(String descripcion, Integer tiempoEstimadoMinutos, String preparacion, ArticuloManufacturadoDetalle detalles) {
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
        this.detalles = detalles;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public ArticuloManufacturadoDetalle getDetalles() {
        return detalles;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTiempoEstimadoMinutos(Integer tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public void setDetalles(ArticuloManufacturadoDetalle detalles) {
        this.detalles = detalles;
    }
}
