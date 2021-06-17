<template>
  <div id="app">
    <Header/>
    <main>
        <router-view ></router-view>
    </main>
    <Footer></Footer>
  </div>
</template>

<script>

import Header from './components/header/header.vue';
import Footer from './components/header/footer.vue';
export default {
  name: 'App',
  components: {
    Header,
    Footer

  },
  data(){
    return{
      login_flag:true
    };
  },
  created:function(){
    var login_id = sessionStorage.getItem("login_id");
    if(login_id=='' || login_id==null){
      this.login_flag=true;
    }else {
      this.login_flag=false;
    }
    var m_idx = sessionStorage.getItem("m_idx");
    if(m_idx=='' || m_idx==null){
      this.login_flag=true;
    }else {
      this.login_flag=false;
    }
  },
  methods:{
    setflag:function(flag){
      this.login_flag=flag;
   },
    logout:function(){
      this.login_flag=true;
      sessionStorage.removeItem("login_id");
      sessionStorage.removeItem("grade");
      sessionStorage.removeItem('m_idx');
   }
  }   
}
</script>
<style scoped>
Header {
height: 263px;
}
main {
background: #ffffff;
min-height: 100%;
}
</style>