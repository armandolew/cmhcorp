package com.medem.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.Area;
import com.medem.service.AreaServiceImpl;

@Repository("areaDAO")
public class AreaDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements AreaDAO {

	@Autowired
	public AreaDAOImpl(HibernateTemplate hibernateTemplate){
		super(hibernateTemplate);
	}
	
	private static final Logger logger = Logger.getLogger(AreaServiceImpl.class);
	
	@Autowired
	private CompanyDAO companyDAO;
	
	@Transactional
	public void addArea(Area area){
		getHibernateTemplate().getSessionFactory().getCurrentSession().save(area);
		logger.debug(area.toString());
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Area> listAreas(int id_company){
		Query listQuery = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Area area where area.company.id ='" + id_company + "' and area.enabled = true order by area.name ASC");
		
		return listQuery.list();
	}

	@Transactional
	public Area getAreaById(int id){
		return (Area) getHibernateTemplate().getSessionFactory().getCurrentSession().load(Area.class, new Integer(id));
	}

	@Transactional
	public Long countAreas(int id_company){
		return (Long) getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("select count (*) from Area area where area.company.id='" + id_company + "'").uniqueResult();
	}
	
	@Transactional
	public void updateArea(Area area){
        getHibernateTemplate().getSessionFactory().getCurrentSession().saveOrUpdate(area);
	}
	
	@Transactional
	public Area getFullArea(int id){
	    Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(Area.class, "area");
	    criteria.setFetchMode("company", FetchMode.JOIN);
	    criteria.add(Restrictions.idEq(id)).uniqueResult();
	    Area area = (Area) criteria.list().get(0);
	    return area;
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Area> searchArea(String name, int id_company){
	    return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Area area where area.name like '%" + name + "%' and area.company.id = "+ id_company).list();
	}
	
	@Transactional
	public void deleteArea(Area area){
	    Area areaToDelete = (Area) getHibernateTemplate().getSessionFactory().getCurrentSession().load(Area.class, new Integer(area.getId()));
	    areaToDelete.setEnabled(false);
	    getHibernateTemplate().getSessionFactory().getCurrentSession().save(areaToDelete);
	}
	
}
