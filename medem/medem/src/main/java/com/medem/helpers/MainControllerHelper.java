package com.medem.helpers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainControllerHelper {

	private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	private Date date = new Date();
	private String currentDate = dateFormat.format(date);

	
	public String getCurrentDate(){
		return currentDate;
	}
	
}
