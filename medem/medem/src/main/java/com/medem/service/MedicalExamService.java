package com.medem.service;

import java.util.List;

import com.medem.dto.MedicalExamDTO;
import com.medem.model.MedicalExam;

public interface MedicalExamService {

	public void addMedicalExam(MedicalExam medicalExam);
	public List<MedicalExamDTO> listMedicalExam(int employeeId);
	public MedicalExamDTO getMedicalExamById(int id);
}
