package com.medem.service;

import java.util.List;

import com.medem.dto.MedicalHistoryDTO;
import com.medem.model.MedicalHistory;

public interface MedicalHistoryService {

    public void addMedicalHistory(MedicalHistoryDTO medicalHistoryDTO) throws Exception;
    public List<MedicalHistoryDTO> listMedicalHistories(int employeeId) throws Exception;
    public MedicalHistoryDTO getMedicalHistoryById(int id) throws Exception;
    public MedicalHistoryDTO getFullMedicalHistoryById(int id) throws Exception;
    public void deleteMedicalHistory(MedicalHistory medicalHistory) throws Exception;
    public MedicalHistoryDTO getMedicalHistoryByEmployee(int id_employee) throws Exception;
	
}
