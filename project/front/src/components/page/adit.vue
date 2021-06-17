<template>
  <div>
    <h2 style="border-bottom:2px solid #000; text-align:center;">상품 수정</h2>
    <div class="body">
      <table>
        <tr>
          <th>이미지</th>
          <th>상품이름</th>
          <th>상품가격</th>
          <th>상품수량</th>
          <th>카테고리</th>
          <th>수정</th>
        </tr>
		<tbody>
        <tr v-for="p in list" v-bind:key="p.p_idx">
          <td>
            <img :src="p.path" />
          </td>
          <td>
           {{p.p_name}}
          </td>
          <td>
            {{p.p_price}}
          </td>
          <td>
            {{p.p_amount}}
          </td>
          <td>
            {{p.p_category}}
          </td>
          <td>
            <router-link to="/productedit">
              <button class="btn btn primary">수정</button>
            </router-link>
          </td>
        </tr>
		</tbody>
      </table>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
		list:[]
	};
  },
   created: function() {
    const self = this;
    self.$axios.get('/products')
      .then(function(res) {
        if (res.data.result) {
          self.list = res.data.list;
          var i=0;
          for(i=0;i<self.list.length;i++){
            var imgarr = self.list[i].p_img.split('/');
            self.list[i].path = 'http://localhost:8888/products/img/' + imgarr[0];
          }
        } else {
          alert('fail');
        }
      });

  }
};
</script>

<style scoped>
button {
  width: 100%;
  height: 100px;
  background: #000;
  color: #ffffff;
  font-size: 30px;
  font-weight: bold;
}
img {
  width: 100%;
  height: 100px;
}
table {
  margin: 0px;
  width: 100%;
  text-align: center;
}
th {
  width: 16%;
  height: 20px;
  box-sizing: border-box;
  border: 1px solid #000;
  font-size: 20px;
  font-weight: bold;
}
td {
  width: 16%;
  border: 1px solid #000;
  text-align: center;
  font-size: 20px;
  font-weight: bold;
}
.body {
  display: block;
  width: 1400px;
  height: 100%;
  box-sizing: border-box;
  margin: auto;
}
</style>