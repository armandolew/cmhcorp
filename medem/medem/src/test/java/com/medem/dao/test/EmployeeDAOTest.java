package com.medem.dao.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.medem.dao.EmployeeDAO;
import com.medem.model.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/mvc-dispatcher-servlet.xml", "classpath:/spring-database.xml"})
public class EmployeeDAOTest {
	
  @Autowired
  private EmployeeDAO employeeDAO;
  
  @Test
  public void testAppCtx(){
	  Assert.assertNotNull(employeeDAO);
  }
  
  @Test
  public void testlistEmployees(){
	  List<Employee> e = employeeDAO.listEmployees();
	  Assert.assertNotNull(e);
	  Assert.assertTrue(!e.isEmpty());
  }
  
  @Test
  public void testaddEmployee(){
	  Employee employee = new Employee();
	  employee.setName("Jorge");
	  employee.setLastName1("Perez");
	  employee.setLastName2("Hernandez");
	  employee.setAddress("Pinos #34, interior 8");
	  employee.setDateOfBirth("1970-12-03");
	  employee.setGender(2);
	  employee.setMaritalStatus(1);
	  employee.setReligion("ninguna");
	  employee.setBloodGroup(2);
	  employee.setOriginPlace("piedras negras");
	  employee.setRh(1);
	  employee.setPhone("5544332211");
	  employee.setTown("Benito Juarez");
	  employee.setZipCode("098765");
	  employee.setContactName("Juana Perez");
	  employee.setContactPhone("3344556678");
	  employee.setArea(4);
	  employee.setUserName("armando");
	  employee.setCreatedAt("2015-04-17");
	  
	  employeeDAO.addEmployee(employee);
	  Assert.assertNotNull(employeeDAO);
	  
  }

  
//  @Test
//  public void testaddEmployee(){
//	  Employee nuevo = new Employee();
//	  Assert.assertNotNull(e);
//	  Assert.assertTrue(!e.isEmpty());
//  }

  
}
