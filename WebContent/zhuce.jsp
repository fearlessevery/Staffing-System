<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/Style1.css"></link><!-- 嵌入css样式 -->
<link rel="stylesheet" href="css/bootstrap.min.css"></link>
<script type="text/javascript" src="js/zhuce.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-3.4.1.min.js"></script>
<title>register</title>
</head>
<body>
<%
Date date=new Date();
		SimpleDateFormat dd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today=dd.format(date);%>

	<div id="big">
		<div id="header">
			<div id="">
				<span id="title">
					<!--组合文档中的行内元素--> <a href="#">用户注册 </a>
				</span> <span id="date"> <a href="#"><%=today %></a>
				</span>
			</div>
		</div>
		<div id="middle">
			<h1>注册</h1>
			<form action="registerServelet" method="get" id="formt" class="form-horizontal"><!-- 注意这里的页面跳转成了servlet，构造了一个水平表单--> 
				<!--如果用post，跳转时会出现服务器错误-->
				<fieldset><!-- 打包方式 -->
					<div class="form-group"><!-- username的一组控件 -->
						<label for="username" class="col-md-2 control-label">用户名:</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="text" class="form-control" name="username" id="username" 
							 placeholder="请输入用户名" onblur="checkUsername()" />		
						</div>															
							 <span class="info" id="usernameInfo" />						
					</div>	
					<div class="form-group"><!-- username的一组控件 -->
						<label for="realname" class="col-md-2 control-label">真实姓名:</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="text" class="form-control" name="realname" id="realname" 
							 placeholder="请输入真实名" onblur="checkRealname()" />		
						</div>															
							 <span class="info" id="realnameInfo" />						
					</div>	
					<div class="form-group"><!-- password的一组控件 -->
						<label for="password" class="col-md-2 control-label">设置密码：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="password" class="form-control" name="password" id="password" 
							 placeholder="请输入密码" onblur="checkPassword()" />		
						</div>															
							 <span class="info" id="passwordInfo" />						
					</div>	
					<div class="form-group"><!-- password的一组控件 -->
						<label for="password1" class="col-md-2 control-label">确认密码：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="password" class="form-control" name="password1" id="password1" 
							 placeholder="请再次输入密码" onblur="checkPassword1()" />		
						</div>															
							 <span class="info" id="password1Info" />						
					</div>
					<div class="form-group"><!-- password的一组控件 -->
						<label for="telnumber" class="col-md-2 control-label">手机号码：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="tel" class="form-control" name="telnumber" id="telnumber" 
							 placeholder="请输入手机号码" onblur="checkTelnumber()" />		
						</div>															
							 <span class="info" id="telnumberInfo" />						
					</div>	
					<div class="form-group"><!-- password的一组控件 -->
						<label for="emialaddress" class="col-md-2 control-label">邮箱：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="email" class="form-control" name="emialaddress" id="emialaddress" 
							 placeholder="请输入邮箱地址" onblur="checkEmialaddress()" />		
						</div>															
							 <span class="info" id="emialaddressInfo" />						
					</div>	
					<div class="form-group"><!-- password的一组控件 -->
						<label for="partment" class="col-md-2 control-label">所在部门：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="text" class="form-control" name="partment" id="partment" 
							 placeholder="请输入所在部门" onblur="checkPartment()" />		
						</div>															
							 <span class="info" id="partmentInfo" />						
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
						<input type="submit" value="登陆&raquo;" class="btn btn-info" onclick="return check2();"/ >
						<input type="reset" value="重置 &raquo;" class="btn btn-danger"/ >
					</div>					
				</fieldset>
				
			</form>
		</div>
		<div id="tail">
			<div id="tail_bg">127154621@qq.com</div>
		</div>
	</div>
</body>
</html>