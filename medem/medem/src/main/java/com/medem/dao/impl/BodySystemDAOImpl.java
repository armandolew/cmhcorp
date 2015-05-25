package com.medem.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.BodySystemDAO;
import com.medem.dao.HibernateDaoSupportWithJdbcTemplateHolder;
import com.medem.model.BodySystem;

@Repository("bodySystemDAO")
public class BodySystemDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements BodySystemDAO {

    @Autowired
    public BodySystemDAOImpl(HibernateTemplate hibernateTemplate) {
        super(hibernateTemplate);
    }

    @Transactional
    public BodySystem getBodySystemById(int id) {
        return (BodySystem) getHibernateTemplate().getSessionFactory().getCurrentSession().load(BodySystem.class, new Integer(id));
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<BodySystem> listBodySystems() {
        return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from BodySystem").list();
    }

    
}
