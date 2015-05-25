/**
 * 
 */
package com.medem.dto;

import java.io.Serializable;
import java.util.Date;

import com.medem.model.ActivityCompany;

/**
 * @author indigo
 *
 */
public class CompanyDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String bussinesName;
	private Integer employeeRegistration;
	private ActivityCompany activity;
	private Date createdAt;
	private String main_doctor;
	private String createdBy;
	private Boolean enabled;
	
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBussinesName() {
        return bussinesName;
    }
    public void setBussinesName(String bussinesName) {
        this.bussinesName = bussinesName;
    }
    public Integer getEmployeeRegistration() {
        return employeeRegistration;
    }
    public void setEmployeeRegistration(Integer employeeRegistration) {
        this.employeeRegistration = employeeRegistration;
    }
    public ActivityCompany getActivity() {
        return activity;
    }
    public void setActivity(ActivityCompany activity) {
        this.activity = activity;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public String getMain_doctor() {
        return main_doctor;
    }
    public void setMain_doctor(String main_doctor) {
        this.main_doctor = main_doctor;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
	
	
}
