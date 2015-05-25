package com.medem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.BloodGroup;

@Repository("bloodGroupDAO")
public class BloodGroupDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements BloodGroupDAO {

    @Autowired
    public BloodGroupDAOImpl(HibernateTemplate hibernateTemplate) {
        super(hibernateTemplate);
    }

    @Transactional
    public BloodGroup getBloodGroupById(int id) {
        return (BloodGroup) getHibernateTemplate().getSessionFactory().getCurrentSession().load(BloodGroup.class, new Integer(id));
    }

}
