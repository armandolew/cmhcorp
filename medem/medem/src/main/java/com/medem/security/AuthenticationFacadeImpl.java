package com.medem.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public class AuthenticationFacadeImpl implements AuthenticationFacade {

	public AuthenticationFacadeImpl(){
		super();
	}
	
	@Override
	public final Authentication getAutentication() {
		return SecurityContextHolder.getContext().getAuthentication();
	}

}
