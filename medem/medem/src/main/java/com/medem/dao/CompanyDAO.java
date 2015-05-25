package com.medem.dao;

import java.util.List;

import com.medem.model.Company;

public interface CompanyDAO {
	public void addCompany(Company company);
	public List<Company> listCompanies();
	public Company getCompanyById(int id);
	public void updateCompany(Company company);
	public void deleteCompany(Company company);
	public Company getFullCompany(int companyId);
	public List<Company> searchCompanyByName(String name);
}
