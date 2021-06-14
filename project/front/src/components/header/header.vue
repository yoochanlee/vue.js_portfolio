<template>
  <header id="header" class="header">
    <div class="row">
      <!-- As a link -->
      <b-navbar variant="light" type="light">
        <b-navbar-brand href="/">Men`s Clothing shore</b-navbar-brand>
        <div style="width: 1390px;"></div>
        <b-navbar-nav class="ml-auto">
          <b-nav-item @click="showModal" v-if='this.$parent.login_flag'>
            <a class="top">
              <p class="h4 mb-2">
                <b-icon icon="box-arrow-in-right"></b-icon>
              </p>
            </a>
          </b-nav-item>
          <b-nav-item @click="this.$parent.logout" v-if='!this.$parent.login_flag'>
            <a class="top">
              <p class="h4 mb-2">
                <b-icon icon="arrow-left-square-fill"></b-icon>
              </p>
            </a>
          </b-nav-item>
          <b-nav-item to="/join" v-if='!this.$parent.login_flag'>
            <a class="top">
              <p class="h5 mb-2">
                <b-icon icon="person-square"></b-icon>
              </p>
            </a>
          </b-nav-item>
          <b-nav-item to="/cart" v-if='!this.$parent.login_flag'>
            <a class="top">
              <p class="h5 mb-2">
                <b-icon icon="bucket-fill"></b-icon>
              </p>
            </a>
          </b-nav-item>
          <b-nav-item to="/mypage" v-if='!this.$parent.login_flag'>
            <a class="top">
              <p class="h5 mb-2">
                <b-icon icon="person-lines-fill"></b-icon>
              </p>
            </a>
          </b-nav-item>
          <b-nav-item to="/admin" v-if='!this.$parent.login_flag'>
            <a class="top">
              <p class="h5 mb-2">
                <b-icon icon="bell-fill"></b-icon>
              </p>
            </a>
          </b-nav-item>
        </b-navbar-nav>
      </b-navbar>
      <div>
        <b-modal id="modal-1" size="lg" hide-header-close>
          <b-input-group-prepend is-text>
            <b-icon icon="person-fill"></b-icon>
          </b-input-group-prepend>
          <b-form-input type="text" placeholder="User ID"></b-form-input>

          <template v-slot:modal-header>
            <h5>Sign Up</h5>
          </template>

          <template v-slot:default>
            <b-row class="my-1">
              <b-col sm="2">
                <label for="input-small">User ID:</label>
              </b-col>
              <b-col sm="10">
                <b-input-group class="mb-2">
                  <b-input-group-prepend is-text>
                    <b-icon icon="person-fill"></b-icon>
                  </b-input-group-prepend>
                  <b-form-input
                    id="input-small"
                    size="sm"
                    v-model="m_id"
                    placeholder="Enter your Id"
                  ></b-form-input>
                </b-input-group>
              </b-col>
            </b-row>
            <b-row class="my-1">
              <b-col sm="2">
                <label for="input-small">Password:</label>
              </b-col>
              <b-col sm="10">
                <b-input-group class="mb-2">
                  <b-input-group-prepend is-text>
                    <b-icon icon="lock-fill"></b-icon>
                  </b-input-group-prepend>
                  <b-form-input
                    id="input-small"
                    size="sm"
                    v-model="m_pwd"
                    placeholder="Enter your password"
                  ></b-form-input>
                </b-input-group>
              </b-col>
            </b-row>
          </template>

          <template v-slot:modal-footer="{ ok, cancel}">
            <b-button-group style="margin: auto;">
              <b-button style="margin-right: 15px;" size="sm" v-on:click="login">Sign</b-button>
              <b-button size="sm" @click="cancel()">Cancel</b-button>
            </b-button-group>
          </template>
        </b-modal>
      </div>
      <div id="center_img">
        <img
          id="img_top"
          onclick="location.href='/';"
          style="cursor: pointer;"
          src="../../assets/img/main.png"
        />
      </div>
      <div style="text-align: center; margin: 20px">
        <div class="dropdown">
          <button class="dropdown-button">BEST</button>
        </div>
        <div class="dropdown">
          <button class="dropdown-button">OUTER</button>
          <div class="dropdown-content">
            <a href="#">재킷</a>
            <a href="#">가디건</a>
            <a href="#">코트</a>
            <a href="#">블레이져</a>
          </div>
        </div>
        <div class="dropdown">
          <button class="dropdown-button">TOP</button>
          <div class="dropdown-content">
            <a href="#">반판티</a>
            <a href="#">니트</a>
            <a href="#">맨투맨</a>
            <a href="#">후드티</a>
          </div>
        </div>
        <div class="dropdown">
          <button class="dropdown-button">SHIRTS</button>
          <div class="dropdown-content">
            <a href="#">기본</a>
            <a href="#">체크</a>
            <a href="#">헨리넥</a>
            <a href="#">스트라이프</a>
          </div>
        </div>
        <div class="dropdown">
          <button class="dropdown-button">PANTS</button>
          <div class="dropdown-content">
            <a href="#">반바지</a>
            <a href="#">청바지</a>
            <a href="#">슬렉스</a>
            <a href="#">트레이닝</a>
          </div>
        </div>
        <div class="dropdown">
          <button class="dropdown-button">SHOES</button>
          <div class="dropdown-content">
            <a href="#">운동화</a>
            <a href="#">스니커즈</a>
            <a href="#">구두/로퍼</a>
            <a href="#">샌들/슬리퍼</a>
          </div>
        </div>
        <div class="dropdown">
          <button class="dropdown-button">BAG</button>
          <div class="dropdown-content">
            <a href="#">에코백</a>
            <a href="#">백팩</a>
            <a href="#">크로스백</a>
          </div>
        </div>
      </div>
    </div>
  </header>
</template>
<script>
export default {
  data() {
    return {
      m_id: "",
      m_pwd: ""
    };
  },
  methods: {
    showModal() {
      this.$root.$emit("bv::show::modal", "modal-1");
    },
    hideModal() {
      this.$root.$emit('bv::hide::modal', 'modal-1');
    },
    login: function() {
      if (this.m_id == "" || null) {
        alert("아이디를 입력해주세요");
        this.m_id = "";
        return;
      }
      if (this.m_pwd == "" || null) {
        alert("비밀번호를 입력해주세요");
        this.m_pwd = "";
        return;
      }
      const self = this;
      this.$axios.get("/members/" + self.m_id).then(function(res) {
        if (res.data.result) {
          if (res.data.m == null) {
            alert("아이디가 없음");
          } else {
            if (res.data.m.m_pwd == self.m_pwd){
               sessionStorage.setItem('grade', res.data.m.m_grade);
               sessionStorage.setItem('m_idx', res.data.m.m_idx);
               sessionStorage.setItem("login_id", self.m_id);
               self.$parent.setflag(false);
               self.$router.push('/');
               self.hideModal();
            } else {
              alert('비밀번호 다름');
            }
          }
        }else{
          alert('로그인 실패');
        }
      });
    }
  }
};
</script>
<style>
.dropdown-button {
  background-color: #ffffff;
  padding: 8px;
  font-size: 30px;
  border: none;
  margin: 0px 25px;
}
.dropdown {
  position: relative;
  margin: auto;
  display: inline-block;
}
.dropdown-content {
  display: none;
  text-align: center;
  margin: 0px auto;
  position: absolute;
  background-color: #ffffff;
  min-width: 80px;
  padding: 5px;
  box-shadow: 0px 16px 16px 0px rgba(0, 0, 0, 0.3);
  font-size: 25px;
  z-index: 9999;
}
.dropdown-content a {
  color: black;
  padding: 8px;
  text-decoration: none;
  display: block;
  margin: auto;
  width: 100%;
  height: 100%;
  box-sizing: border-box;
  text-align: center;
}
.dropdown-content a:hover {
  background-color: raba(255, 255, 255, 0);
}
.dropdown:hover .dropdown-content {
  display: block;
}
.dropdown:hover .dropdown-button {
  background-color: #ffffff;
}
/* header */
.modal-content {
  padding: 0px 100px 0px;
}
/* 상단 로그 이미지 */
#img_top {
  display: block;
  width: 100%;
  height: 100px;
  box-sizing: border-box;
}
/* 상단 이미지 */
#img_main {
  display: block;
  margin: 0px auto;
  width: 1830px;
  height: 400px;
  box-sizing: border-box;
}
/* 상품 분류 태크 폰트 */
.li_font {
  color: #999999;
  font-size: 20pt;
  text-decoration-line: none;
  margin-right: 40px;
}
/* 상단 sns 이미지 */
.top_sns {
  display: inline-block;
  margin: 0px 5px;
  width: 20px;
  height: 20px;
  box-sizing: border-box;
}
/* 맨위 */
.top {
  display: block;
  float: right;
  font-size: 10pt;
  color: #999999;
  margin-right: 10px;
  cursor: pointer;
}
#center_img {
  margin: auto;
}
</style>