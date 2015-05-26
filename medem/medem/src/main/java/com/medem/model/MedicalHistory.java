package com.medem.model;

import java.io.Serializable;
import java.util.Date;

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

/**
 * <b>MedicalHistory</b> details {@link Employee}employee's medical information
 * @author indigo
 *
 */

@Entity
@Table(name="medical_record")
public class MedicalHistory implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @Id
    @NotNull
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Column(name="createdAt")
    private Date createdAt;
    
    private String analysis;
    
    private String treatment;
    
    @NotNull
    @Column(name="createdBy")
    private String createdBy;
    
    private String currentCondition;
    
    @NotNull
    @JoinColumn(name="id_sexualActivity", referencedColumnName = "id", nullable = false)
    @OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    private SexualActivity sexualActivity;
    
    @NotNull
    @JoinColumn(name="id_risk", referencedColumnName = "id", nullable = false)
    @OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    private Risk risk; 
    
    @NotNull
    @JoinColumn(name ="id_company", referencedColumnName = "id", nullable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private Employee employee;
    
    @NotNull
    @JoinColumn(name="id_physicalExploration", referencedColumnName = "id", nullable = false)
    @OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    private PhysicalExploration physicalExploration;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
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

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCurrentCondition() {
        return currentCondition;
    }

    public void setCurrentCondition(String currentCondition) {
        this.currentCondition = currentCondition;
    }

    public SexualActivity getSexualActivity() {
        return sexualActivity;
    }

    public void setSexualActivity(SexualActivity sexualActivity) {
        this.sexualActivity = sexualActivity;
    }

    public Risk getRisk() {
        return risk;
    }

    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public PhysicalExploration getPhysicalExploration() {
        return physicalExploration;
    }

    public void setPhysicalExploration(PhysicalExploration physicalExploration) {
        this.physicalExploration = physicalExploration;
    }
    
    
    
}
