package com.medem.service.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.medem.dto.MedicalNoteDTO;
import com.medem.service.MedicalNoteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/mvc-dispatcher-servlet.xml", "classpath:/spring-database.xml"})
public class MedicalNoteServiceTest {

	@Autowired
	private MedicalNoteService medicalNoteService;
	
    @Test
    public void testAppCtx(){
	  Assert.assertNotNull(medicalNoteService);
    }
    
    @Test
    public void testfindMedicalNoteById(){
    	MedicalNoteDTO medicalNoteDTO = medicalNoteService.getMedicalNoteById(1);
    	Assert.assertNotNull(medicalNoteDTO);
      	Assert.assertEquals(Double.valueOf(1), Double.valueOf(medicalNoteDTO.getId()));
      	Assert.assertTrue(medicalNoteDTO instanceof MedicalNoteDTO);
      	System.out.println(medicalNoteDTO.toString());
    	
    }
    
    
}
