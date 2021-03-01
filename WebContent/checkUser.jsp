<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"%>
        <%@page import="java.util.Arrays"%>
<%@page import="cn.edu.xaut.bean.Userbean"%>
<%@page import="cn.edu.xaut.dao.Userdao"%>
<%@page import="cn.edu.xaut.dao.UserdaoIn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/Style2.css"></link>
<!-- 嵌入css样式 -->
<link rel="stylesheet" href="css/bootstrap.min.css"></link>
<!-- 嵌入css样式 -->
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-3.4.1.min.js"></script>
<title>checkUser</title>
</head>
<body>
<jsp:useBean id="userInfo" class="cn.edu.xaut.bean.Userbean"
		scope="request"></jsp:useBean>
	<jsp:setProperty property="*" name="userInfo"></jsp:setProperty>
<%
request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8");
Userdao s=new UserdaoIn();//实现类实例化Studentdao的接口
List<Userbean> list=s.findAllUser();
/* List<StudentBean> list = (List<StudentBean>) request.getAttribute("studentlist");
 */String user = new String(request.getParameter("user").getBytes("ISO-8859-1"), "utf-8");
/* String[] userList=new String[1000] ;
 */int i=0,result=-1;
 String str="";
if (list == null || list.size() < 1)
	System.out.println("没有数据！");
else {//遍历数据
	for (Userbean u : list) {
		str=u.getUsername();
		//System.out.println(str+"  "+user);
		if(str.equals(user))
			result=1;
	}
}
/* Arrays.sort(userList); //对数组排序  
int result = Arrays.binarySearch(userList,user); //搜索数组 */
if (result > -1) {
	out.println("很抱歉，该用户名已经被注册！"); //输出检测结果
	
} else {
	out.println("恭喜您，该用户名没有被注册！"); //输出检测结果
}
%>
</body>
</html>