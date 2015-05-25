package com.medem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="cat_type_bodySystems")
public class TypeBodySystem implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @NotEmpty
    @Column(name="bodySystem")
    private String typeBodySystem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeBodySystem() {
        return typeBodySystem;
    }

    public void setTypeBodySystem(String typeBodySystem) {
        this.typeBodySystem = typeBodySystem;
    }

}