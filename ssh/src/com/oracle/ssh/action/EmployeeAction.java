package com.oracle.ssh.action;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.oracle.ssh.service.EmployeeService;

public class EmployeeAction extends ActionSupport implements RequestAware {

	// ���ڽ���Ϣ���浽request������
	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
	}

	// ��������EmployeeService
	private EmployeeService employeeService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	// ����Acton�Ĳ�ѯ����Ա����Ϣ����
	public String list() {
		request.put("employee", employeeService.getAll());
		return "list";
	}

}
