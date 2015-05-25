package com.medem.dao;

import java.util.List;

import com.medem.model.MedicalExam;

public interface MedicalExamDAO {

	public void addMedicalExam(MedicalExam medicalExam);
	public List<MedicalExam> listMedicalExams(int employeeId);
	public MedicalExam getMedicalExamById(int id);
}
