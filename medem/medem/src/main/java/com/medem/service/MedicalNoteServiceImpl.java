package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.MedicalNoteDAO;
import com.medem.dto.Assembler;
import com.medem.dto.MedicalNoteDTO;
import com.medem.model.MedicalNote;

@Service("medicalNoteService")
public class MedicalNoteServiceImpl implements MedicalNoteService {
	
	@Autowired
	private MedicalNoteDAO medicalNoteDAO;
	
	@Override
	@Transactional
	public void addMedicalNote(MedicalNote medicalNote){
        this.medicalNoteDAO.addMedicalNote(medicalNote);
	}
	
	@Override
	@Transactional
	public List<MedicalNoteDTO> listMedicalNotes(int id){
		List<MedicalNoteDTO> medicalNotes = new ArrayList<MedicalNoteDTO>();
		try{
			for(MedicalNote mn : medicalNoteDAO.listMedicalNotes(id)){
				medicalNotes.add(Assembler.createMedicalNoteDTO(mn));
			}
		}
		catch (Exception e){
			
		}
        return medicalNotes;	
	}
    
	@Override
	@Transactional
	public MedicalNoteDTO getMedicalNoteById(int id){
		return Assembler.createMedicalNoteDTO(medicalNoteDAO.getMedicalNoteById(id));
	}

}
