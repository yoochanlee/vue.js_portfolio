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
       login_id:sessionStorage.getItem("login_id"),
       garde:sessionStorage.getItem("grade")
    };
  },
  methods:{
    logout:function(){
      sessionStorage.removeItem("login_id");
      sessionStorage.removeItem("grade");
      sessionStorage.removeItem('m_idx');
      this.$router.go('/');
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