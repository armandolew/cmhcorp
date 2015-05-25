package com.medem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.MedicalNote;

@Repository("medicalNoteDAO")
public class MedicalNoteDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements MedicalNoteDAO {

	@Autowired
	public MedicalNoteDAOImpl(HibernateTemplate hibernateTemplate){
		super(hibernateTemplate);
	}

	@Transactional
	public void addMedicalNote(MedicalNote medicalNote) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().save(medicalNote);
	}

    @SuppressWarnings("unchecked")
    @Transactional
	public List<MedicalNote> listMedicalNotes(int id) {
    	return  getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from MedicalNote medicalNote where medicalNote.employee_id =" + id).list();
	}

    @Transactional
	public MedicalNote getMedicalNoteById(int id) {
		// TODO Auto-generated method stub
		return (MedicalNote) getHibernateTemplate().getSessionFactory().getCurrentSession().load(MedicalNote.class, new Integer(id));
	}
	
	
}
