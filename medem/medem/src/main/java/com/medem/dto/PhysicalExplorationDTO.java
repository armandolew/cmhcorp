package com.medem.dto;

import java.io.Serializable;

public class PhysicalExplorationDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private int id;	
    private int examId;
    private int examType;
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
    private String general;
    private String head;
    private String torax;
    private String abdomen;
    private String limbs;
    private String genitals;
    private String nervousSystem;
    private String createdAt;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public int getExamType() {
		return examType;
	}
	public void setExamType(int examType) {
		this.examType = examType;
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
	public String getGeneral() {
		return general;
	}
	public void setGeneral(String general) {
		this.general = general;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getTorax() {
		return torax;
	}
	public void setTorax(String torax) {
		this.torax = torax;
	}
	public String getAbdomen() {
		return abdomen;
	}
	public void setAbdomen(String abdomen) {
		this.abdomen = abdomen;
	}
	public String getLimbs() {
		return limbs;
	}
	public void setLimbs(String limbs) {
		this.limbs = limbs;
	}
	public String getGenitals() {
		return genitals;
	}
	public void setGenitals(String genitals) {
		this.genitals = genitals;
	}
	public String getNervousSystem() {
		return nervousSystem;
	}
	public void setNervousSystem(String nervousSystem) {
		this.nervousSystem = nervousSystem;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}	

}
