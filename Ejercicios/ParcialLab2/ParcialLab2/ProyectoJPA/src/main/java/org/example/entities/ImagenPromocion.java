package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "imagen_promocion")
public class ImagenPromocion extends Base implements Serializable {
    private String denomincaion;

    public ImagenPromocion() {
    }

    public ImagenPromocion(String denomincaion) {
        this.denomincaion = denomincaion;
    }

    public String getDenomincaion() {
        return denomincaion;
    }

    public void setDenomincaion(String denomincaion) {
        this.denomincaion = denomincaion;
    }
}
