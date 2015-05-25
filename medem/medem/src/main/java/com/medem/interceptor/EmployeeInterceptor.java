package com.medem.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class EmployeeInterceptor implements HandlerInterceptor {
	
	@Override 
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        
        if(uri.endsWith("employee")){
        	System.out.println("Pre-handle");
        }
        else if(uri.endsWith("addEmployee")){
        	System.out.println(request.toString());
//        	Employee employee = (Employee) request.getSession().getAttribute("Employee");
        	System.out.println(request.getSession().getAttribute("name"));
        }
         
        return true;
    }

	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
