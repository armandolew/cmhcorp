package com.medem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.EmployeeRisk;

@Repository("employeeRiskDAO")
public class EmployeeRiskDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements EmployeeRiskDAO {

	@Autowired
	public EmployeeRiskDAOImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public void addEmployeeRisk(EmployeeRisk employeeRisk) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().save(employeeRisk);
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<EmployeeRisk> listEmployeeRisk(int employeeId) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from EmployeeRisk employeeRisk where employeeRisk.employeeId=:employeeId").list();
	}

}
