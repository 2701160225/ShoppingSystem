<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body background="timg.jpg"></body>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商品查询</title>
<style>

.header-tit {
	display: inline;
}

.header-log {
	margin-top:10px;
	margin-right:44.5%;
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
	<h1>商品查询</h1>
</div>

<div align="center">
	
	<hr >
	<form action="goodsSearchServlet" method="post">
		查询条件：<input type="text" name="name" value="${name}">
		<input type="submit" value="开始查询">
	</form>
	<br>
	<table border="1" width="900" cellpadding="8" cellspacing="0" >
		<tr align="center">
			<td>商品序号</td> <td>商品编号</td> <td>商品名称</td> 
			<td>商品单价</td>
			<td>修改</td> <td>删除</td>
		</tr>
		<c:forEach var="goods" items="${goodsList }">
			<tr align="center">
				<td>${goods.id }</td>
				<td>${goods.no }</td>
				<td>${goods.name }</td>
				<td>${goods.price }</td>
				<td><a href="goodsModifyServlet?id=${goods.id }">修改</a></td>
				<td><a href="goodsDeleteServlet?id=${goods.id }">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<hr >
	<p><a href="goodsManage.jsp">返回商品管理子系统</a></p>
</div>
</body>
</html>