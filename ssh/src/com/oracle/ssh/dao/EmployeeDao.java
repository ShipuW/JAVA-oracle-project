package com.oracle.ssh.dao;

import java.util.List;

import com.oracle.ssh.entity.Employee;

public interface EmployeeDao {
	// 查询出所有的员工信息
	public List<Employee> getAll();

}
