<template>
  <div id="app">
    <Header/>
    <HelloWorld msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue';
import Header from './components/common/Header';
export default {
  name: 'App',
  components: {
    Header

    , HelloWorld
  }
}
</script>

<style>

</style>
