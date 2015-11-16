package com.oracle.ssh.service;

import java.util.List;

import com.oracle.ssh.entity.Employee;

public interface EmployeeService {
	// 业务逻辑层查询所有的员工信息
	public List<Employee> getAll();

}
