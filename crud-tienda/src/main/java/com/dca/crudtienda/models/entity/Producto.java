package com.dca.crudtienda.models.entity;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String descpri;
    private double precio;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescpri() {
        return descpri;
    }

    public void setDescpri(String descpri) {
        this.descpri = descpri;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    private static final long serialVersionUID = 1l;

}
