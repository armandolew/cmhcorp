package com.medem.dto;

import java.io.Serializable;

import com.medem.model.TypeBodySystem;

public class BodySystemDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int id;
    private TypeBodySystem type;
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
