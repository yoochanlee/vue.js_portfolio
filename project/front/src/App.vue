<template>
  <div id="app">
    <top></top>
    <div id="container" class="container">
        <router-view></router-view>
    </div>
    <Footer></Footer>
  </div>
</template>

<script>
import top from './components/header/header.vue';
import Footer from './components/header/footer.vue';

export default {
  name: 'App',
  components: {
    top,
    Footer
  }
}
</script>

<style>
</style>
