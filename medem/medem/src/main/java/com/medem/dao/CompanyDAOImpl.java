package com.medem.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.Company;

@Repository("companyDAO")
public class CompanyDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements CompanyDAO {

    private static final Logger logger = Logger.getLogger(CompanyDAOImpl.class);
    
	@Autowired
	public CompanyDAOImpl(HibernateTemplate hibernateTemplate){
		super(hibernateTemplate);
	}
	
	@Transactional
	public void addCompany(Company company) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().save(company);
		
	}
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Company> listCompanies() {
		return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Company company where company.enabled = 1").list();
	}

	@Transactional
	public Company getCompanyById(int id) {
		return (Company) getHibernateTemplate().getSessionFactory().getCurrentSession().load(Company.class, new Integer(id));
	}

	
	@Transactional
	public void updateCompany(Company company){
	    getHibernateTemplate().getSessionFactory().getCurrentSession().saveOrUpdate(company);
	}
	
	@Transactional
	public void deleteCompany(Company company){
	    Company companyToDelete = (Company) getHibernateTemplate().getSessionFactory().getCurrentSession().load(Company.class, new Integer(company.getId()));
	    companyToDelete.setEnabled(false);
	    getHibernateTemplate().getSessionFactory().getCurrentSession().save(companyToDelete);
	}
	
	@Transactional
	public Company getFullCompany(int companyId){
	    Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(Company.class,"company");
	    criteria.setFetchMode("activity", FetchMode.JOIN);
	    criteria.add(Restrictions.idEq(companyId)).uniqueResult();
	    Company company = (Company) criteria.list().get(0);
	    logger.debug("COMPANY FULL: " + company.toString());
	    
	    return company;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Company> searchCompanyByName(String name){
	    return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Company company where company.name like '%"+ name +"%' and company.enabled=1").list();
	}
	
}
