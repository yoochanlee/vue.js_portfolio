<template>
  <div id="app">
    <Header/>
        <router-view></router-view>
  </div>
</template>

<script>
import Header from './components/header/header.vue';
export default {
  name: 'App',
  components: {
    Header
  }
}
</script>
