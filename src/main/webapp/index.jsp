<%@ page language="java" contentType="text/html;charset=UTF-8" 
 import="java.util.*" pageEncoding="UTF-8"  isELIgnored="false"%>

<%
application.setAttribute("test", 4);
application.setAttribute("test", 3);
application.removeAttribute("test");
session.setAttribute("test1", 5);
session.setAttribute("test1", 6);
session.removeAttribute("test1");
request.setAttribute("test2", 10);
request.setAttribute("test2", 9);
request.removeAttribute("test2");
%>
<head>
<title>首页</title>
</head>

<html>
<body>
<h3>上线时间：${上线时间}</h3>
<h3>在线人数：${online_people}</h3>
<h1>hello World</h1>

</body>
</html>