package com.medem.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="medical_exam")
public class MedicalExam {
	
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    
    @NotNull
    @Column(name="employeeId")
    private int employeeId;
    
    @NotNull
    @Column(name="userId")
    private int userId;
    
    @NotNull
    @Min(value=1)
    @Column(name="motive")
    private int motive;
    
    @NotNull
    @Column(name="createdAt")
    private String createdAt;
    
    @Column(name="findings")
    private String findings;
    
    @Column(name="analisis")
    private String analisis;
    
    @Column(name="treatment")
    private String treatment;
    
    @NotNull
    @Min(value=1)
    @Column(name="type")
    private int type;
   
    
    @OneToOne
    private PhysicalExploration physicalExploration;

    /** Campos complementarios **/
    @Transient
    @NotNull
    private int employeeRisk;
    
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMotive() {
		return motive;
	}
	public void setMotive(int motive) {
		this.motive = motive;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getFindings() {
		return findings;
	}
	public void setFindings(String findings) {
		this.findings = findings;
	}
	public String getAnalisis() {
		return analisis;
	}
	public void setAnalisis(String analisis) {
		this.analisis = analisis;
	}
	public String getTreatment() {
		return treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}	
	
	public int getEmployeeRisk() {
		return employeeRisk;
	}
	public void setEmployeeRisk(int employeeRisk) {
		this.employeeRisk = employeeRisk;
	}


	
    @Override
    public String toString(){
    	return "Examen Medico: [" +
    				"Tipo: " + type +
    				"Motivo: " + motive +
    				"Hallazgos: " + findings +
    				"Analisis: " + analisis +
    				"Tratamiento: " + treatment +
    				"Riesgo: " + employeeRisk +
    			"]";
    }
    
	public PhysicalExploration getPhysicalExploration() {
		return physicalExploration;
	}
	public void setPhysicalExploration(PhysicalExploration physicalExploration) {
		this.physicalExploration = physicalExploration;
	}

}
