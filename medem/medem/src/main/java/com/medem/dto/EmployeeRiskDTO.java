package com.medem.dto;

import java.io.Serializable;

public class EmployeeRiskDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private int id;	
    private int examId;
    private int value;
    private String createdAt;
    private int employeeId;
    
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
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}	

}
