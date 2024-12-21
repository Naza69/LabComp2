package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "articulo")
public abstract class Articulo extends Base implements Serializable {
    protected String denomincion;
    @Column(name = "precio_de_venta")
    protected double precioVenta;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "unidad_medida")
    private UnidadMedida unidadMedida;
    @JoinColumn(name = "id_imagen_articulo")
    private ImagenArticulo imagenesArticulo ;


    public Categoria getCategoria() {
        return categoria;
    }

    public String getDenomincion() {
        return denomincion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public ImagenArticulo getImagenesArticulo() {
        return imagenesArticulo;
    }

    public void setDenomincion(String denomincion) {
        this.denomincion = denomincion;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }


    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setImagenesArticulo(ImagenArticulo imagenesArticulo) {
        this.imagenesArticulo = imagenesArticulo;

    }
}
