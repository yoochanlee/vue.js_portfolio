<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
$(document).ready(function(){
	  $('.slider').slider();
	});
</script>
<style>
.slider .indicators .indicator-item {
  background-color: #666666;
  border: 3px solid #ffffff;
  -webkit-box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.16), 0 2px 10px 0 rgba(0, 0, 0, 0.12);
  -moz-box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.16), 0 2px 10px 0 rgba(0, 0, 0, 0.12);
  box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.16), 0 2px 10px 0 rgba(0, 0, 0, 0.12);
}
.slider .indicators .indicator-item.active {
  background-color: #ffffff;
}
.slider {
  width: 900px;
  margin: 0 auto;
}
.slider .indicators {
  bottom: 60px;
  z-index: 100;
  /* text-align: left; */
}
/* 상단 로그 이미지 */
#img_top {
	display: block;
	margin: 0px auto;
	width: 1000px;
	height: 100px;
	box-sizing: border-box;
	opacity: 0.3;
}
/* 상단 이미지 */
#img_main {
	display: block;
	margin: 0px auto;
	width: 1830px;
	height: 400px;
	box-sizing: border-box;
}
/* 상품 분류 태크 폰트 */
.li_font {
	color: #999999;
	font-size: 20pt;
	text-decoration-line: none;
	margin-right: 40px;
}
/* 상단 sns 이미지 */
.top_sns {
	display: inline-block;
	margin: 0px 5px;
	width: 20px;
	height: 20px;
	box-sizing: border-box;
}
/* 맨위 */
.top {
	display: block;
	float: right;
	font-size: 10pt;
	color: #999999;
	margin-right: 18px;
}
/* 중간 이미지 */
.img_right {
	display: inline-bolck;
	margin: 10px auto;
	width: 100%;
	height: 630px;
	box-sizing: border-box;
	text-align: center;
}
/* 중간 이미지 세로 분할 */
.img_cut {
	display: inline-bolck;
	float: left;
	width: 22%;
	height: 100%;
	box-sizing: border-box;
	margin: 0px 26px;
}
/* 중간 이미지 가로 분할 */
.img_cut2 {
	display: bolck;
	width: 100%;
	height: 15%;
	box-sizing: border-box;
}
/* 중간 이미지 */
.img_s {
	display: bolck;
	width: 100%;
	height: 84%;
	box-sizing: border-bod;
}
</style>
</head>
<body>
	<div>
		<header>
			<%@ include file="../header/header.jsp"%>
		</header>
		<div id="box_frame">
			<div class="slider">
				<ul class="slides">
					<li><img src="http://lorempixel.com/580/250/nature/1"> <!-- random image -->
						<div class="caption center-align">
							<h3>This is our big Tagline!</h3>
							<h5 class="light grey-text text-lighten-3">Here's our small
								slogan.</h5>
						</div></li>
					<li><img src="http://lorempixel.com/580/250/nature/2"> <!-- random image -->
						<div class="caption left-align">
							<h3>Left Aligned Caption</h3>
							<h5 class="light grey-text text-lighten-3">Here's our small
								slogan.</h5>
						</div></li>
					<li><img src="http://lorempixel.com/580/250/nature/3"> <!-- random image -->
						<div class="caption right-align">
							<h3>Right Aligned Caption</h3>
							<h5 class="light grey-text text-lighten-3">Here's our small
								slogan.</h5>
						</div></li>
					<li><img src="http://lorempixel.com/580/250/nature/4"> <!-- random image -->
						<div class="caption center-align">
							<h3>This is our big Tagline!</h3>
							<h5 class="light grey-text text-lighten-3">Here's our small
								slogan.</h5>
						</div></li>
				</ul>
			</div>
			<div class="img_left">
				<h2>CATEGORIES</h2>

			</div>
			<div class="img_right">
				<div class=img_cut>
					<a href="https://www.naver.com/"> <img class=img_s
						src="http://www.vekni.org/files/attach/images/39227/840/042/986027f50f02ddbf51417d799b3ff60a.png">
					</a>
					<div class=img_cut2>

						<div>남자 바지</div>
						<div>4color</div>
						<div>25,300</div>
					</div>
				</div>
				<div class=img_cut>
					<a href="https://www.naver.com/"> <img class=img_s
						src="http://www.vekni.org/files/attach/images/39227/840/042/986027f50f02ddbf51417d799b3ff60a.png">
					</a>
					<div class=img_cut2>

						<div>남자 바지</div>
						<div>4color</div>
						<div>25,300</div>
					</div>
				</div>
				<div class=img_cut>
					<a href="https://www.naver.com/"> <img class=img_s
						src="http://www.vekni.org/files/attach/images/39227/840/042/986027f50f02ddbf51417d799b3ff60a.png">
					</a>
					<div class=img_cut2>

						<div>남자 바지</div>
						<div>4color</div>
						<div>25,300</div>
					</div>
				</div>
				<div class=img_cut>
					<a href="https://www.naver.com/"> <img class=img_s
						src="http://www.vekni.org/files/attach/images/39227/840/042/986027f50f02ddbf51417d799b3ff60a.png">
					</a>
					<div class=img_cut2>

						<div>남자 바지</div>
						<div>4color</div>
						<div>25,300</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>