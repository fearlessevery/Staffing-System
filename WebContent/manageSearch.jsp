<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="cn.edu.xaut.bean.StudentBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="CSS/Style2.css"></link><!-- 嵌入css样式 -->
<script type="text/javascript" src="JS/manage.js"></script>
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="userInfo" class="cn.edu.xaut.bean.Userbean" scope="request"></jsp:useBean>
<jsp:setProperty property="*" name="userInfo"></jsp:setProperty><!-- 将表单post到数据得到进来 -->

<%
/* String usernamee=(String)request.getAttribute("data");//用表单得到的
System.out.println(userInfo);
 System.out.println(userInfo.getUsername()); */
//System.out.println(usernamee); 
%>
<%
String username=(String)session.getAttribute("logininfo");//显示用户信息
%>
	<div id="big">
		<div id="header">
			<div id="">
				<span id="title"> <a href="#">用户管理系统</a>
				</span> <span id="date"> <a href="#">2019/9/9</a>
				</span>
			</div>
		</div>
		<div id="middle">
			<%=username %>
			<h1>管理</h1>
			<form name="form_table" id="form_table">
				<input type="test" name="search" id="search" value="" /> 
				<input type="submit" name="btnSearch" id="btnSearch" value="查找" 	onclick="return research();" />
			    <input type="button"name="btnEdit" id="btnEdit" value="修改" onclick="return gai();" />
				<input type="button" name="btnDelete" id="btnDelete" value="删除" onclick="return deletee();" />
				<a href="">删除Session<%	session.invalidate(); %></a>
			</form>
			<table border="0" cellpadding="0" class="form_table">
			
				<tr>
					<th>姓名</th>
					<th>大学</th>
					<th>电话</th>
					<th>邮箱</th>
					<th>生日</th>
					<th>最后登陆</th>
				</tr>
				<%//从request中取出list，不知道数据的个数，要用到循环的方式
					List<StudentBean> list=(List<StudentBean>)request.getAttribute("studentlist");
					if(list==null||list.size()<1)
						out.println("没有数据！");
					else{//遍历数据
						for(StudentBean stu:list){
				%>
					<tr align="center" bgcolor="white">
						<td><%=stu.getStuname()%></td>
						<td><%=stu.getStucolledg()%></td>
						<td><%=stu.getStutel()%></td>
						<td><%=stu.getStuemail()%></td>
						<td><%=stu.getBirthday()%></td>
						<td><%=stu.getLasttime()%></td>
						<td><a href='UpdateStudentServlet?id=<%=stu.getStuid() %>'>pppp</a>
						<a href='DeleteStudentServlet?id=<%=stu.getStuid() %>' onclick="if(confirm('是否真的删除该用户')==true){return true;}else{return false;}">删除</a>
						</td>
					</tr>
				<% 	}
					}
				%>
			</table>
		</div>
		<div id="tail">
			<div id="tail_bg">127154621@xaut.edu.cn</div>
		</div>
	</div>
</body>
</html> --%>