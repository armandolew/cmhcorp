package com.medem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.MedicalExam;

@Repository("medicalExamDAO")
public class MedicalExamDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements MedicalExamDAO  {

	@Autowired
	public MedicalExamDAOImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

	@Transactional
	public void addMedicalExam(MedicalExam medicalExam) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().save(medicalExam);
		
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<MedicalExam> listMedicalExams(int employeeId) {
		return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from MedicalExam medicalExam where medicalExam.employeeId =" + employeeId).list();
	}

	@Transactional
	public MedicalExam getMedicalExamById(int id) {
		return (MedicalExam) getHibernateTemplate().getSessionFactory().getCurrentSession().load(MedicalExam.class, new Integer(id));
	}

}
