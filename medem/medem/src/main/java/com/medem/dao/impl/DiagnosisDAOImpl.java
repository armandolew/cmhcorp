package com.medem.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.DiagnosisDAO;
import com.medem.dao.HibernateDaoSupportWithJdbcTemplateHolder;
import com.medem.model.Diagnosis;

@Repository("diagnosisDAO")
public class DiagnosisDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements DiagnosisDAO {

    @Autowired
    public DiagnosisDAOImpl(HibernateTemplate hibernateTemplate) {
        super(hibernateTemplate);
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Diagnosis> listDiagnosis() {
        return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Diagnosis").list();
    }

}
