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
public class MyServlet1 extends HttpServlet {
	Logger logger = LoggerFactory.getLogger(MyServlet1.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession().setAttribute("p1", "p11111111");
				PrintWriter pw = resp.getWriter();
//		System.out.println(pw);
		pw.write(req.getContextPath()+"/MyServlet2");
		
		RequestDispatcher rd = req.getRequestDispatcher("/test1.jsp");
		if(rd!=null) {
			req.setAttribute("param", "******************");
			rd.forward(req, resp);
		}
		
//		resp.sendRedirect("/MyServlet2");
	}

}
