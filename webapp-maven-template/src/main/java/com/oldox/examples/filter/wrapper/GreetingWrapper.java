package com.oldox.examples.filter.wrapper;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class GreetingWrapper extends HttpServletResponseWrapper {

	public GreetingWrapper(HttpServletResponse response) {
		super(response);
	}

	@Override
	public PrintWriter getWriter() throws IOException {
		return new PrintWriter(new CharArrayWriter());
	}
	
	

}
