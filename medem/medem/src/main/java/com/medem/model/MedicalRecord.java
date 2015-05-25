package com.medem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="medical_record")
public class MedicalRecord {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @Column(name="currentAilment")
    private String currentAilment;
    
    @Column(name="analisis")
    private String analisis;
    
    @Column(name="treatment")
    private String treatment;
    
    @Column(name="employeeId")
	private int employeeId;
    
    @Column(name="userName")
    private String userName;
    
    @Column(name="createdAt")
    private String createdAt;
    
    @Transient
    public final static int EXAM_TYPE_ENTRY = 1;
    
    @Transient
    private String[] personalPathologicals;
    
    @OneToOne
    @JoinColumn(name="id")
    @Cascade({CascadeType.ALL})
    private PhysicalExploration physicalExploration;
    
    @OneToOne
    @JoinColumn(name="id")
    @Cascade({CascadeType.ALL})
    private SexualActivity sexualActivity;

    @OneToOne
    @JoinColumn(name="id")
    @Cascade({CascadeType.ALL})
    private EmployeeRisk employeeRisk;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCurrentAilment() {
		return currentAilment;
	}
	public void setCurrentAilment(String currentAilment) {
		this.currentAilment = currentAilment;
	}
	public String getAnalisis() {
		return analisis;
	}
	public void setAnalisis(String analisis) {
		this.analisis = analisis;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
    
    public String getTreatment() {
		return treatment;
	}
	
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String[] getPersonalPathologicals() {
		return personalPathologicals;
	}
	
	public void setPersonalPathologicals(String[] personalPathologicals) {
		this.personalPathologicals = personalPathologicals;
	}	
	
	
	@Override
	public String toString(){
		return "MedicalRecord: [pathologicals: " + personalPathologicals 
				+ ", analisis: " + analisis 
				+ ", userName: " + userName
				+ "]";
	}
	
	public EmployeeRisk getEmployeeRisk() {
		return employeeRisk;
	}
	public void setEmployeeRisk(EmployeeRisk employeeRisk) {
		this.employeeRisk = employeeRisk;
	}
	public PhysicalExploration getPhysicalExploration() {
		return physicalExploration;
	}
	public void setPhysicalExploration(PhysicalExploration physicalExploration) {
		this.physicalExploration = physicalExploration;
	}
	public SexualActivity getSexualActivity() {
		return sexualActivity;
	}
	public void setSexualActivity(SexualActivity sexualActivity) {
		this.sexualActivity = sexualActivity;
	}
    
	
}
