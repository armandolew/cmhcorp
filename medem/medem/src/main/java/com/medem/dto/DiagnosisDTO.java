package com.medem.dto;

import java.io.Serializable;

import com.medem.model.TypeDiagnosis;

public class DiagnosisDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int id;
    private TypeDiagnosis type;
    private String name;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public TypeDiagnosis getType() {
        return type;
    }
    public void setType(TypeDiagnosis type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
