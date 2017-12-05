package com.oldox.examples.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oldox.examples.filter.wrapper.GreetingWrapper;

public class GreetingFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		ServletContext context = httpRequest.getSession().getServletContext();
		Map<String, String> params = (Map<String, String>)context.getAttribute("params");
		System.out.println(params);
		PrintWriter pw = response.getWriter();
		pw.write("@@@@@@@@@@@@@@@@@");
		GreetingWrapper wrapper = new GreetingWrapper((HttpServletResponse)response);
		wrapper.getWriter().write("&&&&&&&&&&&&&&&&&&&");
		chain.doFilter(request, wrapper);
		wrapper.getWriter().write("^^^^^^^^^^^^^^^^^^^");
		pw.write("################");
		pw.close();
		System.out.println("sssssssssssssssss");
		System.out.println(request.getAttribute("aaa"));
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
