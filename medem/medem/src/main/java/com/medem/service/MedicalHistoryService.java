package com.medem.service;

import java.util.List;

import com.medem.dto.MedicalHistoryDTO;
import com.medem.model.MedicalHistory;

public interface MedicalHistoryService {

    public void addMedicalHistory(MedicalHistory medicalHistory) throws Exception;
    public List<MedicalHistoryDTO> listMedicalHistories(int employeeId) throws Exception;
    public MedicalHistoryDTO getMedicalHistoryById(int id) throws Exception;
    public MedicalHistoryDTO getFullMedicalHistoryById(int id) throws Exception;
    public void deleteMedicalHistory(MedicalHistory medicalHistory) throws Exception;
	
}
