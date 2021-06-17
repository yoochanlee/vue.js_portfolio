<template>
  <div>
    <p id="header">관리자</p>
    <div id="box">
      <router-link to="/productjoin">
        <div class="a">
          <div>
            <b-icon icon="gift-fill" style="width: 80px; height: 80px;" variant="dark"></b-icon>
          </div>
          <span class="font">상품등록</span>
        </div>
      </router-link>
      <router-link to="/productedit">
      <div class="a">
        <div>
          <b-icon icon="gift" style="width: 80px; height: 80px;" variant="dark"></b-icon>
        </div>
        <span class="font">상품수정</span>
      </div>
      </router-link>
      <router-link to="/adit">
      <div class="a">
        <div>
          <b-icon icon="envelope-fill" style="width: 80px; height: 80px;"></b-icon>
        </div>
        <span class="font">메일</span>
      </div>
      </router-link>
      <div class="a">
        <div>
          <b-icon icon="pencil-square" style="width: 80px; height: 80px;"></b-icon>
        </div>
        <span class="font">리뷰관리</span>
      </div>
      <div class="aa">
        <div>
          <b-icon icon="exclamation-circle" style="width: 80px; height: 80px;"></b-icon>
        </div>
        <span class="font">불편사항</span>
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
  font-size: 16px;
  font-weight: 700;
  color: #000;
}
</style>