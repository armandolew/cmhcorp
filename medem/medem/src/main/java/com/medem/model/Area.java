package com.medem.model;

import java.io.Serializable;

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
@Table(name="area")
public class Area implements Serializable{
	
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;	
    
    @NotEmpty(message="Nombre vacio")
    @Column(name="name")
    private String name;
    
    @NotEmpty
    @Column(name="createdAt")
    private String createdAt;
    
    @NotEmpty
    @Column(name="createdBy")
    private String createdBy;        
        
    @NotNull
    @JoinColumn(name ="id_company", referencedColumnName = "id", nullable = false)
    //@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    @OneToOne(fetch = FetchType.LAZY)
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