package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.EmployeeRiskDAO;
import com.medem.dto.Assembler;
import com.medem.dto.EmployeeRiskDTO;
import com.medem.model.EmployeeRisk;

@Service("employeeRiskService")
public class EmployeeRiskServiceImpl implements EmployeeRiskService {

	@Autowired
	private EmployeeRiskDAO employeeRiskDAO;
	
	@Override
	@Transactional
	public void addEmployeeRisk(EmployeeRisk employeeRisk) {
		this.employeeRiskDAO.addEmployeeRisk(employeeRisk);
		
	}

	@Override
	@Transactional
	public List<EmployeeRiskDTO> listEmployeeRisk(int employeeId) {
		List <EmployeeRiskDTO> listEmployeeRiskDTO = new ArrayList <EmployeeRiskDTO>();
		
		try{
			for(EmployeeRisk employeeRisk : employeeRiskDAO.listEmployeeRisk(employeeId)){
				listEmployeeRiskDTO.add(Assembler.createEmployeeRiskDTO(employeeRisk));
			}
		}
		
		catch (Exception e){
			
		}
		return listEmployeeRiskDTO;
	}

}
