package com.hc.listeren;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent e) {
		System.out.println("session创建,sessionId是：" + e.getSession().getId());
		ServletContext application = e.getSession().getServletContext();
		Integer number=(Integer) application.getAttribute("online_people");
		if(number==null)
			   {number=0;}
			number++;
			application.setAttribute("online_people", number);
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String date = sdf.format(new Date());
			application.setAttribute("上线时间", date);
			System.out.println(date);
		System.out.println("新增在线用户");
	}

	public void sessionDestroyed(HttpSessionEvent e) {
		System.out.println("session销魂,sessionId是：" + e.getSession().getId());
		ServletContext application=e.getSession().getServletContext();
		Integer number = (Integer)application.getAttribute("online_people");
	    if(number==null){
	    	number=1;}
	    number--;
	    application.setAttribute("online_people", number);
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sdf.format(new Date());
		application.setAttribute("下线时间", date);
		System.out.println(date);
	    System.out.println("一位用户下线");
	}

}
