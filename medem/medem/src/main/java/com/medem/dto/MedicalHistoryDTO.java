package com.medem.dto;

import java.io.Serializable;
import java.util.Date;

import com.medem.model.Employee;
import com.medem.model.PhysicalExploration;
import com.medem.model.Risk;
import com.medem.model.SexualActivity;

public class MedicalHistoryDTO implements Serializable {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Date createdAt;
	private String analysis;
	private String treatment;
	private String createdBy;
	private String currentCondition;
	private SexualActivity sexualActivity;
	private Risk risk;
	private Employee employee;
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