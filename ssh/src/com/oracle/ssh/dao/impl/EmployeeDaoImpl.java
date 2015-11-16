package com.oracle.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.oracle.ssh.dao.EmployeeDao;
import com.oracle.ssh.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	// 定义属性以得到sessionFactory
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	// 得到session
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public List<Employee> getAll() {
		//String hql = "from Employee";
		String hql = "from Employee e left outer join fetch e.dept";
		return getSession().createQuery(hql).list();

	}

}
