package com.oldox.examples.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyServletContextAttributeListner implements ServletContextAttributeListener {

	public MyServletContextAttributeListner(){
		System.out.println("MyServletContextAttributeListner method is invoked");
	}
	
	@Override
	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("attributeAdded method is invoked");
		System.out.println("the attribute name is: "+arg0.getName());
		System.out.println("the attribute value is: "+arg0.getValue());
		System.out.println("the attribute source is: "+arg0.getSource());
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("attributeRemoved method is invoked");
		System.out.println("the attribute name is: "+arg0.getName());
		System.out.println("the attribute value is: "+arg0.getValue());
		System.out.println("the attribute source is: "+arg0.getSource());

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent arg0) {
		System.out.println("attributeReplaced method is invoked");
		System.out.println("the attribute name is: "+arg0.getName());
		System.out.println("the attribute value is: "+arg0.getValue());
		System.out.println("the attribute source is: "+arg0.getSource());

	}

}
