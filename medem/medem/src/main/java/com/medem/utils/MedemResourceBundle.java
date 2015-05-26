package com.medem.utils;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class MedemResourceBundle {
        
    @Autowired
    private MessageSource messageSource;         
    
    public String getValue(String key){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(key, new Object[0], locale);
    }   
    
}
