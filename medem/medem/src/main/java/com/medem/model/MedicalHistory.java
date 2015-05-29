package com.medem.model;

import java.io.Serializable;
import java.sql.Timestamp;

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

@Entity
@Table(name="medical_history")
public class MedicalHistory implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(name="createdAt")
    private Timestamp createdAt;
    
    @Column(name="analysis")
    private String analysis;
    
    @Column(name="treatment")
    private String treatment;       
    
    @Column(name="currentCondition")
    private String currentCondition; 
    
    @Column(name="createdBy")
    private String createdBy;
    
    @JoinColumn(name ="id_employee", referencedColumnName = "id", nullable = false)
    //@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Employee employee;   
    
    @JoinColumn(name ="id_sexualActivity", referencedColumnName = "id", nullable = false)
    @OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    private SexualActivity sexualActivity;
    
    @JoinColumn(name ="id_physicalExploration", referencedColumnName = "id", nullable = false)
    @OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    private PhysicalExploration physicalExploration;  
    
    @JoinColumn(name ="id_risk", referencedColumnName = "id", nullable = false)
    @OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    private Risk risk;    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getCurrentCondition() {
        return currentCondition;
    }

    public void setCurrentCondition(String currentCondition) {
        this.currentCondition = currentCondition;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public SexualActivity getSexualActivity() {
        return sexualActivity;
    }

    public void setSexualActivity(SexualActivity sexualActivity) {
        this.sexualActivity = sexualActivity;
    }

    public PhysicalExploration getPhysicalExploration() {
        return physicalExploration;
    }

    public void setPhysicalExploration(PhysicalExploration physicalExploration) {
        this.physicalExploration = physicalExploration;
    }

    public Risk getRisk() {
        return risk;
    }

    public void setRisk(Risk risk) {
        this.risk = risk;
    }
    
 

}