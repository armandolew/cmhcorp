package com.medem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.WorkBackground;

@Repository("workBackgroundDAO")
public class WorkBackgroundDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements WorkBackgroundDAO {
	
	@Autowired
	public WorkBackgroundDAOImpl(HibernateTemplate hibernateTemplate){
		super(hibernateTemplate);
	}
	
	@Transactional
	public void addWorkBackground(WorkBackground workBackground){
        getHibernateTemplate().getSessionFactory().getCurrentSession().save(workBackground);		
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<WorkBackground> listWorkBackgrounds(int employeeId){
        return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from WorkBackground workBackground WHERE workBackground.employeeId = " + employeeId).list();		
	}
	
	@Transactional
	public WorkBackground getWorkBackgroundById(int id){
        return (WorkBackground) getHibernateTemplate().getSessionFactory().getCurrentSession().load(WorkBackground.class, new Integer(id));		
	}

}
