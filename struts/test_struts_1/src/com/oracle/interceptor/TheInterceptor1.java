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
		System.out.println("调用第一个拦截器");
		// 得到我们拦截Action的类名
		//System.out.println("调用Action的类名    " + invocation.getAction().getClass());
		// 调用这个invocation后的下一步处理
		String result = invocation.invoke();
		System.out.println("返回的结果："+result);
		System.out.println("调用结束");
		return result;
	}

}
