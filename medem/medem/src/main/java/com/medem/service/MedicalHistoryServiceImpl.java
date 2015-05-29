package com.medem.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.EmployeeDAO;
import com.medem.dao.MedicalHistoryDAO;
import com.medem.dao.RiskDAO;
import com.medem.dto.Assembler;
import com.medem.dto.EmployeeDTO;
import com.medem.dto.MedicalHistoryDTO;
import com.medem.model.Employee;
import com.medem.model.MedicalHistory;
import com.medem.model.Risk;

@Service("medicalHistoryService")
public class MedicalHistoryServiceImpl implements MedicalHistoryService {
	
	@Autowired
	private MedicalHistoryDAO medicalHistoryDAO;
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Autowired
	private RiskDAO riskDAO;

	Calendar calendar = Calendar.getInstance();
    java.util.Date now = calendar.getTime();
    java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(now.getTime());	
	
	@Override
	@Transactional
	public void addMedicalHistory(MedicalHistoryDTO medicalHistoryDTO) throws Exception {
	    try{

	        Employee employee = this.employeeDAO.getEmployeeById(medicalHistoryDTO.getEmployee().getId());
	        Risk risk = this.riskDAO.getRiskById(medicalHistoryDTO.getRisk().getId());
	        
	        MedicalHistory medicalHistory = (MedicalHistory) Assembler.createMedicalHistory(medicalHistoryDTO);
	        
	        medicalHistory.setEmployee(employee);
	        medicalHistory.setRisk(risk);
	        medicalHistory.setCreatedAt(getCurrentTimestamp());
	        
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
            
            MedicalHistory medicalHistory = this.medicalHistoryDAO.getFullMedicalHistoryById(id);
            Employee employee = this.employeeDAO.getEmployeeById(medicalHistory.getEmployee().getId());
            Risk risk = this.riskDAO.getRiskById(medicalHistory.getRisk().getId());
            
            MedicalHistoryDTO medicalHistoryDTO = Assembler.createMedicalHistoryDTO(medicalHistory);
            
            medicalHistoryDTO.setEmployee(employee);
            medicalHistoryDTO.setRisk(risk);
            medicalHistoryDTO.setCreatedAt(medicalHistory.getCreatedAt());
            
            
            return medicalHistoryDTO;
            
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
    
    @Override
    @Transactional
    public MedicalHistoryDTO getMedicalHistoryByEmployee(int id_employee) throws Exception {
        try{
            return Assembler.createMedicalHistoryDTO(this.medicalHistoryDAO.getMedicalHistoryByEmployee(id_employee));
             
        }
        catch(Exception e){
            throw new Exception();
        }
    }
    
    private static Timestamp getCurrentTimestamp(){
        java.util.Date date= new java.util.Date();
        return new Timestamp(date.getTime());
    }


	
	
}
