package com.oldox.examples.listener;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListener implements ServletContextListener {
	
	public MyServletContextListener() {
		System.out.println("the MyServletContextListener constructor is invoked");
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		System.out.println("the servlet context is destroying");
		ServletContext context = event.getServletContext();
		Map<String, String> params = (Map<String, String>)context.getAttribute("params");
		params.clear();
		context.removeAttribute("params");
		System.out.println("the servlet context destroyed");
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("the servlet context is initializing");
		ServletContext context = event.getServletContext();
		Map<String, String> params = new HashMap<String, String>();
		params.put("key1", "value1");
		params.put("key2", "value2");
		context.setAttribute("params", params);
		System.out.println("the servlet context initialized");
	}

}
