package com.medem.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="physical_exploration")
public class PhysicalExploration implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Column(name="heartRate")
    private int heartRate;
    
    @NotNull
    @Column(name="bloodPressure")
    private int bloodPressure;
    
    @NotNull
    @Column(name="respiratoryRate")
    private int respiratoryRate;
    
    @NotNull
    @Column(name="temperature")
    private float temperature;
    
    @NotNull
    @Column(name="weight")
    private float weight;
    
    @NotNull
    @Column(name="size")
    private float size;
    
    @NotNull
    @Column(name="waist")
    private float waist;
    
    @NotNull
    @Column(name="hips")
    private float hips;
    
    @NotNull
    @Column(name="weightIndex")
    private int weightIndex;
    
    @NotNull
    @Column(name="imc")
    private float imc;
    
    @Column(name="general")
    private String general;
    
    @Column(name="head")
    private String head;
    
    @Column(name="torax")
    private String torax;
    
    @Column(name="abdomen")
    private String abdomen;
    
    @Column(name="limbs")
    private String limbs;
    
    @Column(name="genitals")
    private String genitals;
    
    @Column(name="nervousSystem")
    private String nervousSystem;

//  //TODO actualizar metodo
//    @Override
//    public String toString(){
//        return "Exploracion Fisica: [" +               
//               ", heartRate: " + heartRate +
//               ", bloodPressure: " + bloodPressure +
//               ", respiratoryRate: " + respiratoryRate + 
//               ", temperature: " + temperature +
//               ", weight: " + weight +
//               ", hips: " + hips +
//               ", weightIndex: " + weightIndex +
//               ", imc: " + imc +
//               ", general: " + general + 
//               ", head: " + head +
//               ", torax: " + torax +
//               ", abdomen: " + abdomen +
//               ", limbs: " + limbs +
//               ", genitals: " + genitals +
//               ", nervousSystem: " + nervousSystem +               
//               "]";
//    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    
}
