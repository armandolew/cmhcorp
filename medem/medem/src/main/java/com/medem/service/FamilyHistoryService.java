package com.medem.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.medem.dto.FamilyDiseaseDTO;
import com.medem.dto.FamilyHistoryDTO;
import com.medem.model.FamilyHistory;

public interface FamilyHistoryService {
	
	@Transactional
	public void addFamilyHistory(FamilyHistory familyHistory);
	
	@Transactional
	public List<FamilyHistoryDTO> listFamilyHistory(int employee_id);
	
	@Transactional
	public FamilyHistoryDTO getFamilyHistoryById(int id);	
	
	@Transactional
	public List<FamilyDiseaseDTO> listFamilyDiseases();

}
