<template>
	<div>
		<h2 style="border-bottom:2px solid #000; text-align:center;">상품 수정</h2>
		<button v-on:click="del">삭제</button>
		<div class=body>
			<table>
				<tr>
					<th>이미지</th>
					<th>상품이름</th>
					<th>상품가격</th>
					<th>상품수량</th>
					<th>카테고리</th>
					<th>수정</th>
				</tr>
				<tr>
					<td>
						 <img  :v-model="p.file" src="">
					</td>
					<td>
						<input type="text" name="p_name" id="p_name" v-model="p.p_name">
					</td>
					<td>
						<input thpe="text" name="p_price" id="p_price" v-model="p.p_price">
					</td>
					<td>
						<input thpe="text" name="p_amount" id="p_amount" v-model="p.p_amount">
					</td>
					<td>
						<input thpe="text" name="p_category" id="p_category" v-model="p.p_category">
					</td>
					<td>
						<input thpe="text" name="p_info" id="p_info" v-model="p.p_info">
						<input type="hidden" name="m_idx" id="tel" class="box" v-model="p.m_idx"/>
					</td>
				</tr>
			</table>
		</div>
	</div>	
</template>

<script>
export default {
	data(){
		return{
		p:null,
		}
	},
	created:function() {	
    const self = this;
	self.m_idx = sessionStorage.getItem("m_idx");
	alert(this.m_idx);
    this.$axios.get('/products/' + self.m_idx)
      .then(function(res) {
        if (res.data.result) {
          self.p = res.data.p;
        }
      });
  }
};
</script>

<style scoped>
input{
	text-align: center;
	width: 100%;
	height: 100px;
	border: none;
	font-size: 20px;
	font-weight: bold;
}
button{
	width:100%;
	height: 100px;
	background:#000;
	color: #ffffff;
	font-size: 30px;
	font-weight: bold;
}
img{
	width: 100%;
	height:100px;
}
table{
	margin: 0px;
	width: 100%;
	text-align: center;
}
th{
	width: 16%;
	height: 20px;
	box-sizing: border-box;
	border: 1px solid #000;
	font-size: 20px;
	font-weight: bold;
}
td{
	width: 16%;
	border: 1px solid #000;
}
.body{
	display: block;
	width: 1400px;
	height: 100%;
	box-sizing: border-box;
	margin: auto;
}
</style>