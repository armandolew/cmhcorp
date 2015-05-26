package com.medem.dao.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.BeforeClass;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.medem.dao.CompanyDAO;
import com.medem.model.Company;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/mvc-dispatcher-servlet.xml", "classpath:/spring-database.xml"})
public class CompanyDAOTest {

	private static Validator validator;
	
	@Autowired
	private CompanyDAO companyDAO;
	
	@BeforeClass
	public static void setUp(){
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	    validator = factory.getValidator();
	}
	
	@Test
	public void testAppCtx(){
		Assert.assertNotNull(companyDAO);
	}
	
	@Test
	public void listCompanies(){
		List<Company> c = companyDAO.listCompanies();
		Assert.assertNotNull(c);
		Assert.assertTrue(!c.isEmpty());
	}
	
//	@Test
//	public void testaddCompany(){
//		
//	
//		Company company = new Company();
//		company.setActivity(1);
//		company.setBusinessName("soriana");
//		company.setCreatedAt("2015-04-09");
//		company.setEmployeeRegistration(100);
//		company.setName("soriana");
//		company.setUserName("armando");
//		
//		 Set<ConstraintViolation<Company>> constraintViolations =
//			      validator.validate( company );
//
//		 Assert.assertEquals( 0, constraintViolations.size() );
//	     Assert.assertEquals( "may not be null", constraintViolations.iterator().next().getMessage()
//			      );		
//		
//		companyDAO.addCompany(company);
//		Assert.assertNotNull(companyDAO);
//	}
}
