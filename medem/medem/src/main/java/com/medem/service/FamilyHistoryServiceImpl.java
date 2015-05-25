package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.FamilyHistoryDAO;
import com.medem.dto.Assembler;
import com.medem.dto.FamilyHistoryDTO;
import com.medem.model.FamilyHistory;
import com.medem.dto.FamilyDiseaseDTO;
import com.medem.model.FamilyDisease;

@Service("familyHistory")
public class FamilyHistoryServiceImpl implements FamilyHistoryService {

	@Autowired
	private FamilyHistoryDAO familyHistoryDAO;
	
	@Override
	@Transactional
	public void addFamilyHistory(FamilyHistory familyHistory){
		this.familyHistoryDAO.addFamilyHistory(familyHistory);
	}
	
	@Override
	@Transactional
	public List<FamilyHistoryDTO> listFamilyHistory(int employee_id){
		List <FamilyHistoryDTO> familyHistory = new ArrayList<FamilyHistoryDTO>();
		
		try{
			for (FamilyHistory item : familyHistoryDAO.listFamilyHistory(employee_id)){
				familyHistory.add(Assembler.createFamilyHistoryDTO(item));
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
		
		return familyHistory;
	}
	
	@Override
	@Transactional
	public FamilyHistoryDTO getFamilyHistoryById(int id){
		return Assembler.createFamilyHistoryDTO(familyHistoryDAO.getFamilyHistoryById(id));
	}
	
	@Override
	@Transactional
	public List<FamilyDiseaseDTO> listFamilyDiseases(){
		//return this.familyHistoryDAO.listFamilyDiseases();
		List <FamilyDiseaseDTO> listDiseasesDTO = new ArrayList<FamilyDiseaseDTO>();
		
		try{
			for (FamilyDisease familyDisease : familyHistoryDAO.listFamilyDiseases()){
				listDiseasesDTO.add(Assembler.createFamilyDiseaseDTO(familyDisease));
			}
		}
		catch (Exception e){
			
		}
		
		return listDiseasesDTO;
	}
	
}
