package com.medem.dao.test;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.medem.dao.MedicalNoteDAO;
import com.medem.model.MedicalNote;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/mvc-dispatcher-servlet.xml", "classpath:/spring-database.xml"})
public class MedicalNoteDAOTest {

	  @Autowired
	  private MedicalNoteDAO medicalNoteDAO;
	
	  @Test
	  public void testAppCtx(){
		  Assert.assertNotNull(medicalNoteDAO);
	  }
	  
	  @Test
	  public void testlistMedicalNotes(){
		  List<MedicalNote> lmn = medicalNoteDAO.listMedicalNotes(2);
		  Assert.assertNotNull(lmn);
		  Assert.assertTrue(!lmn.isEmpty());		  
		  
	  }
	  
	  @Test
	  public void testaddMedicalNote(){
		  MedicalNote medicalNote = new MedicalNote();
		  medicalNote.setAnalisis("Analisis de prueba");
		  medicalNote.setBloodPressure(180);
		  medicalNote.setEmployee_id(2);
		  medicalNote.setFindings("Hallazgos de prueba");
		  medicalNote.setHeartRate(100);
		  medicalNote.setHips((float) 1.00);
		  medicalNote.setRespiratoryRate(90);
		  medicalNote.setSize((float) 1.00);
		  medicalNote.setTemperature((float) 36.5);
		  medicalNote.setTreatment("Tratamiento de prueba");
		  medicalNote.setType(2);
		  medicalNote.setWaist((float) 1.00);
		  medicalNote.setWeight((float) 1.00);
		  medicalNote.setWeightIndex(4);
		  
		  medicalNoteDAO.addMedicalNote(medicalNote);
		  Assert.assertNotNull(medicalNoteDAO);
	  }
}
