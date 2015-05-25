package com.medem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.CompanyDAO;
import com.medem.dto.Assembler;
import com.medem.dto.CompanyDTO;
import com.medem.model.Company;


@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private CompanyDAO companyDAO;

	@Override
	@Transactional
	public void addCompany(Company company) {
		// TODO Auto-generated method stub
		this.companyDAO.addCompany(company);
		
	}

	@Override
	@Transactional
	public List<CompanyDTO> listCompanies() {
		// TODO Auto-generated method stub
		List <CompanyDTO> listCompany = new ArrayList<CompanyDTO>();
		
	    try{
	    	for (Company company : companyDAO.listCompanies()){
	    		listCompany.add(Assembler.createCompanyDTO(company));
	    	}
	    }
	    catch (Exception e){
	    	
	    }
		
		return listCompany; 
	}

	@Override
	@Transactional
	public CompanyDTO getCompanyById(int id) {
		return Assembler.createCompanyDTO(companyDAO.getCompanyById(id));
	}
	
	@Override
	@Transactional
	public void updateCompany(Company company){
	    try{
	      this.companyDAO.updateCompany(company);
	    }
	    catch(Exception e){
	        System.out.println("UpdateCompanyException: " + e);
	    }
	}
	
	@Override
	@Transactional
	public void deleteCompany(Company company){
	    try{
	        this.companyDAO.deleteCompany(company);
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	}
	
	@Override
	@Transactional
	public CompanyDTO getFullCompany(int companyId){
	    CompanyDTO companyDTO = null;
	    try{
	        companyDTO = Assembler.createCompanyDTO(this.companyDAO.getFullCompany(companyId));
	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	    
	    return companyDTO;
	}
	
	@Override
	@Transactional
	public List<CompanyDTO> searchCompanyByName(String name){
	    List<CompanyDTO> searchCompany = new ArrayList<CompanyDTO>();
	    
	    try{
	        for( Company company : this.companyDAO.searchCompanyByName(name) ){
	            searchCompany.add(Assembler.createCompanyDTO(company));
	        }
	    }
	    catch(DataAccessException dae){
	        System.out.println(dae);
	    }
	    
	    return searchCompany;
	}

}
