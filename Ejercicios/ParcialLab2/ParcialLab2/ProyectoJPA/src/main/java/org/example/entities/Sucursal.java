package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "sucursal")
public class Sucursal extends Base implements Serializable {
    private String nombre;
    @Column(name = "horario_apertura")
    private LocalTime horarioApertura;
    @Column(name = "horario_cierre")
    private LocalTime horarioCierre;
    @Column(name = "casa_matriz")
    private boolean casaMatriz;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_domicilio")
    private Domicilio domicilio;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_categoria")
    private Categoria categorias;
    @Column(name = "id_empleado")
    private Empleado empleados;
    @Column(name = "id_pedido")
    private Pedido pedidos;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_promociones")
    private Promocion promociones;


    public Sucursal() {
    }

    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre, boolean casaMatriz, Domicilio domicilio, Empresa empresa, Categoria categorias, Empleado empleados, Pedido pedidos, Promocion promociones) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.casaMatriz = casaMatriz;
        this.domicilio = domicilio;
        this.empresa = empresa;
        this.categorias = categorias;
        this.empleados = empleados;
        this.pedidos = pedidos;
        this.promociones = promociones;
    }

    public Empleado getEmpleados() {
        return empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public boolean isCasaMatriz() {
        return casaMatriz;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Categoria getCategorias() {
        return categorias;
    }

    public Pedido getPedidos() {
        return pedidos;
    }

    public Promocion getPromociones() {
        return promociones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public void setCasaMatriz(boolean casaMatriz) {
        this.casaMatriz = casaMatriz;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void setCategorias(Categoria categorias) {
        this.categorias = categorias;
    }

    public void setEmpleados(Empleado empleados) {
        this.empleados = empleados;
    }

    public void setPedidos(Pedido pedidos) {
        this.pedidos = pedidos;
    }

    public void setPromociones(Promocion promociones) {
        this.promociones = promociones;
    }
}
