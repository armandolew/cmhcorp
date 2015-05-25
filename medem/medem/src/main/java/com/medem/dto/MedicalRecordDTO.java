package com.medem.dto;

import java.io.Serializable;

import com.medem.model.EmployeeRisk;
import com.medem.model.PhysicalExploration;
import com.medem.model.SexualActivity;

public class MedicalRecordDTO implements Serializable {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
    private String currentAilment;
    private String analisis;
    private String treatment;
    private int employeeId;
    private String userName;
    private String createdAt;
    private String[] personalPathologicals;
   
    
    private PhysicalExploration physicalExploration;
    private SexualActivity sexualActivity;
    private EmployeeRisk employeeRisk;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCurrentAilment() {
		return currentAilment;
	}
	public void setCurrentAilment(String currentAilment) {
		this.currentAilment = currentAilment;
	}
	public String getAnalisis() {
		return analisis;
	}
	public void setAnalisis(String analisis) {
		this.analisis = analisis;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public String[] getPersonalPathologicals() {
		return personalPathologicals;
	}
	
	public void setPersonalPathologicals(String[] personalPathologicals) {
		this.personalPathologicals = personalPathologicals;
	}
	public EmployeeRisk getEmployeeRisk() {
		return employeeRisk;
	}
	public void setEmployeeRisk(EmployeeRisk employeeRisk) {
		this.employeeRisk = employeeRisk;
	}
	public PhysicalExploration getPhysicalExploration() {
		return physicalExploration;
	}
	public void setPhysicalExploration(PhysicalExploration physicalExploration) {
		this.physicalExploration = physicalExploration;
	}
	public SexualActivity getSexualActivity() {
		return sexualActivity;
	}
	public void setSexualActivity(SexualActivity sexualActivity) {
		this.sexualActivity = sexualActivity;
	}
    
}