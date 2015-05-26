package com.medem.dao;

import java.util.List;

import com.medem.model.MedicalHistory;

public interface MedicalHistoryDAO {

	public void addMedicalHistory(MedicalHistory medicalHistory) throws Exception;
	public List<MedicalHistory> listMedicalHistories(int employeeId) throws Exception;
	public MedicalHistory getMedicalHistoryById(int id) throws Exception;
	public MedicalHistory getFullMedicalHistoryById(int id) throws Exception;
	public void deleteMedicalHistory(MedicalHistory medicalHistory) throws Exception;
	
}