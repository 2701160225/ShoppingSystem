<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body background="timg.jpg"></body>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>供应商查询</title>
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
	<h1>供应商查询</h1>
</div>

<div align="center">
	<hr >
	<form action="providerSearchServlet" method="post">
		查询条件：<input type="text" name="name" value="${name}">
		<input type="submit" value="开始查询">
	</form>
	<br>
	<table border="1" width="900" cellpadding="8" cellspacing="0" >
		<tr align="center">
			<td>供应商序号</td> <td>供应商编号</td> <td>供应商名称</td> 
			<td>供应商电话</td> <td>供应商地址</td>
			<td>修改</td> <td>删除</td>
		</tr>
		<c:forEach var="provider" items="${providerList }">
			<tr align="center">
				<td>${provider.id }</td>
				<td>${provider.no }</td>
				<td>${provider.name }</td>
				<td>${provider.tel }</td>
				<td>${provider.addr }</td>
				<td><a href="providerModifyServlet?id=${provider.id }">修改</a></td>
				<td><a href="providerDeleteServlet?id=${provider.id }">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<hr >
	<p><a href="providerManage.jsp">返回供应商管理子系统</a></p>
</div>
</body>
</html>