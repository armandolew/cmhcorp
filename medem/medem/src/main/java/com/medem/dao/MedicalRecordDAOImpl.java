package com.medem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.MedicalRecord;

@Repository("medicalRecordDAO")
public class MedicalRecordDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements MedicalRecordDAO {

	@Autowired
	public MedicalRecordDAOImpl(HibernateTemplate hibernateTemplate){
		super(hibernateTemplate);
	}

	
	@Transactional
	public void addMedicalRecord(MedicalRecord medicalRecord) {
		
		try{

			medicalRecord.getPhysicalExploration().setExamType(MedicalRecord.EXAM_TYPE_ENTRY);
			medicalRecord.getPhysicalExploration().setCreatedAt(medicalRecord.getCreatedAt());
			medicalRecord.getEmployeeRisk().setEmployeeId(medicalRecord.getEmployeeId());
			medicalRecord.getEmployeeRisk().setCreatedAt(medicalRecord.getCreatedAt());	
			medicalRecord.getSexualActivity().setExamType(MedicalRecord.EXAM_TYPE_ENTRY);
			medicalRecord.getSexualActivity().setCreatedAt(medicalRecord.getCreatedAt());			
			getHibernateTemplate().getSessionFactory().getCurrentSession().save(medicalRecord);

		}
		catch(NullPointerException npe){
			System.out.println(npe);
		}
		catch(Exception e){
			System.out.println(e);
		}
	
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<MedicalRecord> listMedicalRecords(int employeeId) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from MedicalRecord medicalRecord where medicalRecord.employeeId=:employeeId").list();
	}

	@Transactional
	public MedicalRecord getMedicalRecordById(int id) {
		// TODO Auto-generated method stub
		return (MedicalRecord) getHibernateTemplate().getSessionFactory().getCurrentSession().load(MedicalRecord.class,  new Integer(id));
	}
	
	
	
}
