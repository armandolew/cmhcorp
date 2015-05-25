package com.medem.service;

import java.util.List;

import com.medem.dto.MedicalNoteDTO;
import com.medem.model.MedicalNote;

public interface MedicalNoteService {
	public void addMedicalNote(MedicalNote medicalNote);
	public List<MedicalNoteDTO> listMedicalNotes(int id);
	public MedicalNoteDTO getMedicalNoteById(int id);
}
