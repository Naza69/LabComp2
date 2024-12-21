package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "categoria")

public class Categoria extends Base implements Serializable {

    private String denominacion;
    @Column(name = "id_sucursal")
    private Sucursal sucursal;
    @JoinColumn(name = "id_articulo")
    private Articulo articulos;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_categoria_padre")
    private Categoria categoriaPadre;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Categoria subcategorias ;

    public Categoria() {
    }

    public Categoria(String denominacion, Sucursal sucursal, Articulo articulos, Categoria categoriaPadre, Categoria subcategorias) {
        this.denominacion = denominacion;
        this.sucursal = sucursal;
        this.articulos = articulos;
        this.categoriaPadre = categoriaPadre;
        this.subcategorias = subcategorias;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public Categoria getCategoriaPadre() {
        return categoriaPadre;
    }

    public Articulo getArticulos() {
        return articulos;
    }

    public Categoria getSubcategorias() {
        return subcategorias;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }


    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setCategoriaPadre(Categoria categoriaPadre) {
        this.categoriaPadre = categoriaPadre;
    }

    public void setArticulos(Articulo articulos) {
        this.articulos = articulos;
    }

    public void setSubcategorias(Categoria subcategorias) {
        this.subcategorias = subcategorias;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }


}
