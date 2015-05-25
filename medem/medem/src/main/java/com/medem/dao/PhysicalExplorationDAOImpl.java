package com.medem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.PhysicalExploration;

@Repository("physicalExplorationDAO")
public class PhysicalExplorationDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements PhysicalExplorationDAO {

	@Autowired
	public PhysicalExplorationDAOImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Transactional
	public void addPhysicalExploration(PhysicalExploration physicalExploration) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().save(physicalExploration);
		
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<PhysicalExploration> listPhysicalExploration(int employeeId) {
		return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from PhysicalExploration physicalExploration where physicalExploration.employeeId := employeeId").list();
	}

	@Transactional
	public PhysicalExploration getPhysicalExplorationById(int id) {
		return (PhysicalExploration) getHibernateTemplate().getSessionFactory().getCurrentSession().load(PhysicalExploration.class, new Integer(id));
	}

}
