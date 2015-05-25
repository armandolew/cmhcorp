package com.medem.dto;

import java.io.Serializable;

public class MedicalNoteDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
    private Integer heartRate;
    private Integer bloodPressure;
    private Integer respiratoryRate;
    private Float temperature;
    private Float weight;
    private Float size;
    private Float waist;
    private Float hips;
    private Integer weightIndex;
    private String findings;
    private String analisis;
    private String treatment;
    private Integer employee_id;
    private Integer type;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(Integer heartRate) {
		this.heartRate = heartRate;
	}
	public Integer getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(Integer bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public Integer getRespiratoryRate() {
		return respiratoryRate;
	}
	public void setRespiratoryRate(Integer respiratoryRate) {
		this.respiratoryRate = respiratoryRate;
	}
	public Float getTemperature() {
		return temperature;
	}
	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}
	public Float getWeight() {
		return weight;
	}
	public void setWeight(Float weight) {
		this.weight = weight;
	}
	public Float getSize() {
		return size;
	}
	public void setSize(Float size) {
		this.size = size;
	}
	public Float getWaist() {
		return waist;
	}
	public void setWaist(Float waist) {
		this.waist = waist;
	}
	public Float getHips() {
		return hips;
	}
	public void setHips(Float hips) {
		this.hips = hips;
	}
	public Integer getWeightIndex() {
		return weightIndex;
	}
	public void setWeightIndex(Integer weightIndex) {
		this.weightIndex = weightIndex;
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
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

}
