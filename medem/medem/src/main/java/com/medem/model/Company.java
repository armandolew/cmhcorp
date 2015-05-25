package com.medem.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="company")
public class Company implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @NotNull
    private int id;	
    
    @NotNull
    @Column(name="name")
    @Size(min = 1, max = 250)
    private String name;
    
    @NotNull
    @Column(name="businessName")
    @Size(min = 1, max = 250)
    private String bussinesName;
    
    /** Numbers of employees registered to the company **/
    @NotNull
    @Column(name="employeeRegistration")
    private Integer employeeRegistration;
    
    /** The activity performed by the company**/
    @NotNull
    @JoinColumn(name = "id_activity_company", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)    
    private ActivityCompany activity;
    
    /** Date of registration of the company  **/
    @NotNull
    @Column(name="createdAt")
    private Date createdAt;
    
    @Column(name="main_doctor")
    private String main_doctor;
    
    /** Name of the administrator who created the {@link Company} **/
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

    public String getMain_doctor() {
        return main_doctor;
    }

    public void setMain_doctor(String main_doctor) {
        this.main_doctor = main_doctor;
    }
    
    @Override
    public String toString(){
        return "Company: { "
               + "name: " + name
               + ", businessName: " + bussinesName
               + ", employeeRegistration: " + employeeRegistration
               + ", activity: " + activity
               + ", main_doctor: " + main_doctor
               + "}";
    }
}