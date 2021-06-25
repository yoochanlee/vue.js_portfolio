<template>
  <div>
    <div class="top_box">
      <img
        class="img_top"
        :src="imgarr2[0]"
      />
      <div class="top_box_cut">
        <div class="top_aa">
          <h2>
            {{p.p_name1}}
          </h2>
          <span style="margin-right:4px; color: #d3a164; font-size:25px;">33%</span>
          <strong style="margin-right:6px; color: #000; font-size:25px;">{{p.p_price}}</strong>
          <del>79,000원</del>
          <div style="margin-bottom: 15px">
            <strong class="top_font">쿠폰적용가 42,320</strong>
            <p class="top_font1">쿠폰 다운로드 후 결제 시 적용 가능합니다.</p>
          </div>
          <a>
            <button class="dwon_box">쿠폰 다운로드</button>
          </a>
        </div>
        <div class="top_ab">
          <div>
            <div class="box1">적립금</div>
            <div class="box2">529원(1% 적립)</div>
          </div>
          <div>
            <div class="box1">배송비</div>
            <div class="box2" v-if="p.p_deliver==0">무료배송!!</div>
            <div class="box2" v-if="!p.p_deliver==0">{{p.p_deliver}}</div>
          </div>
          <div>
            <div class="box1">정품인증</div>
            <div class="box2">모든 상품은 100%정품입니다.</div>
          </div>
          <div>
            <div class="box1">수량</div>
            <input class=box002 type="number" v-model="c_amount" placeholder="수량을 적어주세요.">
          </div>
        </div>
        <div>
          <select class="option_box">
            <option value selected>[ 사이즈 ] 옵션을 선택해주세요.</option>
            <option value="28">28(S)</option>
            <option value="30">30(M)</option>
            <option value="32">32(L)</option>
            <option value="34">34(XL)</option>
            <option value="36" disabled>36(2XL)</option>
            <option value="38">38(3XL)</option>
          </select>
        </div>
        <div style="margin-top: 20px;">
          <div class="rmador">총 상품 금액</div>
          <div class="rmador1">0원</div>
        </div>
        <div style="text-aling:center;">
          <button class="shop_box" v-on:click="join">장바구니</button>
          <button class="shop_box">바로구매</button>
        </div>
      </div>
    </div>
    <div class="box01">
      <div class="box02">상품정보</div>
      <router-link to="/review">
        <div class="box02">리뷰 96</div>
      </router-link>
      <router-link to="/qa">
        <div class="box02">Q&A</div>
      </router-link>
      <router-link to="/oi">
        <div class="box02">주문정보</div>
      </router-link>
    </div>
    <div class="bt">
      <img class="bt_img_p" :src="imgarr2[1]" />
      <img
        class="bt_img2"
        :src="imgarr2[2]"
      />
      <img
        class="bt_img"
        :src="imgarr2[3]"
      />
      <img
        class="bt_img4"
        :src="imgarr2[4]"
      />
      <img
        class="bt_img5"
        :src="imgarr2[5]"
      />
    </div>
  </div>
</template>

<script>
export default {
  name: "List_ViewPage2",
  data() {
    return {
      c_amount:1,
      imgarr2: [],
      p: null,
      c: null
    };
  },
  created: function() {
    const self = this;
    self.$axios
      .get("/products/detail/" + self.$route.params.p_idx)
      .then(function(res) {
        if (res.data.result && res.data.p != null) {
          self.p = res.data.p;
          var i = 0;
          var imgarr = self.p.p_img.split("/");
          for (i = 0; i < imgarr.length; i++) {
            self.imgarr2[i] = "http://localhost:8888/products/img/" + imgarr[i];
          }
        } else {
          alert("fail");
        }
      });
  },
  methods: {
    join: function() {
      this.m_idx = sessionStorage.getItem("m_idx");
      const form = new URLSearchParams(); // eslint-disable-line no-unused-vars
      var c_pay = this.c_amount * this.p.p_price;
      form.append("m_idx", this.m_idx);
      form.append("p_idx", this.$route.params.p_idx);
      form.append("c_amount", this.c_amount);
      form.append("c_deliver", this.p.p_deliver);
      form.append("c_pay", c_pay);
      this.$axios.post("/carts", form).then(res => {
        if (res.data.result) {
          this.$router.replace("/");
        } else {
          alert("fail");
        }
      });
    }
  }
};
</script>
<style scoped>
/* 상단 박스 */
.top_box {
  width: 1200px;
  height: 1010px;
  box-sizing: border-box;
  padding: 80px 20px 120px;
  margin: auto;
}
.top_box_cut {
  display: inline-block;
  float: right;
  width: 55%;
  height: 100%;
}
/* 상단 이미지 */
.img_top {
  width: 40%;
  height: 70%;
}
.top_aa {
  display: block;
  width: 100%;
  height: 30%;
  box-sizing: border-box;
  padding: 30px;
}
.top_ab {
  display: block;
  width: 100%;
  height: 35%;
  box-sizing: border-box;
  padding: 30px;
}
.top_font {
  font-weight: 700;
  font-size: 18px;
  color: #d3a164;
  line-height: 16px;
}
.top_font1 {
  margin: 4px 0 0 0;
  font-size: 15px;
  line-height: 13px;
  color: #aaacb2;
}
.dwon_box {
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
.box1 {
  display: inline-block;
  width: 20%;
  height: 25%;
  padding: 16px;
  box-sizing: border-box;
  font-size: 16px;
  color: #aaacb2;
}
.box2 {
  display: inline-block;
  width: 80%;
  height: 25%;
  padding: 16px;
  box-sizing: border-box;
  font-size: 16px;
  color: black;
}
.box002 {
  display: inline-block;
  width: 80%;
  height: 25%;
  padding: 16px;
  box-sizing: border-box;
  font-size: 16px;
  color: black;
  border:#ffffff;
}
.option_box {
  display: block;
  width: 603px;
  height: 56px;
  padding: 16px 24px;
  box-sizing: border-box;
  background: azure;
  color: black;
  font-size: 16px;
}
.rmador {
  display: inline-block;
  width: 167px;
  height: 36px;
  box-sizing: border-box;
  font-size: 18px;
  font-weight: bold;
}
.rmador1 {
  display: inline-block;
  width: 436px;
  height: 36px;
  font-size: 30px;
  color: #d3a164;
  text-align: right;
  font-weight: 700;
}
.shop_box {
  display: inline-block;
  width: 300px;
  height: 70px;
  padding: 20px 15px;
  box-sizing: border-box;
  background: black;
  font-size: 19px;
  color: #ffffff;
  font-weight: 400;
  text-align: center;
}
.box01 {
  display: block;
  width: 1160px;
  height: 65px;
  margin: auto;
}
.box02 {
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
.bt {
  display: block;
  width: 1200px;
  height: 100%;
  padding: 50px 20px 0px;
  margin: auto;
}
.bt_img_p {
  display: block;
  width: 1000px;
  height: 6165px;
  margin: auto;
  box-sizing: border-box;
}
.bt_img {
  display: block;
  width: 1000px;
  height: 1350px;
  margin: auto;
}
.bt_img4 {
  display: block;
  width: 1000px;
  height: 800px;
  margin: auto;
}
.bt_img5 {
  display: block;
  width: 1000px;
  height: 3000px;
  margin: auto;
}
.bt_img2 {
  display: block;
  width: 1000px;
  height: 10550px;
  margin: auto;
}
</style>