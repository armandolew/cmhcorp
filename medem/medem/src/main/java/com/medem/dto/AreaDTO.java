package com.medem.dto;

import java.io.Serializable;

import com.medem.model.Company;

public class AreaDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private int id; 
    private String name;
    private String createdAt;
    private String createdBy;
    private Company company;
    private Boolean enabled;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public Company getCompany() {
        return company;
    }
    public void setCompany(Company company) {
        this.company = company;
    }
    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    
    
}