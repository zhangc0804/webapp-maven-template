package com.oldox.examples.filter.wrapper;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class MyResponseWrapper extends HttpServletResponseWrapper {

	public MyResponseWrapper(HttpServletResponse response) {
		super(response);
	}

}
