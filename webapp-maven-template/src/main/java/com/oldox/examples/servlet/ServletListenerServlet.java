package com.oldox.examples.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
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
public class ServletListenerServlet extends HttpServlet {
	Logger logger = LoggerFactory.getLogger(ServletListenerServlet.class);

	public ServletListenerServlet() {
		System.out.println("ServletListenerServlet method is invoked");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method is invoked");
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost method is invoked");
		
		// 获取ServletContext初始化时设置的参数
		ServletContext context = req.getSession().getServletContext();
		Map<String, String> params = (Map<String, String>)context.getAttribute("params");
		System.out.println(params);
		
		resp.getWriter().write("aaaaaaaaaaaaaaaaa");
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
