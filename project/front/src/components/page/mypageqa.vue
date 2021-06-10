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
          <img class="img" src="../../../dist/img/car.png" />
          <span class="font">주문/배송조회</span>
        </div>
      </router-link>
      <router-link to="/point">
        <div class="a">
          <img class="img" src="../../../dist/img/p.png" />
          <span class="font">포인트</span>
        </div>
      </router-link>
      <router-link to="coupon">
        <div class="a">
          <img class="img" src="../../../dist/img/cp.png" />
          <span class="font">쿠폰</span>
        </div>
      </router-link>
      <router-link to="mypageqa">
        <div class="aa">
          <img class="img" src="../../../dist/img/qa.png" />
          <span class="font">Q&A</span>
        </div>
      </router-link>
    </div>
    <div class="qa_div">
      <div class="re_box">
        <div class="qa">
          Q&A 3
          <button class="qa_box">문의내용 작성하기</button>
        </div>
      </div>
      <div class="q_box">
        <div class="q_cut">
          <div class="q_cut01">답변상태</div>
          <div class="q_cut02">내용</div>
          <div class="q_cut01">작성자</div>
          <div class="q_cut01">작성일</div>
        </div>
        <div class="q_cut2">
          <div class="q_cut001">답변완료</div>
          <div class="q_cut002">비밀글 입니다.</div>
          <div class="q_cut001">k1***</div>
          <div class="q_cut001">2021-06-09</div>
        </div>
        <div class="q_cut2">
          <div class="q_cut001">답변완료</div>
          <div class="q_cut002">비밀글 입니다.</div>
          <div class="q_cut001">k1***</div>
          <div class="q_cut001">2021-06-09</div>
        </div>
        <div class="q_cut2">
          <div class="q_cut001">답변완료</div>
          <div class="q_cut002">비밀글 입니다.</div>
          <div class="q_cut001">k1***</div>
          <div class="q_cut001">2021-06-09</div>
        </div>
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
  color: black;
}
.q_cut {
  display: inline-block;
  width: 100%;
  height: 62px;
  padding: 20px 0px;
  box-sizing: border-box;
  border-bottom: 1px solid currentColor;
}
.q_cut01 {
  display: inline-block;
  width: 10%;
  height: 30px;
  box-sizing: border-box;
  font-size: 18px;
  font-weight: bold;
  text-align: center;
}
.q_cut02 {
  display: inline-block;
  width: 67%;
  height: 30px;
  box-sizing: border-box;
  font-size: 18px;
  font-weight: bold;
  text-align: center;
}
.q_cut001 {
  display: inline-block;
  width: 10%;
  height: 30px;
  box-sizing: border-box;
  font-size: 16px;
  font-weight: 700;
  text-align: center;
}
.q_cut002 {
  display: inline-block;
  width: 67%;
  height: 30px;
  box-sizing: border-box;
  font-size: 16px;
  font-weight: 700;
  text-align: center;
  color: darkgrey;
}
.q_cut2 {
  display: inline-block;
  width: 100%;
  height: 41px;
  font-size: 14.3px;
  padding: 10px 0px;
  box-sizing: border-box;
  border-bottom: 1px solid currentColor;
}
.q_box {
  display: inline-block;
  width: 100%;
  height: 90%;
  box-sizing: border-box;
  padding-top: 20px;
}
/* Q&A */
.qa {
  font-size: 20px;
  font-weight: bold;
  color: black;
  padding-bottom: 20px;
  border-bottom: 1px solid #000;
}
.qa_box {
  display: inline-block;
  float: right;
  width: 200px;
  height: 40px;
  box-sizing: border-box;
  background: #000;
  color: #ffffff;
}
/* 리뷰 박스 */
.re_box {
  display: inline-block;
  width: 100%;
  height: 41px;
  box-sizing: border-box;
  padding: 50px 20px 0px;
  margin: auto;
}
.qa_div {
  width: 1200px;
  height: 400px;
  padding: 50px 20px 0px;
  box-sizing: border-box;
  margin: auto;
}
</style>