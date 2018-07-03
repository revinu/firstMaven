package com.hc.listeren;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {

	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("销毁一个request" + arg0.getServletRequest().getAttributeNames());
	}

	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("创建了一个request" + arg0.getServletRequest().getLocalName());
	}

	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		System.out.println("添加属性");
		System.out.println("属性名为：" + arg0.getName());
		System.out.println("属性值为：" + arg0.getValue());
	}

	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		System.out.println("删除属性");

	}

	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("属性值替换");
		System.out.println("被替换的属性名为：" + arg0.getName());
		System.out.println("当前值为：" + arg0.getValue());

	}

}
