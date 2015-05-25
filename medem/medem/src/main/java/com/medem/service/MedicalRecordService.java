package com.medem.service;

import java.util.List;

import com.medem.dto.MedicalRecordDTO;
import com.medem.model.MedicalRecord;

public interface MedicalRecordService {

	public void addMedicalRecord(MedicalRecord medicalRecord);
	public List<MedicalRecordDTO> listMedicalRecords(int employeeId);
	public MedicalRecordDTO getMedicalRecordById(int id);
	
}
