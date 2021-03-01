/**
 * 
 */


function getResult() {
	if (http_request.readyState == 4) { // 判断请求状态
		if (http_request.status == 200) { // 请求成功，开始处理返回结果
			/*document.getElementById("toolTip").innerHTML ="很抱歉，该用户名已经被注册！";// http_request.responseText; // 设置提示内容
			document.getElementById("toolTip").style.display = "block"; // 显示提示框
*/			alert("很抱歉，该用户名已经被注册！");
		} else { // 请求页面有错误
			alert("您所请求的页面有错误！");
		}
	}
}
function createRequest(url) {
	http_request = false;
	if (window.XMLHttpRequest) { // 非IE浏览器
		http_request = new XMLHttpRequest(); // 创建XMLHttpRequest对象
	} else if (window.ActiveXObject) { // IE浏览器
		try {
			http_request = new ActiveXObject("Msxml2.XMLHTTP");
		} catch (e) {
			try {
				http_request = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e) {
			}
		}
	}
	if (!http_request) {
		alert("不能创建XMLHttpRequest对象实例！");
		return false;
	}
	http_request.onreadystatechange = getResult; // 调用返回结果处理函数
	http_request.open('GET', url, true); // 创建与服务器的连接
	http_request.send(null); // 向服务器发送请求
}
function checkUsername() {
	var username = formt.username;
	var usernameInfo = document.getElementById("usernameInfo");
	if (username.value == "") {
		usernameInfo.innerHTML = "请输入用户名！";
		usernameInfo.display = "block";
		username.focus();
		return false;
	} else {
		createRequest('checkUser.jsp?user=' + username.value);
		/*usernameInfo.innerHTML = "很抱歉，该用户名已经被注册！";
		usernameInfo.display = "block";
		return true;*/
	}
}

function checkRealname() {
	var realname = formt.realname;
	var realnameInfo = document.getElementById("realnameInfo");
	if (realname.value == "") {
		realnameInfo.innerHTML = "请输入姓名！";
		realnameInfo.display = "block";
		realname.focus();
		return false;
	} else {
		realnameInfo.innerHTML = "";
		realnameInfo.display = "none";
		return true;
	}
}
function checkPassword() {
	var password = formt.password;
	var passwordInfo = document.getElementById("passwordInfo");
	if (password.value == "") {
		passwordInfo.innerHTML = "请输入密码！";
		passwordInfo.display = "block";
		password.focus();
		return false;
	} else {
		passwordInfo.innerHTML = "";
		passwordInfo.display = "none";
		return true;
	}
}
function checkPassword1() {
	var password1 = formt.password1;
	var password1Info = document.getElementById("password1Info");
	if (password1.value == "") {
		password1Info.innerHTML = "请确认密码！";
		password1Info.display = "block";
		password1.focus();
		return false;
	} else if (password1.value != password.value) {//检验两次密码是否一样
		password1Info.innerHTML = "两次密码不一样！";
		password1Info.display = "block";
		password1.focus();
		return false;
	} else {
		password1Info.innerHTML = "";
		password1Info.display = "none";
		return true;
	}
}
function checkTelnumber() {
	var telnumber = formt.telnumber;
	var telnumberInfo = document.getElementById("telnumberInfo");
	if (telnumber.value == "") {
		telnumberInfo.innerHTML = "请输入手机号！";
		telnumberInfo.display = "block";
		telnumber.focus();
		return false;
	} else if ((telnumber.value.length != 11)) {/* //检验手机号位数是否正确 */
		telnumberInfo.innerHTML = "请输入11位数字即有效手机号！";
		telnumberInfo.display = "block";
		telnumber.focus();
		return false;
	} else {
		telnumberInfo.innerHTML = "";
		telnumberInfo.display = "none";
		return true;
	}
}
function checkEmialaddress() {
	var emialaddress = formt.emialaddress;
	var emialaddressInfo = document.getElementById("emialaddressInfo");
	if (emialaddress.value == "") {
		emialaddressInfo.innerHTML = "请输入邮箱地址！";
		emialaddressInfo.display = "block";
		emialaddress.focus();
		return false;
	} else if (!(emialaddress.value.indexOf("@") > 0)) {/* 验证邮箱地址是否正确*/
		emialaddressInfo.innerHTML = "邮箱地址缺少@符号！";
		emialaddressInfo.display = "block";
		emialaddress.focus();
		return false;
	} else {
		emialaddressInfo.innerHTML = "";
		emialaddressInfo.display = "none";
		return true;
	}
}
function checkPartment() {
	var partment = formt.partment;
	var partmentInfo = document.getElementById("partmentInfo");
	if (partment.value == "") {
		partmentInfo.innerHTML = "请输入所在部门！";
		partmentInfo.display = "block";
		partment.focus();
		return false;
	} else {
		partmentInfo.innerHTML = "";
		partmentInfo.display = "none";
		return true;
	}
}
function checkImagecode() {
	var imageCode = formt.imageCode;
	var imageCodeInfo = document.getElementById("imageCodeInfo");
	if (imageCode.value == "") {
		imageCodeInfo.innerHTML = "请输入验证码！";
		imageCodeInfo.display = "block";
		imageCode.focus();
		return false;
	} else if (imageCode.value != "uwv6") {
		imageCodeInfo.innerHTML = "验证码错误！";
		imageCodeInfo.display = "block";
		imageCode.focus();
		return false;
	} else {
		imageCodeInfo.innerHTML = "";
		imageCodeInfo.display = "none";
		return true;
	}
}
function check2() {
	if (!checkUsername()) {
		return false;
	} else if (!checkRealname()) {
		return false;
	} else if (!checkPassword()) {
		return false;
	} else if (!checkPassword1()) {
		return false;
	} else if (!checkTelnumber()) {
		return false;
	} else if (!checkEmialaddress()) {
		return false;
	} else if (!checkPartment()) {
		return false;
	} else if (!checkImagecode()) {
		return false;
	} else {
		alert("注册成功！");
		return true;
	}
}