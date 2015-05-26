package com.medem.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.HibernateDaoSupportWithJdbcTemplateHolder;
import com.medem.dao.RiskDAO;
import com.medem.model.Risk;

@Repository("riskDAO")
public class RiskDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements RiskDAO {

    @Autowired
    public RiskDAOImpl(HibernateTemplate hibernateTemplate) {
        super(hibernateTemplate);
    }

    @Transactional
    public Risk getRiskById(int id) throws Exception {
        try{
            return (Risk) getHibernateTemplate().getSessionFactory().getCurrentSession().load(Risk.class, new Integer(id));
        }
        catch(DataAccessException dae){
            throw new Exception();
        }
    }

    
}
