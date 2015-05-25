package com.medem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.FamilyDisease;
import com.medem.model.FamilyHistory;

@Repository("familyHistoryDAO")
public class FamilyHistoryDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements FamilyHistoryDAO {
	
	@Autowired
	public FamilyHistoryDAOImpl(HibernateTemplate hibernateTemplate){
		super(hibernateTemplate);
	}
	
	@Transactional
	public void addFamilyHistory(FamilyHistory familyHistory){
        getHibernateTemplate().getSessionFactory().getCurrentSession().save(familyHistory);	
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<FamilyHistory> listFamilyHistory(int employee_id){
        return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from FamilyHistory familyHistory order by familyHistory.id DESC").list();
	}

	
	@Transactional
	public FamilyHistory getFamilyHistoryById(int id){
        return (FamilyHistory) getHibernateTemplate().getSessionFactory().getCurrentSession().load(FamilyHistory.class, new Integer(id));		
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<FamilyDisease> listFamilyDiseases(){
		return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from FamilyDisease").list();
	}


}
