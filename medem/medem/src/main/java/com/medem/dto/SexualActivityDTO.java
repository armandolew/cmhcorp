package com.medem.dto;

import java.io.Serializable;

public class SexualActivityDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private int id;
    private int examId;
    private int examType;
    private int ivsa;
    private int contraceptiveMethod;
    private int ets;
    private int menarche;
    private int cycles;
    private int rhythm;
    private int pregnancies;
    private int stops;
    private int abortions;
    private int csections;
    private int menopause;
    private String prevention;
    private int result;
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

}
