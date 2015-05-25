package com.medem.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.ActivityCompanyDAO;
import com.medem.dao.HibernateDaoSupportWithJdbcTemplateHolder;
import com.medem.model.ActivityCompany;

@Repository("activityCompany")
public class ActivityCompanyDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements ActivityCompanyDAO {

    @Autowired
    public ActivityCompanyDAOImpl(HibernateTemplate hibernateTemplate) {
      super(hibernateTemplate);
    }
    
    @Transactional
    public ActivityCompany getActivityCompanyById(int id){
        return (ActivityCompany) getHibernateTemplate().getSessionFactory().getCurrentSession().load(ActivityCompany.class, new Integer(id));
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public List<ActivityCompany> listActivities(String tag){
        return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from ActivityCompany activityCompany where activityCompany.activity like '%" + tag + "%'").list();
    }

}
