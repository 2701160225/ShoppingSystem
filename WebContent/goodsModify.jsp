<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商品修改</title>

<style>
h1{
	margin-top:5px;
}
img{
	width:15%;
}
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
</style>

</head>
<body background="timg.jpg">
<div class="header-tit">
	<img src="tit.png" width="15%">
</div>
<div class="header-log">
	<h1>商品修改</h1>
</div>
<div align="center">
	
	<hr >
	<form action="goodsUpdateServlet" method="post">
		<p>商品序号：<input type="text" name="id" readonly="readonly" value="${goods.id }"></p>
		<p>商品编号：<input type="text" name="no" value="${goods.no }"></p>
		<p>商品名称：<input type="text" name="name" value="${goods.name }"></p>
		<p>商品单价：<input type="text" name="price" value="${goods.price }"></p>
		<input type="submit" value="保存修改商品">
	</form>
	<hr >
	<p><a href="goodsManage.jsp">返回上级菜单</a></p>
</div>
</body>
</html>