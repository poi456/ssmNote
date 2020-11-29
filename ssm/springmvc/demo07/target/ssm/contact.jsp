<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<title>明日民宿管理</title>
	<meta name="keywords" content="明日民宿管理">
	<meta name="description" content="明日民宿管理">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	<link rel="shortcut icon" href="images/favicon.ico">

	<!-- include main css -->
	<link rel="stylesheet" type="text/css" href="css/slick.css"/>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
	<link rel="stylesheet" type="text/css" href="css/jquery.mmenu.all.css"/>
	<link rel="stylesheet" type="text/css" href="css/style.css"/>
	<link href="font-awesome-4.5.0/css/font-awesome.min.css" rel='stylesheet' type='text/css' media="all" />
	<link rel="stylesheet" type="text/css" href="css/animate.css"/>

	<!--[if lt IE 9]>
	<script src="http://apps.bdimg.com/libs/html5shiv/r29/html5.min.js"></script>
	<script src="http://apps.bdimg.com/libs/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->

</head>
<body>

<div>
	<!--header-->
	<header class="header_zi">
		<div class="container">
			<div class="logo">
				<a href="index.jsp"><img src="images/logo.jpg.png" alt="" /></a>
			</div>
			<a href="#mmenu" class="phone-nav"><i class="fa fa-list"></i></a>
			<div class="logo_right">
				<nav class="nav">
					<ul>
						<li><a href="index.jsp">首页</a></li>
						<li><a href="scenic_overview.html">景区概况</a></li>
						<li><a href="court_travel.html">文苑之旅</a>
							<ul>
								<li><a href="court_travel.html">茶艺中心</a></li>
								<li><a href="court_travel.html">万竹林海</a></li>
								<li><a href="court_travel.html">创意中心</a></li>
								<li><a href="court_travel.html">花草园艺</a></li>
							</ul>
						</li>
						<li><a href="comfortable.html">舒雅住宅</a></li>
						<li><a href="news.html">新闻动态</a>
							<ul>
								<li><a href="news.html">公司新闻</a></li>
								<li><a href="news.html">行业新闻</a></li>
							</ul>
						</li>
						<li><a href="feedback.html">留言中心</a></li>
						<li><a href="contact.jsp"  class="active">联系我们</a></li>
					</ul>
				</nav>
				<div class="search">
		  	 	<span class="sea_x">
		  	 		<input type="" name="" id="" placeholder="请输入关键词">
		  	 		<i class="fa fa-search"></i>
		  	 	</span>
					<span class="y_z">

		  	 	</span>
				</div>
			</div>

		</div>
	</header>

	<!--banner  start-->
	<section class="banner_zi">
		<div><img src="images/banner_contact.png" alt=""></div>
	</section>
	<!--banner end-->
	<div class="head_bar">
		<span>位置：</span><a href="index.jsp">首页 </a> > <span class="active">联系我们</span>
	</div>
	<div class="contact_con">
		<div class="top_tit">
			<span class="span1"><a href="contact.jsp">联系我们</a></span><br />
			<span class="con_span">您好，如您有明日的相关问题，可直接联系我们！</span>
		</div>
		<div class="nei clearfix">
			<div class="left">
				<a href="276558997qq.com"><img src="images/email.png" alt="" />276558997qq.com</a>
				<a href="tel:17674042979"><img src="images/phone.png" alt="" />17674042979</a>
				<a href="tel:17674042979"><img src="images/shouji.png" alt="" />17674042979</a>
				<span > <img src="images/weizhi.png" alt="" />衡山科学城B2
</span>
				<a href="http://map.baidu.com/?newmap" target="_blank" class="ditu"><i class="fa fa-search"></i>查看地图</a>
			</div>
			<div class="right"></div>
		</div>
	</div>


	<div class="home_news">
		<div class="news_con">
			<div class="top_tit">
				<span class="span1"><a href="news.html">新闻动态</a></span><br />
				<span class="span2">NEWS</span>
			</div>
			<ul>
				<li class="clearfix">
					<div class="news_left">
						<a href="news.html">暑假去哪玩？桃花苑天地避暑甚好！</a>
						<p>
							暑期近在眼前，还在犹豫带孩子去哪儿玩吗？炎热的夏天，一颗躁动的心，背上收拾好的背包，走遍大好河山
							，感受大千世界，还不如隐居室外桃源桃花苑天地精品。少一些城市的喧嚣，回归大自然的清新脱俗，来一场说走就走的夏日之旅吧。
						</p>
					</div>
					<div class="news_right">
						<span>07.21</span>
						<time>2016</time>
					</div>
				</li>
				<li class="clearfix">
					<div class="news_left">
						<a href="news.html">花落流水春又去</a>
						<p>
							春暖花开，桃花苑天地精品大咖云集，活动丰富。不仅有适合小朋友们的春游活动，有适合老年朋友的喝茶加棋牌，
							还有书法大咖们的加盟，乃至电视真人秀节目的拍摄。这可把桃花宝宝们忙坏了，不过没关系，累并快乐着，桃花宝宝非常欢迎大家的到来……
						</p>
					</div>
					<div class="news_right">
						<span>05.25</span>
						<time>2016</time>
					</div>
				</li>
				<li class="clearfix">
					<div class="news_left">
						<a href="news.html">蝴蝶摘花来</a>
						<p>
							清朝末年，先生在宁波开了一家面店，生意不错。一天，一位即将回国的美国华侨
							，登船前来到卜先生的店里吃面，离店时竟把一只皮箱落下了。
							先生打烊时才发现这只皮箱，但已无法找到失主，只好把皮箱小心收藏，等待着失主前来认领。
						</p>
					</div>
					<div class="news_right">
						<span>05.25</span>
						<time>2016</time>
					</div>
				</li>
				<li class="clearfix">
					<div class="news_left">
						<a href="news.html">这是我们想去的地方</a>
						<p>
							春暖花开，桃花苑天地精品大咖云集，活动丰富。不仅
							有适合小朋友们的春游活动，有适合老年朋友的喝茶加棋牌，
							还有书法大咖们的加盟，乃至电视真人秀节目的拍摄。
							这可把桃花宝宝们忙坏了，不过没关系，累并快乐着，桃花宝宝非常欢迎大家的到来……
						</p>
					</div>
					<div class="news_right">
						<span>05.25</span>
						<time>2016</time>
					</div>
				</li>
			</ul>
			<a href="news.html" class="more">MORE</a>
		</div>
	</div>



	<!--footer  start-->
	<footer class="footer">
		<div class="footer_con">
			<div class="con">
				<div class="nei">
					<div class="">
						<ul class="di_nav clearfix">
							<li><a href="scenic_overview.html">景区概况</a></li>
							<li><a href="court_travel.html">文苑之旅</a></li>
							<li><a href="comfortable.html">舒雅住宅</a></li>
							<li><a href="news.html">新闻动态</a></li>
							<li><a href="feedback.html">留言中心</a></li>
							<li><a href="contact.jsp">联系我们</a></li>
						</ul>
						<div class="links">友情链接
							<ul>
								<li><a href="">百度文化</a></li>
								<li><a href="">新浪微博</a></li>
								<li><a href="">百度知道</a></li>
							</ul>
						</div>
					</div>
					<div class="clear"></div>
					<div class="lian">
						电话：<a href="tel:07393922686">07393922686</a><br />
						邮箱：<a href="276558997@qq.com">276558997@qq.com</a><br />
						手机：<a href="tel:17674042979">17674042979</a><br />
						地址：衡山科学城B2<br />
						<a href="map.html">网站地图</a><br />
						<span> 
							<a href="#" target="_blank">
								<img src="images/yu.png" alt="" />
							</a>
							
							<span class="er_a">
								<img src="images/er.png" alt="" class="one_img"/> 
								明日公众号
								<img src="images/erwei.png" alt="" class="er_img"/>
							</span>
							
						</span>
					</div>

				</div>
			</div>

		</div>
		<div class="copy">Copyright© 2020  版权所有：湖南明日民宿管理 </div>
	</footer>
	<!--footer  end-->

	<!--移动端  Mmenu-->
	<nav id="mmenu">

		<ul>

			<li><a href="index.jsp" class="active">首页</a></li>
			<li><a href="scenic_overview.html">景区概况</a></li>
			<li><a href="court_travel.html">文苑之旅</a>
				<ul>
					<li><a href="court_travel.html">茶艺中心</a></li>
					<li><a href="court_travel.html">万竹林海</a></li>
					<li><a href="court_travel.html">创意中心</a></li>
					<li><a href="court_travel.html">花草园艺</a></li>
				</ul>
			</li>
			<li><a href="comfortable.html">舒雅住宅</a></li>
			<li><a href="news.html">新闻动态</a>
				<ul>
					<li><a href="news.html">公司新闻</a></li>
					<li><a href="news.html">行业新闻</a></li>
				</ul>
			</li>
			<li><a href="feedback.html">留言中心</a></li>
			<li><a href="contact.jsp">联系我们</a></li>

		</ul>
	</nav>	</div>

<!--Include Js-->
<script src="js/jquery.min.js" type="text/javascript" charset="utf-8"></script>

<!--移动端导航-->
<script src="js/jquery.mmenu.all.min.js" type="text/javascript" charset="utf-8"></script>

<script src="js/public.js" type="text/javascript" charset="utf-8"></script>

<!--slick-->
<script src="js/slick.min.js" type="text/javascript" charset="utf-8"></script>
<script src="js/wow.js" type="text/javascript" charset="utf-8"></script>

<!--placeholder-->
<script src="js/jquery.placeholder.min.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
	$(function(){ $('input, textarea').placeholder(); });
</script>

<!--<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>-->

</body>
</html>