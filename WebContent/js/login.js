/**
 * 
 */
function checkUsername() {
	var username = formm.username;/* 输入框的内容 */
	var usernameInfo = document.getElementById("usernameInfo");/* 输入框同行的内容*/
	if (username.value == "") {
		usernameInfo.innerHTML = "请输入用户名！";/* 获得该对象内嵌内容 */
		usernameInfo.display = "block";/* diaplay控制元素显示方式。显示为块级元素，带有换行符 */
		username.focus();
		return false;
	} else {
		usernameInfo.innerHTML = "";
		usernameInfo.display = "none";
		return true;
	}
}
function checkPassword() {
	var password = formm.password;
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
function checkImagecode() {
	var imageCode = formm.imageCode;
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
function check() {
	if (!checkUsername()) {
		return false;
	} else if (!checkPassword()) {
		return false;
	} else if (!checkImagecode()) {
		return false;
	} else {
		alert("登陆成功！");
		return true;
	}
}