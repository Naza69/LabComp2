package org.example.entities;

import org.example.entities.enums.TipoPromocion;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "promocion")
public class Promocion extends Base implements Serializable {

    @Column(name = "id_sucursal")
    private Sucursal sucursal;
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_imagen_promocion")
    private ImagenPromocion imagenPromocion;
    @JoinColumn(name = "id_promocion_detalle")
    private PromocionDetalle detalles;



    public Promocion() {
    }

    public Promocion(Sucursal sucursal, String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde, LocalTime horaHasta, String descripcionDescuento, Double precioPromocional, TipoPromocion tipoPromocion, ImagenPromocion imagenPromocion, PromocionDetalle detalles) {
        this.sucursal = sucursal;
        this.denominacion = denominacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.descripcionDescuento = descripcionDescuento;
        this.precioPromocional = precioPromocional;
        this.tipoPromocion = tipoPromocion;
        this.imagenPromocion = imagenPromocion;
        this.detalles = detalles;
    }

    public ImagenPromocion getImagenPromocion() {
        return imagenPromocion;
    }
    public Double getPrecioPromocional() {
        return precioPromocional;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public LocalTime getHoraDesde() {
        return horaDesde;
    }

    public LocalTime getHoraHasta() {
        return horaHasta;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public String getDescripcionDescuento() {
        return descripcionDescuento;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public TipoPromocion getTipoPromocion() {
        return tipoPromocion;
    }

    public PromocionDetalle getDetalles() {
        return detalles;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public void setDescripcionDescuento(String descripcionDescuento) {
        this.descripcionDescuento = descripcionDescuento;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public void setHoraDesde(LocalTime horaDesde) {
        this.horaDesde = horaDesde;
    }

    public void setHoraHasta(LocalTime horaHasta) {
        this.horaHasta = horaHasta;
    }

    public void setPrecioPromocional(Double precioPromocional) {
        this.precioPromocional = precioPromocional;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public void setTipoPromocion(TipoPromocion tipoPromocion) {
        this.tipoPromocion = tipoPromocion;
    }

    public void setImagenPromocion(ImagenPromocion imagenPromocion) {
        this.imagenPromocion = imagenPromocion;
    }

    public void setDetalles(PromocionDetalle detalles) {
        this.detalles = detalles;
    }
}
