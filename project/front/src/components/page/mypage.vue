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
      <div class="a">
        <img class="img" src="../../../dist/img/car.png" />
        <span class="font">주문/배송조회</span>
      </div>
      <div class="a">
        <img class="img" src="../../../dist/img/p.png" />
        <span class="font">포인트</span>
      </div>
      <div class="a">
        <img class="img" src="../../../dist/img/cp.png" />
        <span class="font">쿠폰</span>
      </div>
      <div class="aa">
        <img class="img" src="../../../dist/img/qa.png" />
        <span class="font">Q&A</span>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "MyPage",
  props: {
    msg: String
  }
};
</script>

<style scoped>
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
  width: 100px;
  height: 100px;
  margin: auto;
}
.font {
  color: #000;
  font-size: 16px;
  font-weight: 700;
}
</style>