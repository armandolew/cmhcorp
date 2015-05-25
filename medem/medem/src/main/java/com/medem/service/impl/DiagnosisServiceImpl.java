package com.medem.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.DiagnosisDAO;
import com.medem.dto.Assembler;
import com.medem.dto.DiagnosisDTO;
import com.medem.model.Diagnosis;
import com.medem.service.DiagnosisService;

@Service("diagnosisService")
public class DiagnosisServiceImpl implements DiagnosisService {

    @Autowired
    private DiagnosisDAO diagnosisDAO;
    
    @Override
    @Transactional
    public List<DiagnosisDTO> listDiagnosis() throws Exception {
        List<DiagnosisDTO> listDiagnosis = new ArrayList<DiagnosisDTO>();
        
        try{
            for(Diagnosis diagnosis : this.diagnosisDAO.listDiagnosis()){
                listDiagnosis.add(Assembler.createDiagnosisDTO(diagnosis));
            }
            
        }
        catch(DataAccessException dae){
            throw new Exception();
        }
        
        return listDiagnosis;
    }
    

}
