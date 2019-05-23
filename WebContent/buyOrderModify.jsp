<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>采购单修改</title>
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
<body background="timg.jpg">
<div class="header-tit">
	<img src="tit.png" width="15%">
</div>

<div class="header-log">
	<h1>采购单修改</h1>
</div>

<div align="center">
	<hr >
	<form action="buyOrderUpdateServlet" method="post">
		<p>采购单序号：<input type="text" name="id" readonly="readonly" value="${buyOrder.id }"></p>
		<p>采购单编号：<input type="text" name="no" value="${buyOrder.no }"></p>
		<p>供应商序号：<input type="text" name="prv_id" value="${buyOrder.prv_id }"></p>
		<p>采&nbsp;购&nbsp;日&nbsp;期：<input type="text" name="dt" value="${buyOrder.dt }"></p>
		<input type="submit" value="保存修改商品">
	</form>
	<hr >
	<p><a href="buyOrderManage.jsp">返回上级菜单</a></p>
</div>
</body>
</html>