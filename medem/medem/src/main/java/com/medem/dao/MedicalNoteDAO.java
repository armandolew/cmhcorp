package com.medem.dao;

import java.util.List;
import com.medem.model.MedicalNote;

public interface MedicalNoteDAO {
	public void addMedicalNote(MedicalNote medicalNote);
	public List<MedicalNote> listMedicalNotes(int id);
	public MedicalNote getMedicalNoteById(int id);
	
}
