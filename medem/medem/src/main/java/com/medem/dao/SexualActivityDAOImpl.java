package com.medem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.SexualActivity;

@Repository("sexualActivityDAO")
public class SexualActivityDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements SexualActivityDAO {

	@Autowired
	public SexualActivityDAOImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public void addSexualActivity(SexualActivity sexualActivity) {
		// TODO Auto-generated method stub
		getHibernateTemplate().getSessionFactory().getCurrentSession().save(sexualActivity);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<SexualActivity> listSexualActivity() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from SexualActivity").list();
	}

	
	
}
