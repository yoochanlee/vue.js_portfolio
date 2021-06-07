<template>
  <div id="app">
    <top></top>
    <vue-image-slider :images="imageArray" :intervalVal=3000 :height=700 :width=1000 />
    <tiny-slider :mouse-drag="true" :loop="false" :autoplay="true" items="1" gutter="20" speed="500" :swipeAngle="false" slideBy="page">
    <div id="mouse-darg-item0" style="height: 100px; background: red">Slider item #1</div>
    <div id="mouse-darg-item1" style="height: 100px; background: yellow">Slider item #2</div>
    <div id="mouse-darg-item2" style="height: 100px; background: green">Slider item #3</div>
    </tiny-slider>
    <div id="container" class="container">
        <router-view></router-view>
    </div>
  </div>
</template>

<script>
import top from './components/header/header.vue';
import VueImageSlider from 'vue-image-slider';
import VueTinySlider from 'vue-tiny-slider';


export default {
  name: 'App',
  components: {
    top,
    VueImageSlider,
    'tiny-slider': VueTinySlider
  },
  data() {
  return {
   imageArray: [
    'http://lorempixel.com/580/250/nature/1',
    'http://lorempixel.com/580/250/nature/2',
    'http://lorempixel.com/580/250/nature/3',
    'http://lorempixel.com/580/250/nature/4'
   ],
  }
 },
}
</script>

<style>
</style>
