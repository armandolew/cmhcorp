package com.medem.dao;

import java.util.List;

import com.medem.model.FamilyDisease;
import com.medem.model.FamilyHistory;

public interface FamilyHistoryDAO {
	
	public void addFamilyHistory(FamilyHistory familyHistory);
	public List<FamilyHistory> listFamilyHistory(int employee_id);
	public FamilyHistory getFamilyHistoryById(int id);
	public List<FamilyDisease> listFamilyDiseases();

}
