package com.hc.listeren;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionAttributeListener implements HttpSessionAttributeListener{

	public void attributeAdded(HttpSessionBindingEvent arg0) {
		System.out.println("添加属性");
		System.out.println("属性名为：" + arg0.getName());
		System.out.println("属性值为：" + arg0.getValue());		
	}

	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		System.out.println("删除属性");		
	}

	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		System.out.println("属性值替换");
		System.out.println("被替换的属性名为：" + arg0.getName());
		System.out.println("当前值为：" + arg0.getValue());
		
	}

}
