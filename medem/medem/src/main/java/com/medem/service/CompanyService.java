package com.medem.service;

import java.util.List;

import com.medem.dto.CompanyDTO;
import com.medem.model.Company;

public interface CompanyService {

	public void addCompany(Company company);
	public List<CompanyDTO> listCompanies();
	public CompanyDTO getCompanyById(int id);
	public void updateCompany(Company company);
	public void deleteCompany(Company company);
	public CompanyDTO getFullCompany(int companyId);
	public List<CompanyDTO> searchCompanyByName(String name); 
}
