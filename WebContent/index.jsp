<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body background="timg.jpg">
</body>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="shortcut icon" href="favicon.ico">
	<link rel="bookmark" href="favicon.ico">
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
	<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<title>森魄-商品采购 只有你想不到 没有我们做不到</title>

<style>
.button {
  display: inline-block;
  border-radius: 15px;
  background-color: #6666CC;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 28px;
  padding: 12px;
  width: 180px;
  transition: all 0.5s;
  cursor: pointer;
  margin-top: 7px;
  margin-left: 42%;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '»';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}

img {
	width: 15%;
}

a {
	text-decoration: none;
}

.header-tit {
	display: inline;
}

.header-log{
	margin-top:12px ;
	margin-right:525px;
	float:right;
	display: inline;
	font-size: 40px;
}

.carousel-inner img {
      width: 100%;
      height: 100%;
}

 #demo {
 	margin-left: 20%;
 	margin-right: 20%;
 	margin-top:15px;
 }

</style>
</head>
<body>
	<div class="header-tit">
		<img src="tit.png" >
	</div>
	
	<div class="header-log"> 
		<p>森魄商品采购</p>
	</div>
	<hr>
	<a href="login.jsp"><button class="button" style="vertical-align:middle"><span>登录入口 </span></button></a>
	<div id="demo" class="carousel slide" data-ride="carousel">
 
  <!-- 指示符-->
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
    <li data-target="#demo" data-slide-to="3"></li>
    <li data-target="#demo" data-slide-to="4"></li>
    <li data-target="#demo" data-slide-to="5"></li>
    <li data-target="#demo" data-slide-to="6"></li>
  </ul>
  
 
  <!-- 轮播图片 -->
  <div class="carousel-inner">
  
    <div class="carousel-item active">
      <img src="p1.jpg">
    </div>
    
    <div class="carousel-item">
      <img src="t1.jpg">
    </div>
    
    <div class="carousel-item">
      <img src="t2.jpg">
    </div>
    
    <div class="carousel-item">
      <img src="t3.jpg">
    </div>
    
    <div class="carousel-item">
      <img src="t4.jpg">
    </div>
    
    <div class="carousel-item">
      <img src="p11.jpg">
    </div>
    <div class="carousel-item">
      <img src="j1.jpg">
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
<div align="center">
	<hr>
	<p  style="font-family:">作者：汪滢  杨凤至</p>
</div>
</body>
</html>