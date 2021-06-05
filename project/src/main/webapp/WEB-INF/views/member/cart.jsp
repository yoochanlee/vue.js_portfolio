<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
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
/* 장바구니 폰트 */
.font{
	font-size: 30px;
	text-align: center;
	font-weight: bold;
	color: purple;
	display: blcok;
	margin-top: 40px;
}
.tb{
	text-align: center;
}
table {
	width: 100%;
	border-collapse: collapse;
	border-spacing: 0;
	table-layout: fixed;
	word-wrap: break-word;
	word-break: keep-all;
}
.tr{
	padding:10px;
	border-bottom: 1px solid #DBDBDB;
	height: 41px;
}
button {
	background: lime;
	margin: 0px auto;
	width: 200px;
	height: 40px;
	box-sizing: border-box;
	font-weight: bold;
}
</style>
</head>
<body>
	<div>
		<div class=font>장바구니</div>
		<div style="margin-top:100px; border-top:1px solid #BDBDBD; border-bottom: 1px solid #BDBDBD;">
			<table summary="번호, 사진, 제품명, 수량, 가격, 배송비, 취소">
				<colgroup>
					<col width="50">
					<col width="75">
					<col width="90">
					<col width="*">
					<col width="115">
					<col width="95">
					<col width="95">
				<thead>
					<tr class=tr>
						<th>
							<input type="checkbox" name="all_check">
						</th>
						<th scope="col">
							<div class=td>번호</div>
						</th>
						<th scope="col">
							<div class=td>사진</div>
						</th>
						<th scope="col">
							<div class=td>제품명</div>
						</th>
						<th scope="col">
							<div class=td>수량</div>
						</th>
						<th scope="col">
							<div class=td>가격</div>
						</th>
						<th scope="col">
							<div class=td>배송비</div>
						</th>
						<th scope="col">
							<div class=td>취소</div>
						</th>
					</tr>
				</thead>
				<tfoot>
					<tr>
						<td colspan="9">
							<div style="text-align: center; padding: 10px;">장바구니에 담긴 상품이 없습니다.</div>
						</td>
					</tr>
				</tfoot>
			</table>
		</div>
		<div style="text-align: center; margin-top: 30px;">
			<a>
				<button>전체상품주문</button>
			</a>
			<a>
				<button>선택상품주문</button>
			</a>
			<a>
				<button>계속 쇼핑하기</button>
			</a>
			<a>
				<button>장바구니 비우기</button>
			</a>
		</div>
	</div>
</body>
</html>