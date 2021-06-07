<template>
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
</template>

<script>
export default {
  name: 'Main',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
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
