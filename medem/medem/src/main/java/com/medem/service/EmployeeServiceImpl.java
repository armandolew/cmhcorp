package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.EmployeeDAO;
import com.medem.dto.Assembler;
import com.medem.dto.EmployeeDTO;
import com.medem.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	

	@Override
	@Transactional
	public void addEmployee(Employee employee){
		this.employeeDAO.addEmployee(employee);
	}
	
	@Override
	@Transactional
	public List<EmployeeDTO> listEmployees(int page, int recordsPerPage, int id_company){
		List<EmployeeDTO> employees = new ArrayList<EmployeeDTO>();
		
		try {
			for (Employee item : employeeDAO.listEmployees(page, recordsPerPage, id_company)) {
				employees.add(Assembler.createEmployeeDTO(item));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}		
		return  employees;
	}
	
	@Override
	@Transactional
	public EmployeeDTO getEmployeeById(int id){		
		return Assembler.createEmployeeDTO(employeeDAO.getEmployeeById(id));
	}

	@Override
	@Transactional
	public List<EmployeeDTO> searchEmployee(String name) {
		List<EmployeeDTO> searchEmployee = new ArrayList<EmployeeDTO>();
		try{
			for (Employee employee : employeeDAO.searchEmployee(name)){
				searchEmployee.add(Assembler.createEmployeeDTO(employee));
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return searchEmployee;
	}

	@Override
	@Transactional
	public Long countEmployees(int id_company) {
		return this.employeeDAO.countEmployees(id_company);
	}

    @Override
    @Transactional
    public EmployeeDTO getFullEmployee(int id) {
        return Assembler.createEmployeeDTO(this.employeeDAO.getFullEmployee(id));
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        this.employeeDAO.updateEmployee(employee);
        
    }

    @Override
    @Transactional
    public void deleteEmployee(Employee employee) {
        this.employeeDAO.deleteEmployee(employee);
        
    }

    @Override
    @Transactional
    public List<EmployeeDTO> listEmployeesRedux(int id_company) {
        List<EmployeeDTO> listEmployees = new ArrayList<EmployeeDTO>();
        
        try{
            for( Employee employee : this.employeeDAO.listEmployeesRedux(id_company) ){
                listEmployees.add(Assembler.createEmployeeDTO(employee));
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return listEmployees;
    }
	
}
