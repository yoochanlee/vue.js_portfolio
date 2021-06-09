<template>
		<div>
		<div class=top_box>
			<img class=img_top src="https://kr.louisvuitton.com/images/is/image/lv/1/PP_VP_L/%EB%A3%A8%EC%9D%B4-%EB%B9%84%ED%86%B5-%EB%8D%94%EB%B8%94-%EB%B8%8C%EB%A0%88%EC%8A%A4%ED%8B%B0%EB%93%9C-%ED%85%8C%EC%9D%BC%EB%9F%AC%EB%93%9C-%EC%BD%94%ED%8A%B8-%EC%9D%98%EB%A5%98--HHC40EJPX900_PM2_Front%20view.png?wid=656&hei=656">
			<div class=top_box_cut>
				<div class=top_aa>
					<h2>[단독특가]올시즌 스탠다드 핏 슬랙스<br/>
						(시그니쳐 합섬)- 블랙[레가시]
					</h2>
					<span style="margin-right:4px; color: #d3a164; font-size:25px;">33%</span>
					<strong style="margin-right:6px; color: #000; font-size:25px;">52,900</strong>
					<del>79,000원</del>
					<div style="margin-bottom: 15px">
						<strong class=top_font>쿠폰적용가 42,320</strong>
						<p class=top_font1>쿠폰 다운로드 후 결제 시 적용 가능합니다.</p>
					</div>
					<a>
						<button class=dwon_box>쿠폰 다운로드</button>
					</a>
				</div>
				<div class=top_ab>
					<div>
						<div class=box1>적립금</div>
						<div class=box2>529원(1% 적립)</div>
					</div>
					<div>
						<div class=box1>배송비</div>
						<div class=box2>전상품 무료배송!!</div>
					</div>
					<div>
						<div class=box1>리뷰정보</div>
						<div class=box2>XX개 리뷰보기</div>
					</div>
					<div>
						<div class=box1>정품인증</div>
						<div class=box2>모든 상품은 100%정품입니다.</div>
					</div>
				</div>
				<div>
					<select class=option_box>
						<option value="" selected>[ 사이즈 ] 옵션을 선택해주세요.</option>
						<option value="28">28(S)</option>
						<option value="30">30(M)</option>
						<option value="32">32(L)</option>
						<option value="34">34(XL)</option>
						<option value="36" disabled>36(2XL)</option>
						<option value="38">38(3XL)</option>
					</select>
				</div>
				<div style="margin-top: 20px;">
					<div class=rmador>총 상품 금액</div>
					<div class=rmador1>0원</div>
				</div>
				<div style="text-aling:center;">
					<button class=shop_box>장바구니</button>
					<button class=shop_box>바로구매</button>
				</div>
			</div>
		</div>
		<div class=box01>
			<router-link to="/list_view"><div class=box02>상품정보</div></router-link>
			<router-link to="/review"><div class=box02>리뷰 96</div></router-link>
			<router-link to="/qa"><div class=box02>Q&A</div></router-link>
			<router-link to="/oi"><div class=box02>주문정보</div></router-link>
		</div>
		<div class=re_box>
			<div style="padding-bottom:15px; border-bottom:1px solid black;"> Q&A 3</div>
			<button style="display:inline-block;">d</button>
		</div>
	</div>
</template>

<script>
export default {
	name: 'Qa',
	props: {
    msg: String
  }
}
</script>

<style scoped>
/* 리뷰 박스 */
.re_box{
	display: inline-block;
	width: 1200px;
	height: 41px;
	box-sizing: border-box;
	padding: 50px 20px 0px;
	margin: auto;
}
/* 상단 박스 */
.top_box{
	width: 1200px;
	height: 1010px;
	box-sizing: border-box;
	padding: 80px 20px 120px;
	margin: auto;
}
.top_box_cut{
	display: inline-block;
	float:right;
	width: 55%;
	height: 100%;
}
/* 상단 이미지 */
.img_top{
	width: 40%;
	height: 70%;
}
.top_aa{
	display: block;
	width: 100%;
	height: 30%;
	box-sizing: border-box;
	padding: 30px;
}
.top_ab{
	display: block;
	width: 100%;
	height: 35%;
	box-sizing: border-box;
	padding: 30px;
}
.top_font{
	font-weight: 700;
	font-size: 18px;
	color: #d3a164;
	line-height: 16px;
}
.top_font1{
	margin:4px 0 0 0;
	font-size: 15px;
	line-height: 13px;
	color: #aaacb2;
}
.dwon_box{
	display: block;
	width: 500px;
	height: 50px;
	box-sizing: border-box;
	margin: auto;
	background: #000;
	font-weight: bold;
	font-size: 20px;
	color: white;
}
.box1{
	display: inline-block;
	width: 20%;
	height: 25%;
	padding: 16px;
	box-sizing: border-box;
	font-size:16px;
	color: #aaacb2;
}
.box2{
	display:inline-block;
	width: 80%;
	height: 25%;
	padding: 16px;
	box-sizing: border-box;
	font-size: 16px;
	color: black;
}
.option_box{
	display: block;
	width: 603px;
	height: 56px;
	padding: 16px 24px;
	box-sizing: border-box;
	background: azure;
	color: black;
	font-size: 16px;
}
.rmador{
	display: inline-block;
	width: 167px;
	height: 36px;
	box-sizing: border-box;
	font-size: 18px;
	font-weight: bold;
}
.rmador1{
	display: inline-block;
	width: 436px;
	height: 36px;
	font-size: 30px;
	color: #d3a164;
	text-align: right;
	font-weight: 700;
}
.shop_box{
	display: inline-block;
	width: 300px;
	height: 70px;
	padding: 20px 15px;
	box-sizing: border-box;
	background: black;
	font-size: 19px;
	color: #FFFFFF;
	font-weight: 400;
	text-align: center;
}
.box01{
	display: block;
	width: 1160px;
	height:65px;
	margin: auto;
}
.box02{
	display: inline-block;
	width: 24%;
	height: 100%;
	padding: 20px;
	box-sizing: border-box;
	font-weight: 600;
	font-size: 17px;
	text-align: center;
	color: #000;
}
</style>