<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body background="timg.jpg"></body>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>供应商新增</title>
<style>

.header-tit {
	display: inline;
}

.header-log {
	margin-top:10px;
	margin-right:43%;
	float: right;
	display: inline;
}
a{
	text-decoration: none;
}
h1{
	margin-top:5px;
}
</style>
</head>
<body>
<div class="header-tit">
	<img src="tit.png" width="15%">
</div>

<div class="header-log">
	<h1>供应商新增</h1>
</div>

<div align="center">
	
	<hr >
	<form action="providerNewServlet" method="post">
		<p>供应商编号：<input type="text" name="no"></p>
		<p>供应商名称：<input type="text" name="name"></p>
		<p>供应商电话：<input type="text" name="tel"></p>
		<p>供应商地址：<input type="text" name="addr"></p>
		<input type="submit" value="保存新供应商">
	</form>
	<hr >
	<p><a href="providerManage.jsp">返回上级菜单</a></p>
</div>
</body>
</html>