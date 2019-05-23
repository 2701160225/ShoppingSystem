<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body background="timg.jpg"></body>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>采购单管理</title>
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
  <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>


<style>
.carousel-inner img {
    width: 100%;
    height: 100%;
}
 
#demo {
 	margin-left: 25%;
 	margin-right: 25%;
 	margin-top:30px;
 }
 
.header-tit {
	display: inline;
}

.header-log {
	margin-top:10px;
	margin-right:42.5%;
	float: right;
	display: inline;
	font-family: sans-serif;
}

a{
	text-decoration: none;
}


ol {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;//导航栏颜色
}

li {
    float: right;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111;//鼠标移动改变的颜色
}
</style>
</head>
<body>
<div class="header-tit">
	<img src="tit.png" width="15%">
</div>

<div class="header-log">
	<h1>采购单管理</h1>
</div>
<div >
	<ol>
	  <li><a class="active" href="buyManageSystem.jsp">返回上一级</a></li>
	  <li><a href="buyOrderSearchResult.jsp">采购单查询</a></li>
	  <li><a href="buyOrderNew.jsp">采购单新增</a></li>
	 
	</ol>
</div>

<div><br></div>
<div id="demo" class="carousel slide" data-ride="carousel">
 
  <!-- 指示符 -->
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
    <li data-target="#demo" data-slide-to="3"></li>
    <li data-target="#demo" data-slide-to="4"></li>
    <li data-target="#demo" data-slide-to="5"></li>
  </ul>
  
  <!-- 轮播图片 -->
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="c1.png">
    </div>
    <div class="carousel-item">
      <img src="c2.png">
    </div>
    <div class="carousel-item">
      <img src="c3.png">
    </div>
    <div class="carousel-item">
      <img src="c4.png">
    </div>
    <div class="carousel-item">
      <img src="c5.png">
    </div>
    <div class="carousel-item">
      <img src="c6.png">
    </div>
  </div>
 
  <!-- 左右切换按钮 -->
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
 
</div>

</body>
</html>