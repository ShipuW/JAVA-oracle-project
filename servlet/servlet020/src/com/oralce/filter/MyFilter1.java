package com.oralce.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter1 implements Filter {
	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("myFilter1 before chain.doFilter");

		chain.doFilter(request, response);

		System.out.println("myFilter1 after chain.doFilter");

	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

}
