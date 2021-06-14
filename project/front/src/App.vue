<template>
  <div id="app">
    <Header/>
        <router-view></router-view>
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
  },
  methods:{
    setflag:function(flag){
      this.login_flag=flag;
   },
    logout:function(){
      this.login_flag=true;
      sessionStorage.removeItem("login_id");
      sessionStorage.removeItem("grade");
   }
  }   
}
</script>