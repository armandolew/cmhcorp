package com.medem.dao.test;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.medem.dao.EmployeeRiskDAO;
import com.medem.dao.MedicalHistoryDAO;
import com.medem.dao.PhysicalExplorationDAO;
import com.medem.model.MedicalRecord;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/mvc-dispatcher-servlet.xml", "classpath:/spring-database.xml"})
public class MedicalRecordDAOTest {

//	@Autowired
//	private MedicalHistoryDAO medicalRecordDAO;
//	
//	@Autowired
//	private PhysicalExplorationDAO physicalExplorationDAO;
//	
//	@Autowired
//	private EmployeeRiskDAO employeeRiskDAO;
//	
//	@Test
//	public void testAppCtx(){
//	  Assert.assertNotNull(medicalRecordDAO);
//	}
//	
//	@Test
//	public void testaddMedicalRecord(){
//		MedicalRecord medicalRecord = new MedicalRecord();
//		
//		medicalRecord.setEmployeeId(1);
//		medicalRecord.setCreatedAt("2015-04-16");
//		medicalRecord.setAnalisis("testing analisis");
//		medicalRecord.setTreatment("testing treatment");
//		medicalRecord.setCurrentAilment("testing ailment");
//		medicalRecord.setUserName("armando");
//
////		medicalRecord.getPhysicalExploration().setExamType(1);
////		medicalRecord.getPhysicalExploration().setHeartRate(100);
////		medicalRecord.getPhysicalExploration().setBloodPressure(100);
////		medicalRecord.getPhysicalExploration().setRespiratoryRate(100);
////		medicalRecord.getPhysicalExploration().setTemperature((float)36.5);
////		medicalRecord.getPhysicalExploration().setWeight((float)150);
////		medicalRecord.getPhysicalExploration().setSize((float) 1.40);
////		medicalRecord.getPhysicalExploration().setWaist((float) 100);
////		medicalRecord.getPhysicalExploration().setHips((float) 100);
////		medicalRecord.getPhysicalExploration().setWeightIndex(1);
////		medicalRecord.getPhysicalExploration().setImc((float) 1.5);
////		medicalRecord.getPhysicalExploration().setGeneral("normal");
////		medicalRecord.getPhysicalExploration().setHead("normal");
////		medicalRecord.getPhysicalExploration().setTorax("normal");
////		medicalRecord.getPhysicalExploration().setAbdomen("normal");
////		medicalRecord.getPhysicalExploration().setLimbs("normal");
////		medicalRecord.getPhysicalExploration().setGenitals("normal");
////		medicalRecord.getPhysicalExploration().setNervousSystem("normal");
////		medicalRecord.getPhysicalExploration().setCreatedAt(medicalRecord.getCreatedAt());
////		
//		medicalRecord.getEmployeeRisk().setExamId(2);
//		medicalRecord.getEmployeeRisk().setEmployeeId(medicalRecord.getEmployeeId());
//		medicalRecord.getEmployeeRisk().setValue(1);
//		medicalRecord.getEmployeeRisk().setCreatedAt(medicalRecord.getCreatedAt());
//		
//		medicalRecordDAO.addMedicalRecord(medicalRecord);
////		physicalExplorationDAO.addPhysicalExploration(medicalRecord.getPhysicalExploration());
//		employeeRiskDAO.addEmployeeRisk(medicalRecord.getEmployeeRisk());
//		
//		Assert.assertNotNull(medicalRecordDAO);
////		Assert.assertNotNull(physicalExplorationDAO);
//		Assert.assertNotNull(employeeRiskDAO);
//		
//	}
//    
//    
	
}
