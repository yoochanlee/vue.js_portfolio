<template>
  <div id="app">
    <top></top>
    <div id="container" class="container">
        <router-view></router-view>
    </div>
  </div>
</template>

<script>
import top from './components/header/header.vue';

export default {
  name: 'App',
  components: {
    top
  }
}
</script>

<style>
</style>
