package com.medem.dto;

import java.io.Serializable;

public class WorkBackgroundDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private int id;	
	private String name;
	private String activities;
	private String accidents;
	private String startDate;
	private String endDate;
	private Integer employeeId;
	private String userName;
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActivities() {
		return activities;
	}
	public void setActivities(String activities) {
		this.activities = activities;
	}
	public String getAccidents() {
		return accidents;
	}
	public void setAccidents(String accidents) {
		this.accidents = accidents;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	
	

}
