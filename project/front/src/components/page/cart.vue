<template>
	<div class=body>
		<div class=font>장바구니</div>
		<div>
			<table>
				<thead>
					<tr class=tr>
						<th class=th1>
							<input type="checkbox" name="all_check">
						</th>
						<th scope="col">
							<div class=th>번호</div>
						</th>
						<th scope="col">
							<div class=th>사진</div>
						</th>
						<th scope="col">
							<div class=th>제품명</div>
						</th>
						<th scope="col">
							<div class=th>수량</div>
						</th>
						<th scope="col">
							<div class=th>가격</div>
						</th>
						<th scope="col">
							<div class=th>배송비</div>
						</th>
						<th scope="col">
							<div class=th>취소</div>
						</th>
					</tr>
				</thead>
				<tfoot>
					<tr v-for="c in c" v-bind:key="c.c_idx">
						<td class="th1">
						<input type="checkbox" name="all_check" />
						</td>
						<td>
							{{c.c_idx}}
						</td>
						<td>
							<img :src="c.path">
						</td>
						<td>
							{{c.p_name}}
						</td>
						<td>
							{{c.c_amount}}
						</td>
						<td>
							{{c.c_pay}}
						</td>
						<td>
							dd
						</td>
						<td>
							<button class=b>취소</button>
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
</template>

<script>
export default {
	name: 'Cart',
	data(){
		return {
		c:null,
		list:[]
		};
	},
	created: function() {
	const self = this;
	self.m_idx = sessionStorage.getItem("m_idx");
	self.$axios.get("/carts/" + self.m_idx)
	.then(function(res) {
      if (res.data.result) {
		self.c = res.data.c;
		var i = 0;
        for (i = 0; i < self.c.length; i++) {
          var imgarr = self.c[i].p_img.split("/");
          self.c[i].path = "http://localhost:8888/products/img/" + imgarr[0];
        }
      } else {
        alert("fail");
      }
    });
	}
};
</script>

<style scoped>
/* 장바구니 폰트 */
.font{
	font-size: 30px;
	text-align: center;
	font-weight: bold;
	color: purple;
	display: blcok;
	margin-top: 40px;
	margin-bottom: 90px;
}
.b{
	width: 100%;
	height: 100px;
}
tfoot{
	text-align: center;
	font-size: 20px;
	font-weight: 400;
	color: #000;
}
td{
	padding: 5px;
	border-bottom: 2px solid #dbdbdb;
}
.th{
	width: 200px;
	height: 40px;
}
.th1{
	width: 50px;
	height: 40px;
}
input{
	width: 20px;
	height: 20px;
}
table {
	width: 100%;
	height: 100%;
	border-collapse: collapse;
	border-spacing: 0;
	table-layout: fixed;
	word-wrap: break-word;
	word-break: keep-all;
	margin: auto;
}
.tr{
	padding:10px;
	border-top: 3px solid #000;
	border-bottom: 3px solid #000;
	height: 41px;
	text-align: center;
}
button {
	background: black;
	margin: 0px auto;
	width: 200px;
	height: 40px;
	box-sizing: border-box;
	font-weight: bold;
	font-size: 20px;
	color:#ffffff;
}
.body{
	display: block;
	width: 1400px;
	height: 100%;
	margin: auto;
}
img{
	width: 100%;
	height: 100px;
}
</style>