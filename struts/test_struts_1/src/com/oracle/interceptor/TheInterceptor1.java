package com.oracle.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TheInterceptor1 implements Interceptor {
	private String test;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		System.out.println("set invoke");
		this.test = test;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("���õ�һ��������");
		// �õ���������Action������
		//System.out.println("����Action������    " + invocation.getAction().getClass());
		// �������invocation�����һ������
		String result = invocation.invoke();
		System.out.println("���صĽ����"+result);
		System.out.println("���ý���");
		return result;
	}

}
