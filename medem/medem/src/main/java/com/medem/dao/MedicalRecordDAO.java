package com.medem.dao;

import java.util.List;

import com.medem.model.MedicalRecord;

public interface MedicalRecordDAO {

	public void addMedicalRecord(MedicalRecord medicalRecord);
	public List<MedicalRecord> listMedicalRecords(int employeeId);
	public MedicalRecord getMedicalRecordById(int id);
	
}