package com.medem.helpers;

public class FamilyHistoryHelper {

	public String getRelativeDisease(int id){
		String relativeDisease;
		
		switch(id){
		case 1: 
				relativeDisease = "Diabetes mellitus";
				break;
				
		case 2:
				relativeDisease = "Hipertensión arterial";
				break;
				
		case 3: 
				relativeDisease = "Cardiopatias";
				break;
				
		case 4:
				relativeDisease = "Hepatopatías";
				break;
				
		case 5:
				relativeDisease = "Nefropatías";
				break;
				
		case 6:
				relativeDisease = "Endocrinopatías";
				break;
				
		case 7:
				relativeDisease = "Enfermedades mentales";
				break;
				
		case 8:
				relativeDisease = "Epilepsia";
				break;
				
		case 9:
				relativeDisease = "Asma";
				break;
				
		case 10:
				relativeDisease = "Cáncer de mama";
				break;
				
		case 11:
				relativeDisease = "Cáncer cervicouterino";
				break;
		
		case 12:
				relativeDisease = "Cáncer de pulmón";
				break;
				
		case 13:
				relativeDisease = "Cáncer digestivo";
				break;
				
		default:
				relativeDisease = "Ninguna";
				break;
		}
		
		return relativeDisease;
	}
	
}
