<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
/* body 태그 컬러*/
body{
	background: #F5FBEF
}
/* 상단 로그 이미지 */
#img_top{
	display:block;
	margin: 0px auto;
	width: 1000px;
	height: 100px;
	box-sizing: border-box;
	opacity: 0.3;
}
/* 상단 이미지 */
#img_main{
	display:block; 
	margin: 0px auto;
	width:1830px;
	height:400px;
	box-sizing: border-box;
}
/* 상품 분류 태크 폰트 */
.li_font{
	color: #999999;
	font-size: 20pt;
	text-decoration-line: none;
	margin-right: 40px;
}
/* 상단 sns 이미지 */
.top_sns{
	display: inline-block;
	margin: 0px 5px;
	width: 20px;
	height: 20px;
	box-sizing: border-box;
}
/* 맨위 */
.top{
	display:block;
	float:right;
	font-size:10pt;
	color: #999999;
	margin-right: 18px;
}
/* 중간 이미지 */
.img_mid{
	display:inline-bolck;
	margin: 10px auto;
	width: 100%;
	height: 630px;
	box-sizing: border-box;
	text-align: center;
}
/* 중간 이미지 세로 분할 */
.img_cut{
	display: inline-bolck;
	float:left;
	width: 22%;
	height: 100%;
	box-sizing: border-box;
	margin: 0px 26px;
}
/* 중간 이미지 가로 분할 */
.img_cut2{
	display: bolck;
	width: 100%;
	height: 15%;
	box-sizing: border-box;
}
/* 중간 이미지 */
.img_s{
	display: bolck;
	width: 100%;
	height: 84%;
	box-sizing: border-bod;
}

</style>
</head>

<body>
<header>
    	<%@ include file="../header/header.jsp" %>
    </header>
	<div>
		
		<div>
			<img id=img_main src="https://static1.s123-cdn-static-a.com/uploads/1211103/2000_5b191563a1016.jpg">
		</div>
		<div>
			<div>
				<p style="text-align: center">베스트 상품</p>
			</div>
		</div>
		<div class=img_mid>
			<div class=img_cut>
				<a href="http://naver.com">
					<img class=img_s src="http://www.vekni.org/files/attach/images/39227/840/042/986027f50f02ddbf51417d799b3ff60a.png">
				</a>
				<div class=img_cut2>
					<div>남자 바지</div>
					<div>4color</div>
					<div>25,300</div>
				</div>
			</div>
			<div class=img_cut>
				<a href="http://naver.com">
					<img class=img_s src="http://www.vekni.org/files/attach/images/39227/840/042/986027f50f02ddbf51417d799b3ff60a.png">
				</a>
				<div class=img_cut2>
					<div>남자 바지</div>
					<div>4color</div>
					<div>25,300</div>
				</div>
			</div>
			<div class=img_cut>
				<a href="http://naver.com">
					<img class=img_s src="http://www.vekni.org/files/attach/images/39227/840/042/986027f50f02ddbf51417d799b3ff60a.png">
				</a>
				<div class=img_cut2>
					<div>남자 바지</div>
					<div>4color</div>
					<div>25,300</div>
				</div>
			</div>
			<div class=img_cut>
				<a href="http://naver.com">
					<img class=img_s src="http://www.vekni.org/files/attach/images/39227/840/042/986027f50f02ddbf51417d799b3ff60a.png">
				</a>
				<div class=img_cut2>
					<div>남자 바지</div>
					<div>4color</div>
					<div>25,300</div>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>