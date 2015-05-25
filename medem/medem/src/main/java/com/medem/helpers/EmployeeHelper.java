package com.medem.helpers;

import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;

public class EmployeeHelper {

	
	public String getGender(int gender){
		String employeeGender;
		
		switch(gender){
			case 1: employeeGender = "Femenino"; break;
			case 2: employeeGender = "Masculino"; break;
			default: employeeGender = "Indefinido"; break;
		}
		
		
		return employeeGender;
	}
	
	public String getMaritalStatus(int maritalStatus){
		String employeeMaritalStatus;
		
		switch(maritalStatus){
			case 1: employeeMaritalStatus = "Soltero"; break;
			case 2: employeeMaritalStatus = "Casado"; break;
			default: employeeMaritalStatus = "Indefinido"; break;
		}
		
		return employeeMaritalStatus;
	}
	
	public String getBloodGroup(int bloodGroup){
		String employeeBloodGroup;
		
		switch(bloodGroup){
			case 1: employeeBloodGroup = "A"; break;
			case 2: employeeBloodGroup = "B"; break;
			case 3: employeeBloodGroup = "AB"; break;
			case 4: employeeBloodGroup = "O"; break;
			default: employeeBloodGroup = "Indefinido"; break;
		}
		
		return employeeBloodGroup;
	}
	
	public String getRh(int rh){
		String employeeRh;
		if (rh == 1){
			employeeRh = "[+]";
		}
		else{
			employeeRh = "[-]";
		}
		
		return employeeRh;
	}
	
	public int getEmployeeAge(Date dateOfBirth){
	    System.out.println(dateOfBirth);
		LocalDate dateOfBirthLD = new LocalDate(dateOfBirth.getYear(), dateOfBirth.getMonth(), dateOfBirth.getDay());
		LocalDate currentDateLD = LocalDate.now();
		
		Period period = new Period(dateOfBirthLD, currentDateLD, PeriodType.yearMonthDay());
		return period.getYears();
	}

}
