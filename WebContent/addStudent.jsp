<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/Style1.css"></link><!-- 嵌入css样式 -->
<link rel="stylesheet" href="css/bootstrap.min.css"></link>
<script type="text/javascript" src="js/zhuce.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery-3.4.1.min.js"></script>
<title>ADD student</title>
</head>
<body>
<div id="big">
<form action="addStudentServlet" method="get" id="formtt" class="form-horizontal"><!-- 注意这里的页面跳转成了servlet，构造了一个水平表单--> 
				<fieldset><!-- 打包方式 -->
				<br>
				<br>
					<div class="form-group"><!-- username的一组控件 -->
						<label for="id" class="col-md-4 control-label">学生id：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="text" class="form-control" name="id" id="id" 
							 placeholder="请输入添加学生id号" />		
						</div>																										
					</div>	
					<div class="form-group"><!-- password的一组控件 -->
						<label for="name" class="col-md-4 control-label">姓        名：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="text" class="form-control" name="name" id="name" 
							 placeholder="请输入添加学生姓名"/>		
						</div>															
					</div>	
					<div class="form-group"><!-- password的一组控件 -->
						<label for="collage" class="col-md-4 control-label">就读大学：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="text" class="form-control" name="collage" id="collage" 
							 placeholder="请输入添加学生就读大学" />		
						</div>															
					</div>
					<div class="form-group"><!-- password的一组控件 -->
						<label for="telnumber" class="col-md-4 control-label">手机号码：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="tel" class="form-control" name="telnumber" id="telnumber" 
							 placeholder="请输入添加学生手机号"  />		
						</div>															
					</div>	
					<div class="form-group"><!-- password的一组控件 -->
						<label for="emialaddress" class="col-md-4 control-label">邮            箱：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="email" class="form-control" name="emialaddress" id="emialaddress" 
							 placeholder="请输入添加学生邮箱地址" />		
						</div>															
					</div>	
					<div class="form-group"><!-- password的一组控件 -->
						<label for="birthday" class="col-md-4 control-label">出       生    日    期：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="text" class="form-control" name="birthday" id="birthday" 
							 placeholder="请输入添加学生出生日期" />		
						</div>															
					</div>		
					<div class="form-group"><!-- imgecode的一组控件 -->
						<label for="logintime" class="col-md-4 control-label">最后登录时间：</label><!--label是text的label -->
						<div class="col-md-4"><!-- 竖直表单不需要 -->
							 <input type="text" class="form-control" name="logintime" id="logintime" 
							 placeholder="请输入最后登陆时间"/>		
						</div>	
					</div>	
					<div class="col-md-4 col-md-offset-4" ><!-- 改版按钮形状 -->
						<input type="submit" value="添加 &raquo;" class="btn btn-danger"/ >
					</div>		
					<br>
					<br>	
					<br>		
				</fieldset>
	</form>
	</div>	
</body>
</html>



	
	<!-- <form action="showAllStudent" method="post" id="formmm" class="form-horizontal">
		<table align="center" width="450">
			<tr>
				<td align="center" colspan="2">
					<h2>添加学生信息</h2>
					<hr>
				</td>
			</tr>
			<tr>
				<td align="right">学生id：</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td align="right">姓        名：</td>
				<td><input type="text" name="price" /></td>
			</tr>
			<tr>
				<td align="right">就读大学：</td>
				<td><input type="text" name="bookCount" /></td>
			</tr>
			<tr>
				<td align="right">电        话：</td>
				<td><input type="text" name="author" /></td>
			</tr>
			<tr>
				<td align="right">邮        箱：</td>
				<td><input type="text" name="author" /></td>
			</tr>
			<tr>
				<td align="right">出       生    日    期：</td>
				<td><input type="text" name="author" /></td>
			</tr>
			<tr>
				<td align="right">最后登录时间：</td>
				<td><input type="text" name="author" /></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="submit" value="添　加">
				</td>
			</tr>
		</table>
	</form> -->
