package com.medem.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.medem.model.Employee;
import com.medem.model.PhysicalExploration;
import com.medem.model.Risk;
import com.medem.model.SectionDiagnoses;
import com.medem.model.SectionPersonalNonpathological;
import com.medem.model.SectionPersonalPathological;
import com.medem.model.SexualActivity;

public class MedicalHistoryDTO implements Serializable {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Timestamp createdAt;
	private String analysis;
	private String treatment;
	private String currentCondition; 
	private String createdBy;
	private Employee employee; 
	private SexualActivity sexualActivity;
	private PhysicalExploration physicalExploration;
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