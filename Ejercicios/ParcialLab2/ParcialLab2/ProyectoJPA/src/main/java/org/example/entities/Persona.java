package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@MappedSuperclass

public abstract class Persona extends Base implements Serializable {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
