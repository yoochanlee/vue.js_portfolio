<template>
  <div>
    <div class="top_box">
      <div style="text-align: center; font-size:20px;font-weight: bold; ">회 원 가 입</div>

      <div>
        <ul class="ul">
          <li class="li">
            <label for="id" class="font">아이디</label>
            <input type="text" name="m_id" id="id" v-model="m_id" class="box" />
            <span class=error_te></span>
          </li>
          <li class="li">
            <label for="pwd" class="font">비밀번호</label>
            <input type="password" v-model="m_pwd" id="pwd" class="box" />
            <span class=error_te></span>
          </li>
          <li class="li">
            <label for="pwd_ok" class="font">비밀번호 확인</label>
            <input type="password" v-model="pwd_ok" name="pwd_ok" id="pwd_ok" class="box" />
            <span class=error_te></span>
          </li>
          <li class="li">
            <label for="name" class="font">이름</label>
            <input type="text" name="m_name" v-model="m_name" id="name" class="box" />
          </li>
          <li class="li">
            <label for="email" class="font">이메일</label>
            <input type="text" name="m_email" v-model="m_email" id="email" class="box" />
            <span class=error_te></span>
          </li>
          <li class="li2">
            <label for="adr" class="font">우편번호</label>
            <input type="text" :value="zip" name="adr" id="adr" class="box01" />
            <button class="box4" @click="showApi">우편번호 검색</button>
          </li>
          <li class="li1">
            <label for="addres" class="font">주소</label>
            <input type="text" :value="addr1" name="addres" id="addres" class="box" />
          </li>
          <li class="li">
            <label for="phone" class="font">휴대폰번호</label>
            <input type="text" name="m_phone" v-model="m_phone" id="phone" class="box" />
            <span class=error_te></span>
            <!-- <button class="box3">인증번호 받기</button> -->
          </li>
          <!-- <li class="li">
            <label for="sms" class="font">SMS 인증번호</label>
            <input type="text" name="sms" id="sms" class="box" />
            <button class="box3">인증번호 확인</button>
          </li>-->
        </ul>
        <ul style="padding: 20px 10px; list-style:none;">
          <li>
            <label style="font-size:15px; font-weight: bold;">
              <input type="checkbox" value="Y" />
              " 14세 이상입니다."
              <font color="red">(필수)</font>
            </label>
          </li>
          <li style="margin-left:25px; font-size:12px;">
            회원가입에 필요한 최소한의 정보만 입력 받음으로써, 고객님의 개인정보 수집을 최소화하고
            편리한 회원가입을 제공합니다.
          </li>
        </ul>
      </div>
      <div>
        <div class="border" style="font-weight: bold; height:20px;">
          <label>
            <input type="checkbox" name="aa" value="Y" />
            전체동의
          </label>
        </div>
        <div class="border">
          <label>
            <input type="checkbox" name="bb" value="Y" />이용약관
          </label>
          <label>
            <input type="checkbox" name="cc" value="Y" class="la" />개인정보 수집 및 이용 안내
          </label>
          <label>
            <input type="checkbox" name="dd" value="Y" class="la" />개인정보 처리위탁
          </label>
        </div>
        <div class="border">
          <label>
            <input type="checkbox" name="ee" value="Y" />마케팅 수신동의
            <br />
            <br />쇼핑몰에서 제공하는 신상품 소식과 하일쿠폰을 무상으로 보내드립니다!
            <br />단, 상품 구매 정보는 수신동의 여부 관계없이 발송됩니다.
            <br />제공 동의를 하지 않으셔도 서비스 이용에는 문제가 없습니다.
          </label>
        </div>
      </div>

      <button class="box2" v-on:click="join">가 입 하 기</button>
    </div>
  </div>
</template>
<script>
      window.onload = function () {
        /* 변수 선언 */
      var id = document.querySelector('#id');
      var pwd = document.querySelector('#pwd');
      var pwd_ok = document.querySelector('#pwd_ok')
      var email = document.querySelector('#email');
      var phone = document.querySelector('#phone'); 
      var error = document.querySelectorAll('.error_te');
      
      /* 이벤트 핸들러 연결 */
      id.addEventListener("focusout", checkId);
      pwd.addEventListener("focusout", checkPwd);
      pwd_ok.addEventListener("focusout", checkPwd_ok);
      email.addEventListener("focusout", checkEmail);
      phone.addEventListener("focusout", checkPhone); 

     function checkId() {
      var idReg = /^[a-z]+[a-z0-9]{5,19}$/g;
      if (!idReg.test(id.value)) {
        error[0].innerHTML = "아이디는 영문자로 시작하는 6~20자 영문자 숫자조합 이어야 합니다."
        error[0].style.display = "block";
       } else {
        error[0].innerHTML = "사용 가능한 아이디입니다!";
        error[0].style.color = "#08A600";
        error[0].style.display = "block";
       }
    }
     function checkPwd(){
       var pwdReg = /^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$/g;
      if (!pwdReg.test(pwd.value)) {
        error[1].innerHTML = "비밀번호는 최소 8자, 최소 하나의 문자 및 하나의 숫자를 조합해야됩니다."
        error[1].style.display = "block";
      } else { 
        error[1].style.display = "none";
      }
    }
    function checkPwd_ok(){
      if (!(pwd.value == pwd_ok.value)) {
        error[2].innerHTML = "비밀번호가 일치하지 않습니다."
        error[2].style.display = "block";
        this.pwd_ok = "";
      } else {
        error[2].innerHTML = "사용 가능한 비밀번호 입니다."
        error[2].style.color = "#08A600";
        error[2].style.display = "block";        
      }
    }
    function checkEmail(){
      var emailReg = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
      if (!emailReg.test(email.value)) {
        error[3].innerHTML = "이메일 형식이 다릅니다."
        error[3].style.display = "block";
      } else {
        error[3].innerHTML = "사용 가능한 이메일 입니다." 
        error[3].style.color = "#08A600";
        error[3].style.display = "block";
      }
      }
    function checkPhone(){
      var telReg = /^\d{3}-\d{3,4}-\d{4}$/;
      if (!telReg.test(phone.value)) {
        error[4].innerHTML = "전화번호 형식이 다릅니다. -붙여주세요."
        error[4].style.display = "block";
      } else {
        error[4].innerHTML = "사용 가능한 전화번호입니다." 
        error[4].style.color = "#08A600";
        error[4].style.display = "block";
      }
    } 
    }
export default {
  name: "join",
  data() {
    return {
      zip: "",
      addr1: "",
      m_id: "",
      m_name: "",
      m_pwd: "",
      pwd_ok: "",
      m_email: "",
      m_phone: "",
      m_grade: 1
    };
  },
  methods: {
    join: function() {
      var m_addr = this.zip + this.addr1; // eslint-disable-line no-unused-vars
      const form = new URLSearchParams(); // eslint-disable-line no-unused-vars
      form.append("m_id", this.m_id);
      form.append("m_name", this.m_name);
      form.append("m_pwd", this.m_pwd);
      form.append("m_email", this.m_email);
      form.append("m_grade", this.m_grade);
      form.append("m_addr", m_addr);
      form.append("m_phone", this.m_phone);
      this.$axios.post("/members", form).then(res => {
        if (res.data.result) {
          alert("suceess");
          this.$router.replace("/");
        } else {
          alert("fail");
        }
      });
    },
    showApi() {
      new window.daum.Postcode({
        oncomplete: data => {
          // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
          // 도로명 주소의 노출 규칙에 따라 주소를 조합한다.
          // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
          let fullRoadAddr = data.roadAddress;
          // 도로명 주소 변수
          let extraRoadAddr = "";
          // 도로명 조합형 주소 변수 // 법정동명이 있을 경우 추가한다. (법정리는 제외)
          // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
          if (data.bname !== "" && /[동|로|가]$/g.test(data.bname)) {
            extraRoadAddr += data.bname;
          }
          // 건물명이 있고, 공동주택일 경우 추가한다.
          if (data.buildingName !== "" && data.apartment === "Y") {
            extraRoadAddr +=
              extraRoadAddr !== ""
                ? ", " + data.buildingName
                : data.buildingName;
          }
          // 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
          if (extraRoadAddr !== "") {
            extraRoadAddr = " (" + extraRoadAddr + ")";
          }
          // 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
          if (fullRoadAddr !== "") {
            fullRoadAddr += extraRoadAddr;
          }
          // 우편번호와 주소 정보를 해당 필드에 넣는다.
          this.zip = data.zonecode;
          //5자리 새우편번호 사용
          this.addr1 = fullRoadAddr;
        }
      }).open();
    }
  }
};
</script>

<style scoped>
.la {
  margin: 20px;
}
.top_box {
  width: 1200px;
  height: 100%;
  box-sizing: border-box;
  padding: 80px 20px 120px;
  margin: auto;
}

/* 회원가입 박스 */
.top_box {
  width: 1200px;
  height: 100%;
  box-sizing: border-box;
  padding: 80px 20px 120px;
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
.li2 {
  border-top: 1px solid #bdbdbd;
  padding: 15px 0px;
}
.li1 {
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
  width: 150px;
  height: 40px;
  box-sizing: border-box;
  border: 1px solid #848484;
}
.box1 {
  display: linline-block;
  width: 90px;
  height: 40px;
  box-sizing: border-box;
  border: 1px solid #848484;
  margin: 0px 4px;
}
/* 회원가입 폰트 */
.font {
  font-size: 14px;
  font-weight: bold;
  display: inline-block;
  width: 100px;
}
/* 약관동의 */
.border {
  border: 1px solid #bdbdbd;
}
/* 가입 박스 */
.box2 {
  display: block;
  width: 300px;
  height: 80px;
  box-sizing: border-box;
  background: black;
  color: #ffffff;
  margin: auto;
  font-size: 35px;
  font-weight: 200;
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
.box4 {
  display: inline-block;
  width: 120px;
  height: 40px;
  box-sizing: border-box;
  background: black;
  color: #ffffff;
  margin: 0px 0px 0px 30px;
  font-size: 13px;
  font-weight: 200;
}
.error_te {
    margin-top: 9px;
    margin-left: 100px;
    font-size: 12px;
    color: red;    
    display: none;
}
</style>