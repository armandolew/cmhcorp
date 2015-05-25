package com.medem.dao;

import java.util.List;

import com.medem.model.EmployeeRisk;

public interface EmployeeRiskDAO {
	public void addEmployeeRisk(EmployeeRisk employeeRisk);
	public List<EmployeeRisk> listEmployeeRisk(int employeeId);
}
