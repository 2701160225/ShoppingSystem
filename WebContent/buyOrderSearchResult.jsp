<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body background="timg.jpg"></body>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>采购单查询</title>

<style>

.header-tit {
	display: inline;
}

.header-log {
	margin-right:43%;
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
	<h1>采购单查询</h1>
</div>
<div align="center">
	<hr >
	<form action="buyOrderSearchServlet" method="post">
		查询条件：<input type="text" name="no" value="${no}">
		<input type="submit" value="开始查询">
	</form>
	<br>
	<table border="1" width="900" cellpadding="8" cellspacing="0" >
		<tr align="center">
			<td>采购单序号</td> <td>采购单编号</td> <td>供应商编号</td> <td>采购日期</td> 
			<td>修改</td> <td>删除</td>
		</tr>
		<c:forEach var="buyOrder" items="${buyOrderList }">
			<tr align="center">
				<td>${buyOrder.id }</td>
				<td>${buyOrder.no }</td>
				<td>${buyOrder.prv_id }</td>
				<td>${buyOrder.dt }</td>
				<td><a href="buyOrderModifyServlet?id=${buyOrder.id }">修改</a></td>
				<td><a href="buyOrderDeleteServlet?id=${buyOrder.id }">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<hr >
	<p><a href="buyOrderManage.jsp">返回采购单管理子系统</a></p>
</div>
</body>
</html>