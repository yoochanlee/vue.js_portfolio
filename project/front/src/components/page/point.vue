<template>
  <div>
    <p id="header">마이페이지</p>
    <div id="box">
      <router-link to="/mypageedit">
        <div class="a">
          <div>
            <b-icon icon="person-check" style="width: 80px; height: 80px;" variant="dark"></b-icon>
          </div>
          <span class="font">개인정보수정</span>
        </div>
      </router-link>
      <router-link to="/order">
        <div class="a">
          <img class="img" src="../../assets/img/car.png" />
          <span class="font">주문/배송조회</span>
        </div>
      </router-link>
      <router-link to="/point">
        <div class="a">
          <img class="img" src="../../assets/img/p.png" />
          <span class="font">포인트</span>
        </div>
      </router-link>
      <router-link to="coupon">
        <div class="a">
          <img class="img" src="../../assets/img/cp.png" />
          <span class="font">쿠폰</span>
        </div>
      </router-link>
      <router-link to="mypageqa">
        <div class="aa">
          <img class="img" src="../../assets/img/qa.png" />
          <span class="font">Q&A</span>
        </div>
      </router-link>
    </div>
    <div id="cp">
      <div id="cp_div">
        <ul style="padding:0px;">
          <li class="div">
            <strong id="cp_font">보유포인트</strong>
            <span class="fc">0원</span>
            <p class="p">당월 소멸 얘정 포인트 0원</p>
          </li>
          <li class="div1">
            <label id="cp_font">포인트 등록하기</label>
            <input type="text" name="box" id="cp_box" />
            <button id="cp_but">등록</button>
          </li>
        </ul>
      </div>
      <h3 style="font-weight: bold;">포인트 내역</h3>
      <div>
        <table>
          <colgroup>
            <col style="width:25%;" />
            <col style="width:33%;" />
            <col style="width:25%;" />
          </colgroup>
          <tr>
            <th scope="col">적용일자</th>
            <th scope="col">포인트 내역</th>
            <th scope="col">포인트</th>
          </tr>
        </table>
        <div class="tb">
          <p class="tb_font">포인트 적립/차감 내역이 존재하지 않습니다.</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Point",
  props: {
    msg: String
  }
};
</script>

<style scoped>
ul {
  list-style: none;
}
th {
  width: 400px;
  height: 100px;
  text-align: center;
  font-size: 20px;
  font-weight: bold;
  border-top: 1px solid #000;
  border-bottom: 1px solid #000;
}
.tb {
  width: 100%;
  height: 260;
  text-align: center;
  padding: 120px 0px;
  border-bottom: 1px solid #000;
}
.tb_font {
  font-size: 18px;
  font-weight: bold;
  color: #000;
}
.p {
  font-size: 16px;
  padding: 0px 0px 0px 20px;
  display: inline-block;
}
.fc {
  font-size: 30px;
  color: #d3a164;
  font-weight: 700;
  padding: 0px 0px 0px 32px;
}
.div {
  display: inline-block;
  width: 45%;
  height: 100%;
  color: #000;
}
.div1 {
  display: inline-block;
  width: 55%;
  height: 100%;
  color: #000;
}
#cp {
  display: block;
  width: 1200px;
  height: 100%;
  box-sizing: border-box;
  margin: auto;
  padding-top: 200px;
}
#cp_div {
  display: block;
  width: 100%;
  height: 96px;
  margin: 0px auto;
}
#cp_font {
  display: inline-block;
  font-size: 20px;
  font-weight: bold;
  color: f000;
  text-align: center;
}
#cp_font1 {
  display: inline-block;
  font-size: 20px;
  font-weight: bold;
  color: f000;
  text-align: center;
}
#cp_box {
  display: inline-block;
  width: 40%;
  height: 100%;
  padding: 13px 13px 13px 16px;
  border: 1px solid #000;
  box-sizing: border-box;
  margin-left: 10px;
}
#cp_but {
  display: inline-block;
  width: 20%;
  height: 49px;
  margin-left: 20px;
  background: #000;
  font-size: 16px;
  font-weight: bold;
  color: #ffffff;
}
#header {
  display: block;
  width: 100%;
  height: 60px;
  box-sizing: border-box;
  margin: 50px auto;
  font-size: 40px;
  font-weight: bold;
  text-align: center;
  border-bottom: 1px solid black;
}
#box {
  display: block;
  width: 1200px;
  height: 230px;
  padding: 60px 0px;
  box-sizing: border-box;
  margin: auto;
  border: 1px solid black;
}
.a {
  display: inline-block;
  width: 20%;
  height: 100%;
  box-sizing: border-box;
  text-align: center;
  margin: auto;
  border-right: 1px solid black;
}
.aa {
  display: inline-block;
  width: 20%;
  height: 100%;
  box-sizing: border-box;
  text-align: center;
  margin: auto;
}
.img {
  display: block;
  width: 100px!important;
  height: 100px!important;
  margin: auto;
}
.font {
  font-size: 16px;
  font-weight: 700;
  color: black;
}
</style>