<template>
  <header id="header" class="header">
    <div class="row">
      
  <!-- As a link -->
  <b-navbar variant="light" type="light">
    <b-navbar-brand href="/">Men`s Clothing shore</b-navbar-brand>
    <div style="width: 1390px;"></div>
    <b-navbar-nav class="ml-auto">
      <b-nav-item @click="showModal">
          <a class="top"><p class="h4 mb-2"><b-icon icon="box-arrow-in-right"></b-icon></p></a>
        </b-nav-item>
        <b-nav-item to="/join">
          <a class="top"><p class="h5 mb-2"><b-icon icon="person-square"></b-icon></p></a>
        </b-nav-item>
        <b-nav-item to="/join">
          <a class="top"><p class="h5 mb-2"><b-icon icon="bucket-fill"></b-icon></p></a>
        </b-nav-item>
        <b-nav-item to="/admin">
          <a class="top"><p class="h5 mb-2"><b-icon icon="person-lines-fill"></b-icon></p></a>
        </b-nav-item>
        <b-nav-item to="/join">
          <a class="top"><p class="h5 mb-2"><b-icon icon="bell-fill"></b-icon></p></a>
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
      <h5>Modal Header</h5>
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
            <b-form-input id="input-small" size="sm" placeholder="Enter your Id"></b-form-input>
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
            <b-form-input id="input-small" size="sm" placeholder="Enter your password"></b-form-input>
            </b-input-group>
          </b-col>

            </b-row>
    </template>

    <template v-slot:modal-footer="{ ok, cancel}">
       <b-button-group style="margin: auto;">
      <b-button style="margin-right: 15px;" size="sm" @click="ok()">
        Sign
      </b-button>
      <b-button size="sm" @click="cancel()">
        Cancel
      </b-button>
      </b-button-group>
    </template>
        </b-modal>
      </div>
      
      
      <div id="center_img">
        <img
          id="img_top"
          onclick="location.href='/member/main';"
          style="cursor: pointer;"
          src="http://www.vekni.org/files/attach/images/39227/840/042/986027f50f02ddbf51417d799b3ff60a.png"
        />
      </div>
      <div>
        <ul style="text-align: center;">
          <li style="display: inline-block">
            <a class="li_font" href="${ pageContext.request.contextPath }/member/join.jsp">BEST</a>
          </li>
          <li style="display: inline-block">
            <a class="li_font" href="http:naver.com">OUTER</a>
          </li>
          <li style="display: inline-block">
            <a class="li_font" href="http:naver.com">TOP</a>
          </li>
          <li style="display: inline-block">
            <a class="li_font" href="/member/shrit">SHIRTS</a>
          </li>
          <li style="display: inline-block">
            <a class="li_font" href="http:naver.com">KNIT</a>
          </li>
          <li style="display: inline-block">
            <a class="li_font" href="http:naver.com">PANTS</a>
          </li>
          <li style="display: inline-block">
            <a class="li_font" href="http:naver.com">SHOES</a>
          </li>
          <li style="display: inline-block">
            <a class="li_font" href="http:naver.com">SHOES</a>
          </li>
        </ul>
      </div>
    </div>
  </header>
</template>
<script>
export default {
  methods: {
    showModal() {
      this.$root.$emit("bv::show::modal", "modal-1",);
    }
  }
};
</script>
<style>
.bg-light {
    background-color: #fff!important;
}
/* header */
.modal-content{
  padding: 0px 100px 0px; 
}
/* 상단 로그 이미지 */
#img_top {
  display: block;
  margin: 20px 430px;
  width: 1000px;
  height: 100px;
  box-sizing: border-box;
  opacity: 0.3;
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