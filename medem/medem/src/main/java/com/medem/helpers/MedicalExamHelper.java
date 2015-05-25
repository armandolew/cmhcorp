package com.medem.helpers;

public class MedicalExamHelper {

	public String getExamType(int type){
		String examType;
		
		switch(type){
			case 2:
					examType = "Consulta";
					break;
			
			case 3:
					examType = "Seguimiento";
					break;
			
			default:
					examType = "Ninguno";
					break;
		}
		
		
		return examType;
	}
	
}
