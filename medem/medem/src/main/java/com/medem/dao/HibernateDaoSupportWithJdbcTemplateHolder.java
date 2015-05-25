package com.medem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/** Hereda de HibernateDAOSUpport, permitiendo que se creen objectos DAO sin declararlos como beans **/

public class HibernateDaoSupportWithJdbcTemplateHolder extends HibernateDaoSupport {
	
	@Autowired
	public HibernateDaoSupportWithJdbcTemplateHolder(HibernateTemplate hibernateTemplate){
	  super.setHibernateTemplate(hibernateTemplate);
	}

}



