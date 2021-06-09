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
    top,
    Footer

  }
}
</script>
