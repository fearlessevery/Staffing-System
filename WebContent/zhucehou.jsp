<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/Style4.css"></link>
<title>regiser</title>
</head>
<body>
<jsp:useBean id="userInfo" class="cn.edu.xaut.bean.Userbean" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="userInfo"></jsp:setProperty><!-- 将表单post到数据得到进来 -->
<%
/* String username=request.getParameter("username");//用表单得到的
String telnumber=request.getParameter("telnumber");
String realname=request.getParameter("realname");
String emialaddress=request.getParameter("emialaddress");
String partment=request.getParameter("partment"); */

String username=userInfo.getUsername();
String telnumber=userInfo.getTelnumber();
String realname=userInfo.getRealname();
String emialaddress=userInfo.getEmialaddress();
String partment=userInfo.getPartment(); 
System.out.println(userInfo);
System.out.println(username);
%>
<div id="big">
	<div id="middle">
	<h1>     ！注册成功！</h1>
	<form action="login.jsp" method="get" id="formt">
		<table boder="0" cellspacing="0" cellpadding="0" class="font_table">
			<tr>
				<td align="right" valign="middle">用户名：</td>	
				<td align="left" valign="middle"><%=username %></td>		
			</tr>
			 <tr>
				<td align="right" valign="middle">姓名：</td>
				<td align="left" valign="middle"><%=realname %></td>
			</tr>
			<tr>
				<td align="right" valign="middle">手机号码：</td>
				<td align="left" valign="middle"><%=telnumber %></td>
			</tr>
			</tr>
			<tr>
				<td align="right" valign="middle">邮箱：</td>
				<td align="left" valign="middle"><%=emialaddress %></td>
			</tr>
			</tr>
			<tr>
				<td align="right" valign="middle">所在部门：</td>
				<td align="left" valign="middle"><%=partment %></td>
			</tr>
			</tr>
		</table>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit"  value="登陆 &raquo;" onclick="return check2();" />
	</form>
	</div>
	</div>
</body>
</html>