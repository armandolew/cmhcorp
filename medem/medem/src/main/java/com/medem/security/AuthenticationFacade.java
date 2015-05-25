package com.medem.security;

import org.springframework.security.core.Authentication;


public interface AuthenticationFacade {

	public Authentication getAutentication(); 
}
