package com.medem.dao;

import java.util.List;
import com.medem.model.Employee;

public interface EmployeeDAO {

	public void addEmployee(Employee employee);
	public List<Employee> listEmployees(int page, int recordsPerPage, int id_company);
	public Employee getEmployeeById(int id);
    public List<Employee> searchEmployee(String name);
	public Long countEmployees(int id_company);
	public Employee getFullEmployee(int id);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public List<Employee> listEmployeesRedux(int id_company);
}
