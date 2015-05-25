package com.medem.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.User;

@Repository("userDAO")
public class UserDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements UserDAO {

	@Autowired
	public UserDAOImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public void addUser(User user) {
		getHibernateTemplate().getSessionFactory().getCurrentSession().save(user);
		
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> listUsers() {
		return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from User").list();
	}

	@Transactional
	public User getUserById(int id) {
		return (User) getHibernateTemplate().getSessionFactory().getCurrentSession().load(User.class, new Integer(id));
	}

    @Transactional
	public User getUserByName(String name) {
		//return (User) getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from User user where user.username='" + name + "'").uniqueResult();
        Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(User.class)
        .add(Restrictions.eq("username", name));
        return (User) criteria.uniqueResult();
	}

    @Transactional
    public User getFullUserByName(String name) {
        Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(User.class);
        criteria.setFetchMode("company", FetchMode.JOIN);
        criteria.add(Restrictions.eqOrIsNull("username", name));
        return (User) criteria.uniqueResult();
    }


}
