package com.oracle.ssh.service.impl;

import java.util.List;

import com.oracle.ssh.dao.EmployeeDao;
import com.oracle.ssh.entity.Employee;
import com.oracle.ssh.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	// 设置属性以得到EmployeeDaoImpl
	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	// 示例，实际项目中需要进行事务处理

	@Override
	public List<Employee> getAll() {
		return employeeDao.getAll();
	}

}
