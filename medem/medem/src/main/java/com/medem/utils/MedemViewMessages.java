package com.medem.utils;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

@Component
public class MedemViewMessages {
    
    @Autowired
    private MedemResourceBundle medemResourceBundle;

    public StringBuilder getErrorMessages(BindingResult result){
        List<ObjectError> allErrors = result.getAllErrors();
        StringBuilder messages = new StringBuilder();
        
        for(int i = 0; i < allErrors.size(); i++){
            messages.append(medemResourceBundle.getValue(result.getFieldErrors().get(i).getCode()));
        }
        return messages;
        
    }
}
