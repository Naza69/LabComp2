package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "unidad_medida")
public class UnidadMedida extends Base implements Serializable {
    private String denominacion;

    public UnidadMedida() {
    }

    public UnidadMedida(String denominacionl) {
        this.denominacion = denominacionl;
    }

    public String getDenominacionl() {
        return denominacion;
    }

    public void setDenominacionl(String denominacionl) {
        this.denominacion = denominacionl;
    }
}
