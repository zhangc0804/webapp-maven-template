package com.oldox.examples.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 这是一个简单的servlet，用于演示servlet的生命周期
 * <p>
 * 
 * @author ZhangChao
 *
 */
public class FilterChainTestServlet extends HttpServlet {
	Logger logger = LoggerFactory.getLogger(FilterChainTestServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method is invoked");
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost method is invoked");
		
//		String userName = "zhangsan和lisi";
		resp.getWriter().write("###");
		resp.getWriter().close();
	}

}
