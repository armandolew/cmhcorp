package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.MedicalRecordDAO;
import com.medem.dto.Assembler;
import com.medem.dto.MedicalRecordDTO;
import com.medem.model.MedicalRecord;

@Service("medicalRecordService")
public class MedicalRecordServiceImpl implements MedicalRecordService {
	
	@Autowired
	private MedicalRecordDAO medicalRecordDAO;

	@Override
	@Transactional
	public void addMedicalRecord(MedicalRecord medicalRecord) {
		// TODO Auto-generated method stub
		this.medicalRecordDAO.addMedicalRecord(medicalRecord);
	}

	@Override
	@Transactional
	public List<MedicalRecordDTO> listMedicalRecords(int employeeId) {
		// TODO Auto-generated method stub
		List <MedicalRecordDTO> listRecords = new ArrayList<MedicalRecordDTO>();
		
		try{
			for(MedicalRecord mr : medicalRecordDAO.listMedicalRecords(employeeId)){
				listRecords.add(Assembler.createMedicalRecordDTO(mr));
			}
		}
		
		catch(Exception e){
			
		}
		return listRecords;
	}

	@Override
	@Transactional
	public MedicalRecordDTO getMedicalRecordById(int id) {
		// TODO Auto-generated method stub
		return Assembler.createMedicalRecordDTO(medicalRecordDAO.getMedicalRecordById(id));
	}
	
	
}
