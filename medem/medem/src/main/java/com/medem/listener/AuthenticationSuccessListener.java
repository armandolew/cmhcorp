package com.medem.listener;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.authentication.event.InteractiveAuthenticationSuccessEvent;

import com.medem.MainController;

public class AuthenticationSuccessListener implements ApplicationListener<ApplicationEvent> {

    private static final Logger logger = Logger.getLogger(MainController.class);
    
	@Override
	public void onApplicationEvent(final ApplicationEvent event) {
	    BasicConfigurator.configure();
	    if (event instanceof AuthenticationSuccessEvent) {
	        logger.info("EVENTO:: Autentificacion Exitosa");  
	    }
	    else if(event instanceof InteractiveAuthenticationSuccessEvent){
	        logger.info("EVENTO:: Interactive Autentificacion Exitosa");
	    }
		
	}

	

}
