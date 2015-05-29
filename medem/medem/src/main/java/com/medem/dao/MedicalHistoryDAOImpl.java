package com.medem.dao;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.MedicalHistory;

@Repository("medicalHistoryDAO")
public class MedicalHistoryDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements MedicalHistoryDAO {

    @Autowired
    private EmployeeDAO employeeDAO;
    
    @Autowired
    private RiskDAO riskDAO;
    
	@Autowired
	public MedicalHistoryDAOImpl(HibernateTemplate hibernateTemplate){
		super(hibernateTemplate);
	}

	
	@Transactional
	public void addMedicalHistory(MedicalHistory medicalHistory) throws Exception {
		
		try{
		   getHibernateTemplate().getSessionFactory().getCurrentSession().save(medicalHistory);

		}
		catch(DataAccessException dae){
		    throw new Exception();
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<MedicalHistory> listMedicalHistories(int employeeId) throws Exception {
	    try{
		  return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from MedicalHistory medicalHistory where medicalHistory.employeeId=:employeeId").list();
	    }
	    catch(DataAccessException dae){
	        throw new Exception();
	    }
	}

	@Transactional
	public MedicalHistory getMedicalHistoryById(int id) throws Exception {
	    try{
		  return (MedicalHistory) getHibernateTemplate().getSessionFactory().getCurrentSession().load(MedicalHistory.class,  new Integer(id));
	    }
	    catch(DataAccessException dae){
	        throw new Exception();
	    }
	}
	
	@Transactional
	public MedicalHistory getFullMedicalHistoryById(int id) throws Exception{
	    try{
	        Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(MedicalHistory.class);
            criteria.add(Restrictions.idEq(id));
            criteria.setFetchMode("employee", FetchMode.JOIN);
            criteria.setFetchMode("physicalExploration", FetchMode.JOIN);
            criteria.setFetchMode("sexualActivity", FetchMode.JOIN);
            criteria.setFetchMode("risk", FetchMode.JOIN);
            criteria.setFetchMode("personalNonpathological", FetchMode.JOIN);
            criteria.setFetchMode("personalPathological", FetchMode.JOIN);
            criteria.setFetchMode("diagnostics", FetchMode.JOIN);
            
            MedicalHistory medicalHistory = (MedicalHistory) criteria.list().get(0);
            return medicalHistory;
	    }
	    catch(DataAccessException dae){
	        throw new Exception();
	    }
	}
	
	@Transactional
	public void deleteMedicalHistory(MedicalHistory medicalHistory) throws Exception{
	    try{
	        getHibernateTemplate().getSessionFactory().getCurrentSession().delete(medicalHistory);
	    }
	    catch(DataAccessException dae){
	        throw new Exception();
	    }
	}


    @Transactional
    public MedicalHistory getMedicalHistoryByEmployee(int id_employee) throws Exception {
        MedicalHistory medicalHistory = null;
        try{
            Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(MedicalHistory.class);
            criteria.add(Restrictions.eq("employee.id", id_employee));
            criteria.setFetchMode("employee", FetchMode.JOIN);
            criteria.setFetchMode("physicalExploration", FetchMode.JOIN);
            criteria.setFetchMode("sexualActivity", FetchMode.JOIN);
            criteria.setFetchMode("risk", FetchMode.JOIN);
            criteria.setFetchMode("personalNonpathological", FetchMode.JOIN);
            criteria.setFetchMode("personalPathological", FetchMode.JOIN);
            criteria.setFetchMode("diagnostics", FetchMode.JOIN);
            
            medicalHistory = (MedicalHistory) criteria.list().get(0);
            
            System.out.println(ReflectionToStringBuilder.toString(medicalHistory));
        }
        catch(DataAccessException dae){
            throw new Exception();
        }
        
        return medicalHistory;
    }
	
	
	
}
