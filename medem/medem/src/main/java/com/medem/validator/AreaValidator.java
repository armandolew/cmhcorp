package com.medem.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Validator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.medem.model.Area;

@Component
public class AreaValidator implements Validator {

    @Override
    public boolean supports(Class clazz){
        return Area.class.isAssignableFrom(clazz);
    }
    
    @Override
    public void validate(Object target, Errors errors){
        ValidationUtils.rejectIfEmpty(errors, "name", "area.name.empty", "Nombre no puede ser vacio");
    }
}
