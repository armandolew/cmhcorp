package com.medem.helpers;

import java.util.List;

import org.springframework.validation.FieldError;

public class ErrorsHelper {

	public String getErrorMessages(List<FieldError> errors){
		String fieldErrors = "Los siguientes campos presentan error: <br/>";
		
		if(errors != null){
		    for(FieldError fieldError : errors){
		        fieldErrors += fieldError.getField();
		    }
		}
		
		return fieldErrors;
	}
}
