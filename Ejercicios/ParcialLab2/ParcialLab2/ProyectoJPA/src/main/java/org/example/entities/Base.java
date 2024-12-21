package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class Base implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
