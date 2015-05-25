package com.medem.service;

import java.util.List;

import com.medem.dto.PersonalPathologicalsDTO;
import com.medem.model.PersonalPathologicals;

public interface PersonalPathologicalsService {
	
	public void addPersonalPathologicals(PersonalPathologicals personalPathologicals);
	public List<PersonalPathologicalsDTO> listPersonalPathologicals(int medicalRecordId);
	public PersonalPathologicalsDTO getPersonalPathologicalsById(int id);
}
