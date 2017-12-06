package com.oldox.examples.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
public class ExactTwoServlet extends HttpServlet {
	Logger logger = LoggerFactory.getLogger(ExactTwoServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.write("This is: "+this.getClass()+"\n");
		pw.write("ContextPath: "+req.getContextPath()+"\n");
		pw.write("ServletPath: "+req.getServletPath()+"\n");
	}

}
