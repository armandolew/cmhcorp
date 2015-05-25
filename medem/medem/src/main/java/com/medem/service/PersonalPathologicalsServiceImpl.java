package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.PersonalPathologicalsDAO;
import com.medem.dto.Assembler;
import com.medem.dto.PersonalPathologicalsDTO;
import com.medem.model.PersonalPathologicals;

@Service("personalPathologicalsService")
public class PersonalPathologicalsServiceImpl implements PersonalPathologicalsService {

	@Autowired
	private PersonalPathologicalsDAO personalPathologicalsDAO;
	
	@Override
	@Transactional
	public void addPersonalPathologicals(
			PersonalPathologicals personalPathologicals) {
		this.personalPathologicalsDAO.addPersonalPathologicals(personalPathologicals);
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<PersonalPathologicalsDTO> listPersonalPathologicals(int medicalRecordId){
		// TODO Auto-generated method stub
		List <PersonalPathologicalsDTO> listPersonalPathologicals = new ArrayList<PersonalPathologicalsDTO>();
		
		try{
			for(PersonalPathologicals personalPathologicals : personalPathologicalsDAO.listPersonalPathologicals(medicalRecordId)){
				listPersonalPathologicals.add(Assembler.createPersonalPathologicalsDTO(personalPathologicals));
			}
		}
		
		catch(Exception e){
			
		}
		return listPersonalPathologicals;
	}

	@Override
	@Transactional
	public PersonalPathologicalsDTO getPersonalPathologicalsById(int id) {
		// TODO Auto-generated method stub
		
		return Assembler.createPersonalPathologicalsDTO(personalPathologicalsDAO.getPersonalPathologicalsById(id));
	}

}
