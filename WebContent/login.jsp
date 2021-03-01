<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>login</title>
<link rel="stylesheet" href="css/Style1.css"></link><!-- 嵌入css样式 -->
<link rel="stylesheet" href="css/bootstrap.min.css"></link><!-- 嵌入css样式 -->
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/login.js"></script>
</head>
<body>
		<%
		 String name=null;
		 String pass=null;
		 String checked=null;
		 if(session.getAttribute("loginSession")!=null){
			response.sendRedirect("manage.jsp"); 
			}
		 
			Cookie[] cookies=request.getCookies();
			 if(cookies!=null&&cookies.length>0){		
				for(Cookie cookie:cookies)
					if(cookie.getName().equals("loginCookie")){
						name=cookie.getValue().split("#")[0];
						pass=cookie.getValue().split("#")[1];
						System.out.print(name+"   "+pass);
						checked="checked";
					//response.sendRedirect("manage.jsp");
				}		
		} 
		Date date=new Date();
		SimpleDateFormat dd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today=dd.format(date);
		//response.setIntHeader("Refresh", 1);
	%>
<div class="container"><!--用容器包住-->
<div class="row"><!--用行包住-->
<div class="col-md-8 col-md-offset-2"><!--用列包住，占8列，向右偏移两列-->
	<div id="big">
		<div id="header">
			<div id="">
				<span id="title">
					<!--组合文档中的行内元素--> <a href="#">员工登陆系统 </a>
				</span> <span id="date"> <a href="#"><%=today %></a>
				</span>
			</div>
		</div>
		<div id="middlee">
			<h1>登陆</h1>
			<form action="loginServelet" method="get" id="formm" class="form-horizontal"><!-- 注意这里的页面跳转成了servlet，构造了一个水平表单--> 
				<!--如果用post，跳转时会出现服务器错误-->
				<fieldset><!-- 打包方式 -->
					<div class="form-group"><!-- username的一组控件 -->
						<label for="username" class="col-md-2 control-label"> 账号：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="text" class="form-control" name="username" id="username" 
							 placeholder="请输入用户名" onblur="checkUsername()" />		
						</div>															
							 <span class="info" id="usernameInfo" />						
					</div>	
					<div class="form-group"><!-- password的一组控件 -->
						<label for="password" class="col-md-2 control-label">密码：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="password" class="form-control" name="password" id="password" 
							 placeholder="请输入密码" onblur="checkPassword()" />		
						</div>															
							 <span class="info" id="passwordInfo" />						
					</div>	
					<div class="form-group"><!-- imgecode的一组控件 -->
						<label for="imageCode" class="col-md-2 control-label">验证码：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="text" class="form-control" name="imageCode" id="imageCode" 
							 placeholder="请输入验证码" onblur="checkImagecode()" />		
						</div>	
							<img class="veriTmg" src="img/timg.jpg" width="45px" height="30px"/>														
							 <span class="info" id="imageCodeInfo" />						
					</div>	
					<div class="col-md-4 col-md-offset-2" ><!-- 改版按钮形状 -->
							<input type="submit" value="登录 &raquo;" class="btn btn-info" onclick="return check();"/ >
						<span> <a href="zhuce.jsp" class="btn btn-danger">尚未注册</a></span>
						</div>					
				</fieldset>
			</form>
		</div>
		<div id="tail">
			<div id="tail_bg">127154621@qq.com</div>
		</div>
	</div>
</div>
</div>
</div>
</body>
</html>