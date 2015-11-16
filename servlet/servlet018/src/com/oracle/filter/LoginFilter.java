package com.oracle.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("destroy()");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("doFiler");
		
		HttpServletRequest r = (HttpServletRequest) request;
		
		String requestURI = r.getRequestURI();
		System.out.println(requestURI);
		
		if (requestURI.endsWith("login.jsp")
				|| requestURI.endsWith("loginServlet")) {
			chain.doFilter(request, response);
			return;
		}
		
		HttpSession session = r.getSession();

		if (null == session.getAttribute("user")) {
			((HttpServletResponse) response)
					.sendRedirect("filter/login.jsp");
			return;
		} else {
			chain.doFilter(request, response);
		}
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("init()");
	}

}
