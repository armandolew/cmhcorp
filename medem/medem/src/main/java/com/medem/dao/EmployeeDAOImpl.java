package com.medem.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medem.model.Employee;

@Repository("employeeDAO")
public class EmployeeDAOImpl extends HibernateDaoSupportWithJdbcTemplateHolder implements EmployeeDAO {

	@Autowired
	public EmployeeDAOImpl(HibernateTemplate hibernateTemplate) {
		super(hibernateTemplate);
	}

 
    @Transactional
    public void addEmployee(Employee employee){
    	getHibernateTemplate().getSessionFactory().getCurrentSession().save(employee);
    }
 
    @SuppressWarnings("unchecked")
    @Transactional
    public List<Employee> listEmployees(int page, int recordsPerPage, int id_company){            	
//    	String hql = "from Employee employee where employee.enabled = :enabled";
//    	List<Employee> result = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql).setString("enabled", "1").list();
//    	return result;
        Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(Employee.class);
        criteria.add(Restrictions.eq("company.id", id_company));
        criteria.setFirstResult((page - 1) * recordsPerPage);
        criteria.setMaxResults(recordsPerPage);
        
        return criteria.list();
    }
 
    @Transactional
    public Employee getEmployeeById(int id){             
        return (Employee) getHibernateTemplate().getSessionFactory().getCurrentSession().load(Employee.class, new Integer(id));        
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Employee> searchEmployee(String name){
    	return getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("from Employee employee where employee.name like '%" + name + "%' or employee.lastName1 like '%" + name + "%' or employee.lastName2 like '%" + name + "%'").list();
    }
    
    @Transactional
    public Long countEmployees(int id_company){
    	return (Long) getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery("select count (*) from Employee employee where employee.company.id = " + id_company).uniqueResult();
    }

    @Transactional
    public Employee getFullEmployee(int id){
        Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(Employee.class, "employee");
        criteria.setFetchMode("address", FetchMode.JOIN);
        criteria.setFetchMode("company", FetchMode.JOIN);
        criteria.setFetchMode("area", FetchMode.JOIN);
        criteria.add(Restrictions.idEq(id)).uniqueResult();
        
        Employee employee = (Employee) criteria.list().get(0);
        
        return employee;
    }


    @Transactional
    public void updateEmployee(Employee employee){
        getHibernateTemplate().getSessionFactory().getCurrentSession().saveOrUpdate(employee);
        
    }


    @Transactional
    public void deleteEmployee(Employee employee){
        employee.setEnabled(false);
        getHibernateTemplate().getSessionFactory().getCurrentSession().saveOrUpdate(employee);
    }

    @SuppressWarnings("unchecked")
    @Transactional
    public List<Employee> listEmployeesRedux(int id_company){
        String hql = "FROM Employee employee JOIN employee.area WHERE employee.company.id = " + id_company;
        Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
        
        return query.list();
    }
}
