package com.medem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="sexual_activity")
public class SexualActivity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Column(name="examId")
    private int examId;
    
    @NotNull
    @Column(name="examType")
    private int examType;
    
    @Column(name="ivsa")
    private int ivsa;
    
    @Column(name="contraceptiveMethod")
    private int contraceptiveMethod;
    
    @Column(name="ets")
    private int ets;
    
    @Column(name="menarche")
    private int menarche;
    
    @Column(name="cycles")
    private int cycles;
    
    @Column(name="rhythm")
    private int rhythm;
    
    @Column(name="pregnancies")
    private int pregnancies;
    
    @Column(name="stops")
    private int stops;
    
    @Column(name="abortions")
    private int abortions;
    
    @Column(name="csections")
    private int csections;
    
    @Column(name="menopause")
    private int menopause;
    
    @Column(name="prevention")
    private String prevention;
    
    @Column(name="result")
    private int result;
    
    @Column(name="createdAt")
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
	public int getIvsa() {
		return ivsa;
	}
	public void setIvsa(int ivsa) {
		this.ivsa = ivsa;
	}
	public int getContraceptiveMethod() {
		return contraceptiveMethod;
	}
	public void setContraceptiveMethod(int contraceptiveMethod) {
		this.contraceptiveMethod = contraceptiveMethod;
	}
	public int getEts() {
		return ets;
	}
	public void setEts(int ets) {
		this.ets = ets;
	}
	public int getMenarche() {
		return menarche;
	}
	public void setMenarche(int menarche) {
		this.menarche = menarche;
	}
	public int getCycles() {
		return cycles;
	}
	public void setCycles(int cycles) {
		this.cycles = cycles;
	}
	public int getRhythm() {
		return rhythm;
	}
	public void setRhythm(int rhythm) {
		this.rhythm = rhythm;
	}
	public int getPregnancies() {
		return pregnancies;
	}
	public void setPregnancies(int pregnancies) {
		this.pregnancies = pregnancies;
	}
	public int getStops() {
		return stops;
	}
	public void setStops(int stops) {
		this.stops = stops;
	}
	public int getAbortions() {
		return abortions;
	}
	public void setAbortions(int abortions) {
		this.abortions = abortions;
	}
	public int getCsections() {
		return csections;
	}
	public void setCsections(int csections) {
		this.csections = csections;
	}
	public int getMenopause() {
		return menopause;
	}
	public void setMenopause(int menopause) {
		this.menopause = menopause;
	}
	public String getPrevention() {
		return prevention;
	}
	public void setPrevention(String prevention) {
		this.prevention = prevention;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	@Override
	public String toString(){
		return "SexualActivity: [" +
			   "examId" + examId + 
			   ", examType: " + examType +
			   ", ivsa: " + ivsa +
			   ", contraceptive: " + contraceptiveMethod +
			   ", ets: " + ets +
			   ", menarche: " + menarche +
			   ", cycles: " + cycles +
			   ", rhythm: " + rhythm +
			   ", pregnancies: " + pregnancies +
			   ", stops: " + stops +
			   ", abortions: " + abortions +
			   ", csections: " + csections +
			   ", menopause: " + menopause +
			   ", prevention: " + prevention +
			   ", result: " + result +
			   "]";
	}
    
    
}
