package com.medem.helpers;

public class CompanyHelper {

	public String getActivity(int activityId){
		String activity;
		
		switch(activityId){
		case 1: activity = "Ventas"; break;
		case 2: activity = "Tecnologia"; break;
		case 3: activity = "Sector agrario"; break;
		case 4: activity = "Metalurgia"; break;
		case 5: activity = "Administrativo"; break;
		default: activity = "Ninguno"; break;
		}
		
		return activity;
	}
	
}

