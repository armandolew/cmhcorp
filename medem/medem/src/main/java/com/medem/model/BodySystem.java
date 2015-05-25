package com.medem.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="cat_bodySystems")
public class BodySystem implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @JoinColumn(name ="id_typeBoduSystem", referencedColumnName = "id", nullable = false)
    @OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    private TypeBodySystem type;
    
    @NotEmpty
    @Column(name="bodySystem")
    private String bodySystem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypeBodySystem getType() {
        return type;
    }

    public void setType(TypeBodySystem type) {
        this.type = type;
    }

    public String getBodySystem() {
        return bodySystem;
    }

    public void setBodySystem(String bodySystem) {
        this.bodySystem = bodySystem;
    }
    
}