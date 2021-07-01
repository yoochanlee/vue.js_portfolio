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
        <ul style="list-style:none;">
          <li>
            <label id="cp_font">쿠폰 등록하기</label>
            <input type="text" name="box" id="cp_box" />
            <button id="cp_but">등록</button>
          </li>
        </ul>
      </div>
      <div>
        <ul>
          <router-link to="/coupona">
          <li class=li>
            <a>사용가능 (0)</a>
          </li>
          </router-link>
          <router-link to="/coupona">
          <li class=li>
            <a>사용완료 만료 (0)</a>
          </li>
          </router-link>
        </ul>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Cupon",
  props: {
    msg: String
  }
};
</script>

<style scoped>
ul{
	list-style: none;
}
.li{
  display: inline-block;
  width: 50%;
  height: 100px;
  font-size: 25px;
  font-weight: bold;
  color: #000;
  border: 1px solid #000;
  text-align: center;
  padding-top: 30px;
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
#cp {
  display: block;
  width: 1200px;
  height: 100%;
  box-sizing: border-box;
  margin: auto;
  padding-top: 100px;
}
#cp_div {
  display: block;
  width: 100%;
  height: 96px;
  padding: 22px 40px;
  margin: auto;
}
#cp_font {
  display: inline-block;
  font-size: 25px;
  font-weight: bold;
  color: f000;
}
#cp_box {
  display: inline-block;
  width: 30%;
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
</style>