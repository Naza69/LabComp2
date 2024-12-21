package org.example.entities;

import org.example.entities.enums.Estado;
import org.example.entities.enums.FormaPago;
import org.example.entities.enums.TipoEnvio;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name = "pedido")

public class Pedido extends Base implements Serializable {
    private LocalTime horaEstimadaFinalizacion;
    private double total;
    @Column(name = "costo_total")
    private double totalCosto;
    private Estado estado;
    @Column(name = "tipo_envio")
    private TipoEnvio tipoEnvio;
    @Column(name = "forma_pago")
    private FormaPago formaPago;
    @Column(name = "fecha_pedido")
    private LocalDate fechaPedido;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_sucursal")
    private Sucursal sucursal;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_domicilio")
    private Domicilio domicilio;
    @Column(name = "id_detalle_pedido")
    private DetallePedido detallePedido;
    @OneToOne (cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_factura")
    private Factura factura;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Pedido() {
    }

    public Pedido(LocalTime horaEstimadaFinalizacion, double total, double totalCosto, Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago, LocalDate fechaPedido, Sucursal sucursal, Domicilio domicilio, DetallePedido detallePedido, Factura factura, Empleado empleado, Cliente cliente) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.fechaPedido = fechaPedido;
        this.sucursal = sucursal;
        this.domicilio = domicilio;
        this.detallePedido = detallePedido;
        this.factura = factura;
        this.empleado = empleado;
        this.cliente = cliente;
    }

    public LocalTime getHoraEstimadaFinalizacion() {
        return horaEstimadaFinalizacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getTotal() {
        return total;
    }

    public double getTotalCosto() {
        return totalCosto;
    }

    public Estado getEstado() {
        return estado;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public DetallePedido getDetallePedido() {
        return detallePedido;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setTotalCosto(double totalCosto) {
        this.totalCosto = totalCosto;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setTipoEnvio(TipoEnvio tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void setDetallePedido(DetallePedido detallePedido) {
        this.detallePedido = detallePedido;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
}
