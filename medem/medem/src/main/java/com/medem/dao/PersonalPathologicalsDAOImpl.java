package com.medem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.PersonalPathologicals;

@Repository("personalPathologicalsDAO")
public class PersonalPathologicalsDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements PersonalPathologicalsDAO {

	@Autowired
	public PersonalPathologicalsDAOImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public void addPersonalPathologicals(
			PersonalPathologicals personalPathologicals) {
		// TODO Auto-generated method stub
		getHibernateTemplate().getSessionFactory().getCurrentSession().save(personalPathologicals);
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<PersonalPathologicals> listPersonalPathologicals(
			int medicalRecordId) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from PersonalPathologicals personalPathologicals where personalPathologicals.medicalRecordId=:medicalRecordId").list();
	}

	@Override
	public PersonalPathologicals getPersonalPathologicalsById(int id) {
		// TODO Auto-generated method stub
		return (PersonalPathologicals) getHibernateTemplate().getSessionFactory().getCurrentSession().load(PersonalPathologicals.class, new Integer(id));
	}

}
