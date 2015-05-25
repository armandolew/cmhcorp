package com.medem.service;

import java.util.List;

import com.medem.model.EmployeeRisk;
import com.medem.dto.EmployeeRiskDTO;;


public interface EmployeeRiskService {

	public void addEmployeeRisk(EmployeeRisk employeeRisk);
	public List<EmployeeRiskDTO> listEmployeeRisk(int employeeId);
}
