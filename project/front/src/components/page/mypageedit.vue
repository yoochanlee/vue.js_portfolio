<template>
  <div>
    <p id="header">마이페이지</p>
    <div id="box">
      <router-link to="/mypageedit">
        <div class="a">
          <div>
            <b-icon icon="person-check" style="width: 80px; height: 80px;" variant="dark"></b-icon>
          </div>
          <span class="font1">개인정보수정</span>
        </div>
      </router-link>
      <router-link to="/order">
        <div class="a">
          <img class="img" src="../../assets/img/car.png" />
          <span class="font1">주문/배송조회</span>
        </div>
      </router-link>
      <router-link to="/point">
        <div class="a">
          <img class="img" src="../../assets/img/p.png" />
          <span class="font1">포인트</span>
        </div>
      </router-link>
      <router-link to="coupon">
        <div class="a">
          <img class="img" src="../../assets/img/cp.png" />
          <span class="font1">쿠폰</span>
        </div>
      </router-link>
      <router-link to="mypageqa">
        <div class="aa">
          <img class="img" src="../../assets/img/qa.png" />
          <span class="font1">Q&A</span>
        </div>
      </router-link>
    </div>
    <div class="top_box">
      <div style="text-align: center; font-size:20px;font-weight: bold; ">개 인 정 보 수 정</div>
      <div>
        <ul class="ul">
          <li class="li">
            <label class="font">아이디</label>
            <input type="text" name="id" class="box01" />
          </li>
          <li class="li">
            <label for="pwd" class="font">비밀번호</label>
            <input type="password" name="pwd" id="pwd" class="box" />
          </li>
          <li class="li">
            <label for="pwd_ok" class="font">비밀번호 확인</label>
            <input type="password" name="pwd_ok" id="pwd_ok" class="box" />
            <button class="box3">수정</button>
          </li>
          <li class="li">
            <label for="name" class="font">이름</label>
            <input type="text" name="name" id="name" class="box01" />
          </li>
          <li class="li">
            <label for="email" class="font">이메일</label>
            <input type="text" name="email" id="email" class="box" />
            <button class="box3">수정</button>
          </li>
          <li class="li">
            <label for="tel" class="font">휴대폰번호</label>
            <input type="text" name="tel" id="tel" class="box" />
            <button class="box3">수정</button>
          </li>
        </ul>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "MyPageedit",
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
.font1 {
  font-size: 16px;
  font-weight: 700;
  color: #000;
}
.top_box {
  width: 1200px;
  height: 100%;
  box-sizing: border-box;
  padding: 80px 20px 0px;
  margin: auto;
}
/* 회원가입 박스 */
.ul {
  border-top: 1px solid black;
  display: block;
  list-style: none;
}
.li {
  border-top: 1px solid #bdbdbd;
  border-bottom: 1px solid #bdbdbd;
  padding: 15px 0px;
}
/* 회원가입 박스 */
.box {
  display: inline-block;
  width: 300px;
  height: 40px;
  box-sizing: border-box;
  border: 1px solid #848484;
}
.box01 {
  display: inline-block;
  width: 300px;
  height: 40px;
  box-sizing: border-box;
  border: 1px solid #848484;
  pointer-events: none;
}
/* 회원가입 폰트 */
.font {
  font-size: 14px;
  font-weight: bold;
  display: inline-block;
  width: 100px;
  color: black;
}
/* 인증번호박스 */
.box3 {
  display: inline-block;
  width: 100px;
  height: 40px;
  box-sizing: border-box;
  background: black;
  color: #ffffff;
  margin: 0px 0px 0px 30px;
  font-size: 13px;
  font-weight: 200;
}
</style>