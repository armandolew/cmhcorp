package com.medem.service.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.medem.dto.EmployeeDTO;
import com.medem.service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/mvc-dispatcher-servlet.xml", "classpath:/spring-database.xml"})
public class EmployeeServiceTest {

	@Autowired
	private EmployeeService employeeService;
	
    @Test
    public void testAppCtx(){
	  Assert.assertNotNull(employeeService);
    }
    
    
    @Test
    public void testfindEmployeeById(){
  	  EmployeeDTO employeeDTO = employeeService.getEmployeeById(1);
  	  Assert.assertNotNull(employeeDTO);
  	  Assert.assertEquals(Double.valueOf(1), Double.valueOf(employeeDTO.getId()));
  	  Assert.assertTrue(employeeDTO instanceof EmployeeDTO);
  	  System.out.println(employeeDTO.toString());
  	  
    }
	
}
