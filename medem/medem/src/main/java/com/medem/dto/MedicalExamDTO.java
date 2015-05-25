package com.medem.dto;

import java.io.Serializable;

public class MedicalExamDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private int id;	
    private int employeeId;
    private int userId;
    private int motive;
    private String createdAt;
    private String findings;
    private String analisis;
    private String treatment;
    private int type;
    

    /** Campos complementarios **/
    private int employeeRisk;
    private int heartRate;
    private int bloodPressure;
    private int respiratoryRate;
    private float temperature;
    private float weight;
    private float size;
    private float waist;
    private float hips;
    private int weightIndex;
    private float imc;     
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMotive() {
		return motive;
	}
	public void setMotive(int motive) {
		this.motive = motive;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getFindings() {
		return findings;
	}
	public void setFindings(String findings) {
		this.findings = findings;
	}
	public String getAnalisis() {
		return analisis;
	}
	public void setAnalisis(String analisis) {
		this.analisis = analisis;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getEmployeeRisk() {
		return employeeRisk;
	}
	public void setEmployeeRisk(int employeeRisk) {
		this.employeeRisk = employeeRisk;
	}
	public int getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}
	public int getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(int bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public int getRespiratoryRate() {
		return respiratoryRate;
	}
	public void setRespiratoryRate(int respiratoryRate) {
		this.respiratoryRate = respiratoryRate;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public float getWaist() {
		return waist;
	}
	public void setWaist(float waist) {
		this.waist = waist;
	}
	public float getHips() {
		return hips;
	}
	public void setHips(float hips) {
		this.hips = hips;
	}
	public int getWeightIndex() {
		return weightIndex;
	}
	public void setWeightIndex(int weightIndex) {
		this.weightIndex = weightIndex;
	}
	public float getImc() {
		return imc;
	}
	public void setImc(float imc) {
		this.imc = imc;
	}
    
    

}
