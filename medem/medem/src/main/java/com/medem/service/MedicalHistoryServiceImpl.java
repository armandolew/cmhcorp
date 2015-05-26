package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.MedicalHistoryDAO;
import com.medem.dto.Assembler;
import com.medem.dto.MedicalHistoryDTO;
import com.medem.model.MedicalHistory;

@Service("medicalHistoryService")
public class MedicalHistoryServiceImpl implements MedicalHistoryService {
	
	@Autowired
	private MedicalHistoryDAO medicalHistoryDAO;

	@Override
	@Transactional
	public void addMedicalHistory(MedicalHistory medicalHistory) throws Exception {
	    try{
		  this.medicalHistoryDAO.addMedicalHistory(medicalHistory);
	    }
	    catch(Exception e){
	        throw new Exception();
	    }
	}

	@Override
	@Transactional
	public List<MedicalHistoryDTO> listMedicalHistories(int employeeId) throws Exception {
		List <MedicalHistoryDTO> listRecords = new ArrayList<MedicalHistoryDTO>();
		
		try{
			for(MedicalHistory mh : medicalHistoryDAO.listMedicalHistories(employeeId)){
				listRecords.add(Assembler.createMedicalHistoryDTO(mh));
			}
		}
		
		catch(Exception e){
		    throw new Exception();
		}
		return listRecords;
	}

	@Override
	@Transactional
	public MedicalHistoryDTO getMedicalHistoryById(int id) throws Exception {
	    try{
		  return Assembler.createMedicalHistoryDTO(this.medicalHistoryDAO.getMedicalHistoryById(id));
	    }
	    catch(Exception e){
	        throw new Exception();
	    }
	}

    @Override
    @Transactional
    public MedicalHistoryDTO getFullMedicalHistoryById(int id) throws Exception {
        try{
            return Assembler.createMedicalHistoryDTO(this.medicalHistoryDAO.getFullMedicalHistoryById(id));
        }
        catch(Exception e){
            throw new Exception();
        }
    }

    @Override
    @Transactional
    public void deleteMedicalHistory(MedicalHistory medicalHistory) throws Exception {
        try{
            this.medicalHistoryDAO.deleteMedicalHistory(medicalHistory);
        }
        catch(Exception e){
            throw new Exception();
        }
        
    }
	
	
}
