<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="cn.edu.xaut.bean.StudentBean"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>      <!--  file:///F:/javamiddletool/v4.0/theme/templates/admin/index.html -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/Style2.css"></link>
<!-- 嵌入css样式 -->
<link rel="stylesheet" href="css/bootstrap.min.css"></link>
<!-- 嵌入css样式 -->
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-3.4.1.min.js"></script>
<script>
$(document).ready(function(){	
	$("button[name='bianji']").click(function(){
		var id=$(this).attr('id');
		var str=id.split("&");
	    $("input[name='stuid']").attr('value',str[0]);
	    $("input[name='stuname']").attr('value',str[1]);
	    $("input[name='stuschool']").attr('value',str[2]);
	    $("input[name='stunumber']").attr('value',str[3]);
	    $("input[name='stuemail']").attr('value',str[4]);
	    $("input[name='stubirthday']").attr('value',str[5]);  
	});	
});

</script>
	<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
<title>manage</title>
</head>
<body>
	<jsp:useBean id="userInfo" class="cn.edu.xaut.bean.Userbean"
		scope="request"></jsp:useBean>
	<jsp:setProperty property="*" name="userInfo"></jsp:setProperty><!-- 将表单post到数据得到进来 -->
	<%
		String username = (String) session.getAttribute("logininfo");//显示用户信息
		Date date=new Date();
		SimpleDateFormat dd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today=dd.format(date);
	%>
	<div class="container">
		<!--用容器包住-->
		<div class="row">
			<!--用行包住-->
			<div class="col-md-8 col-md-offset-2">
				<!--用列包住，占8列，向右偏移两列-->
				<div id="big">
					<div id="header">
						<div id="">
							<span id="title"> <a href="#">用户管理系统</a>
							</span> <span id="date"> <a href="#"><%=today %></a>
							</span>
						</div>
					</div>
					<div id="middle">
						<%=username%>
						<h1>管理</h1>
 							<form class="form_inline" id="form2" action="showSearchStudent" method="get">
 							<input type="submit" class="btn btn-info" name="btnSearch" id="btnSearch" value="查找" />	
 								<div class="form-group col-md-8">
							 		<input type="text" class="form-control" id="search" name="search" placeholder="请输入查找学生姓名"/>	
								</div>	
								
							</form>
							<form class="form_inline" id="form2" action="addStudent.jsp" method="get">
 								<div class="form-group col-md-8">
 									<b style="color:black">欲增加学生跳转至另一个页面</b>
								</div>	
								<br>
								 <input type="submit" class="btn btn-danger" name="btnAdd" id="btnAdd" value="增加" />
							</form>
							<!-- <form class="form_inline" id="form2" action="addStudent.jsp" method="get">
 								<div class="form-group col-md-8">
							 		<input type="text" class="form-control" id="add" name="add" placeholder="请输入增加学生字段"/>	
								</div>	
								<br>
								 <input type="submit" class="btn btn-danger" name="btnAdd" id="btnAdd" value="增加" />
							</form>
							 -->
						<table class="table table-border"><!-- 自带表格样式 ,有边框-->
							<thead>
							<tr>
								<th>id号</th>
								<th>姓名</th>
								<th>大学</th>
								<th>电话</th>
								<th>邮箱</th>
								<th>生日</th>
								<th>最后登陆</th>
							</tr>
							</thead>
							<%
								//从request中取出list，不知道数据的个数，要用到循环的方式
								List<StudentBean> list = (List<StudentBean>) request.getAttribute("studentlist");
								if (list == null || list.size() < 1)
									out.println("没有数据！");
								else {//遍历数据
									for (StudentBean stu : list) {
										String ss=stu.getStucolledg()+","+stu.getStutel()+","+stu.getStuemail()+","+stu.getBirthday()+","+stu.getLasttime();
							%>
							<tbody>
							<tr align="center" bgcolor="white">
								<td><%=stu.getStuid()%></td>
								<td><%=stu.getStuname()%></td>
								<td><%=stu.getStucolledg()%></td>
								<td><%=stu.getStutel()%></td>
								<td><%=stu.getStuemail()%></td>
								<td><%=stu.getBirthday()%></td>
								<td><%=stu.getLasttime()%></td>
								
								<%-- <% System.out.println(stu.getStuid());%> --%>
								<td><%-- <a  class="btn btn-warning btn-sm" href='updateStudet.jsp?stuinfomation=<%=ss%>'>编辑</a> --%>
										<button class="btn btn-warning btn-sm" data-toggle="modal" data-target="#myModal" id="<%=stu.getStuid()+"&"+stu.getStuname()+"&"+stu.getStucolledg()+"&"+stu.getStutel()+"&"+stu.getStuemail()+"&"+stu.getBirthday()%>" name="bianji">
											编辑
										</button>									
								<a class="btn btn-primary btn-sm" href='DeleteStudentServlet?id=<%=stu.getStuid()%>'
									onclick="if(confirm('是否真的删除该用户')==true){return true;}else{return false;}">删除</a>
								</td>
							</tr>
							<%
								}
								}
							%>
							</tbody>
						</table>
					</div>
					<div id="tail">
						<div id="tail_bg">127154621@xaut.edu.cn</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">将学生信息修改为</h4>
				</div>
				<div class="modal-body">
					<form role="form" action="UpdateStudentServlet" method="get">
						<input type="hidden" class="form-control" name="stuid" id="ID">
						<div class="modal-body">
							<div class="form-group">
								<label class="control-label">姓名:</label> 
								<input type="text" class="form-control" name="stuname" id="updatebooknumber">
							</div>
						</div>
						
						<div class="modal-body">
							<div class="form-group">
								<label class="control-label">学校:</label> 
								<input type="text" class="form-control" name="stuschool" id="updatebooknumber">
							</div>
						</div>
						<div class="modal-body">
							<div class="form-group">
								<label class="control-label">电话:</label> 
								<input type="text" class="form-control" name="stunumber" id="updatebooknumber">
							</div>
						</div>
						<div class="modal-body">
							<div class="form-group">
								<label class="control-label">邮箱:</label> 
								<input type="text" class="form-control" name="stuemail" id="updatebooknumber">
							</div>
						</div>
						<div class="modal-body">
							<div class="form-group">
								<label class="control-label">出生日期:</label> 
								<input type="text" class="form-control" name="stubirthday" id="updatebooknumber">
							</div>
						</div>						
						<div class="modal-footer">						
							<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
							<!--  <a href='UpdateStudentServlet?stuinfomation=booknumber' class="btn btn-primary" onclick="sel()">提交更改</a>-->
							<input type="submit" class="btn btn-primary" value="提交">
						</div>
					</form>
				</div>

			</div><!-- /.modal-content -->
	</div><!-- /.modal -->
</div>

</body>
</html>