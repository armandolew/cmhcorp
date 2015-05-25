package com.medem.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.dao.HibernateDaoSupportWithJdbcTemplateHolder;
import com.medem.dao.TypeBodySystemDAO;
import com.medem.model.TypeBodySystem;

@Repository("typeBodySystem")
public class TypeBodySystemDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements TypeBodySystemDAO {
    
    @Autowired
    public TypeBodySystemDAOImpl(HibernateTemplate hibernateTemplate) {
        super(hibernateTemplate);
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<TypeBodySystem> listTypeBodysystem() {
        return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from TypeBodySystem").list();
    }

    
    
}
