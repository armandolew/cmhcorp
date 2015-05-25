package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.MedicalExamDAO;
import com.medem.dto.Assembler;
import com.medem.dto.MedicalExamDTO;
import com.medem.model.MedicalExam;

@Service("medicalExamService")
public class MedicalExamServiceImpl implements MedicalExamService {

	@Autowired
	private MedicalExamDAO medicalExamDAO;
	
	@Override
	@Transactional
	public void addMedicalExam(MedicalExam medicalExam) {
		this.medicalExamDAO.addMedicalExam(medicalExam);
	}

	@Override
	@Transactional
	public List<MedicalExamDTO> listMedicalExam(int employeeId) {
		List<MedicalExamDTO> listMedicalExam = new ArrayList<MedicalExamDTO>();
		
		try{
			for (MedicalExam medicalExam : medicalExamDAO.listMedicalExams(employeeId)){
				listMedicalExam.add(Assembler.createMedicalExamDTO(medicalExam));
			}
		}
		catch (Exception e){
			
		}
		
		return listMedicalExam;
	}

	@Override
	@Transactional
	public MedicalExamDTO getMedicalExamById(int id) {
		return Assembler.createMedicalExamDTO(medicalExamDAO.getMedicalExamById(id));
	}

}
