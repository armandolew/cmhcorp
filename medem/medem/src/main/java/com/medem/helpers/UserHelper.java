package com.medem.helpers;

import java.security.Principal;

public class UserHelper {

	private String currentUser;
	Principal principal;
	
	public String getCurrentUser(){
	    currentUser = principal.getName();
		return currentUser;
	}
	

}
