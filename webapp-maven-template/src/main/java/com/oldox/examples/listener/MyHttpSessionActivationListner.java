package com.oldox.examples.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

public class MyHttpSessionActivationListner implements HttpSessionActivationListener {

	@Override
	public void sessionDidActivate(HttpSessionEvent arg0) {

	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
