<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body background="timg.jpg"></body>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>采购单新增</title>
<style>

.header-tit {
	display: inline;
}

.header-log {
	margin-right:42.65%;
	float: right;
	display: inline;
}
a{
	text-decoration: none;
}
h1{
	margin-top:10px;
}
</style>
</head>
<body>

<div class="header-tit">
	<img src="tit.png" width="15%">
</div>

<div class="header-log">
	<h1>采购单新增</h1>
</div>

<div align="center">
	<hr >
	<form action="buyOrderNewServlet" method="post">
		<p>采购单编号：<input type="text" name="no"></p>
		<p>供应商序号：<input type="text" name="prv_id"></p>
		<p>&nbsp;&nbsp;&nbsp;&nbsp;采购日期：<input type="text" name="dt"></p>
		<input type="submit" value="保存">
		<input type="button" value="返回" onclick="javascrtpt:window.location.href='buyOrderManage.jsp'">
	</form>
	
	
</div>
</body>
</html>