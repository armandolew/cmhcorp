package com.medem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="family_history")
public class FamilyHistory {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;	
	
	private Integer relative;
	private Integer disease;
	private Integer ageDisease;
	private Integer alive;
	private Integer employee_id;
	private String remarks;
	
	@JoinColumn(name="employee_id")
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Integer getRelative() {
		return relative;
	}
	public void setRelative(Integer relative) {
		this.relative = relative;
	}
	public Integer getDisease() {
		return disease;
	}
	public void setDisease(Integer disease) {
		this.disease = disease;
	}
	public Integer getAgeDisease() {
		return ageDisease;
	}
	public void setAgeDisease(Integer ageDisease) {
		this.ageDisease = ageDisease;
	}
	public Integer getAlive() {
		return alive;
	}
	public void setAlive(Integer alive) {
		this.alive = alive;
	}
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "FamilyHistory [relative=" + relative + ", disease=" + disease
				+ ", ageDisease=" + ageDisease + ", alive=" + alive
				+ ", employee_id=" + employee_id + "]";
	}	
	
	public String getRelative(int relative){
		String relativeString;
		
		switch(relative){
		case 1: relativeString = "Abuela materna";
		break;
		
		case 2: relativeString = "Abuela paterna";
		break;
		
		case 3: relativeString = "Abuelo materno";
		break;
		
		case 4: relativeString = "Abuelo paterno";
		break;
		
		case 5: relativeString = "Madre";
		break;
		
		case 6: relativeString = "Padre";
		break;
		
		case 7: relativeString = "Hermano(a)";
		break;
		
		case 8: relativeString = "Hijo(a)";
		break;
		
		default: relativeString = "Otro";
		break;
		}
		
		return relativeString;
	}
	
	public String getAlive(int alive){
		String aliveString;
		
		if (alive == 1){
			aliveString = "Vivo";
		}
		else{
			aliveString = "Finado";
		}
		
		return aliveString;
	}
	
}
