package com.medem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="employee_risk")
public class EmployeeRisk {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;	
    
    @NotNull
    @Column(name="examId")
    private int examId;
    
    @NotNull
    @Column(name="value")
    private int value;
    
    @NotNull
    @Column(name="createdAt")
    private String createdAt;
    
    @NotNull
    @Column(name="employeeId")
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
	
	@Override
	public String toString(){
		return "EmployeeRisk: [" +
				"examId: " + examId +
				", value: " + value +
				"]";
	}
	
}
