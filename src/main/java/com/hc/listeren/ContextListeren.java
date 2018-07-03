package com.hc.listeren;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListeren implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("web应用销毁");

	}

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("web应用初始化");
	}

}
