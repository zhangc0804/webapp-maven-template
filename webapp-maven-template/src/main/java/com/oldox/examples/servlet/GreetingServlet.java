package com.oldox.examples.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
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
public class GreetingServlet extends HttpServlet {
	Logger logger = LoggerFactory.getLogger(GreetingServlet.class);
	// 静态变量，servlet实例化次数
	private static int instanceCount = 0;

	public GreetingServlet() {
		instanceCount++;
		System.out.println("GreetingServlet method is invoked");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method is invoked");
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost method is invoked");
		System.out.println(req.getSession());
		resp.getWriter().write("aaaaaaaaaaaaaaaaa");

		// 判断Servlet实例化次数
		System.out.println("the count of this servlet's instance is:" + instanceCount);
		resp.getWriter().close();
	}

	@Override
	public void destroy() {
		System.out.println("destroy method is invoked");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init method is invoked");
		super.init();
	}

}
