package com.medem.service;

import java.util.List;

import com.medem.dto.EmployeeDTO;
import com.medem.model.Employee;

public interface EmployeeService {

    public void addEmployee(Employee employee);
	public List<EmployeeDTO> listEmployees(int page, int recordsPerPage, int id_company);
	public EmployeeDTO getEmployeeById(int id);
	public List<EmployeeDTO> searchEmployee(String name);
	public Long countEmployees(int id_company);
	public EmployeeDTO getFullEmployee(int id);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public List<EmployeeDTO> listEmployeesRedux(int id_company);
	
}
