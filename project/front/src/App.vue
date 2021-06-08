<template>
  <div id="app">
    <Header/>
    <swiper class="swiper" :options="swiperOption">
    <swiper-slide><img src="http://lorempixel.com/580/250/nature/1"></swiper-slide>
    <swiper-slide>Slide 2</swiper-slide>
    <swiper-slide>Slide 3</swiper-slide>
    <swiper-slide>Slide 4</swiper-slide>
    <swiper-slide>Slide 5</swiper-slide>
    <div class="swiper-pagination" slot="pagination"></div>
    <div class="swiper-button-prev" slot="button-prev"></div>
    <div class="swiper-button-next" slot="button-next"></div>
  </swiper>
    <div id="container" class="container">
        <router-view></router-view>
    </div>
  </div>
</template>

<script>
import Header from './components/header/header.vue';
import { Swiper, SwiperSlide } from 'vue-awesome-swiper'
import 'swiper/css/swiper.css'
export default {
  name: 'App',
  components: {
    Header,
    Swiper,
    SwiperSlide
  },
 data() {
      return {
        swiperOption: {
          spaceBetween: 30,
          centeredSlides: true,
          autoplay: {
            delay: 2500,
            disableOnInteraction: false
          },
          pagination: {
            el: '.swiper-pagination',
            clickable: true
          },
          navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev'
          }
        }
      }
    }
  }
</script>

<style>
  @import './assets/css/slider/style.css';
</style>