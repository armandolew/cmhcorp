package com.medem.dto;

import java.io.Serializable;

public class RiskDTO implements Serializable {

    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int id;
    private String riskLevel;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRiskLevel() {
        return riskLevel;
    }
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
    
}
