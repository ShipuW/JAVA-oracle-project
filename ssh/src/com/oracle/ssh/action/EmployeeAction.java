package com.oracle.ssh.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.ssh.service.EmployeeService;

public class EmployeeAction extends ActionSupport implements RequestAware {

	// 用于将信息保存到request对象中
	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
	}

	// 设置属性EmployeeService
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	// 创建Acton的查询所有员工信息方法
	public String list() {
		request.put("employee", employeeService.getAll());
		return "list";
	}

}
