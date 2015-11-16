package com.oracle.ssh.service.impl;

import java.util.List;

import com.oracle.ssh.dao.EmployeeDao;
import com.oracle.ssh.entity.Employee;
import com.oracle.ssh.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	// ���������Եõ�EmployeeDaoImpl
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	// ʾ����ʵ����Ŀ����Ҫ����������

	@Override
	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

}
