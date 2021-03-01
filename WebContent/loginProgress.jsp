<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cn.edu.xaut.bean.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userInfo" class="cn.edu.xaut.bean.Userbean" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="userInfo"></jsp:setProperty>
	<%-- <jsp:setProperty property="username" name="userInfo"></jsp:setProperty>
	<jsp:setProperty property="password" name="userInfo"></jsp:setProperty> --%>

<%  String username=userInfo.getUsername();
String password=userInfo.getUsername(); 
//if("zhangsan".equals(username)&&"123".equals(password)){ 
	 //产生新的cookie放进*/
	//response.sendRedirect("manage.jsp"); 
	
	/* System.out.println(userInfo.getUsername());
	System.out.println(userInfo.getPassword()); */
	if("zhangsan".equals(userInfo.getUsername())&&"123".equals(userInfo.getPassword())){
		String loginCookie=username+"#"+password;
		Cookie cookie=new Cookie("loginCookie",loginCookie);
		cookie.setMaxAge(60*60*24*10);
		response.addCookie(cookie);
		session.setAttribute("loginSession", userInfo.getUsername());
	%>	
	<jsp:forward page="manage.jsp"></jsp:forward>
	<% 
	}
else	
	{//response.sendRedirect("login.jsp");	
	%>	
	<jsp:forward page="login.jsp"></jsp:forward>
<% }%><!-- 注意这里的括号很有必要，否则中间的跳转页面很容易出错 -->
</body>
</html>