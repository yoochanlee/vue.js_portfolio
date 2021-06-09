<template>
  <div class="main-container">
    <swiper class="swiper" :options="swiperOption">
      <swiper-slide>
        <img src="http://lorempixel.com/580/250/nature/1" />
      </swiper-slide>
      <swiper-slide><img src="http://lorempixel.com/580/250/nature/2" /></swiper-slide>
      <swiper-slide><img src="http://lorempixel.com/580/250/nature/3" /></swiper-slide>
      <swiper-slide><img src="http://lorempixel.com/580/250/nature/4" /></swiper-slide>
      <swiper-slide><img src="http://lorempixel.com/580/250/nature/2" /></swiper-slide>
      <swiper-slide><img src="http://lorempixel.com/580/250/nature/3" /></swiper-slide>
      <div class="swiper-pagination" slot="pagination"></div>
      <div class="swiper-button-prev" slot="button-prev"></div>
      <div class="swiper-button-next" slot="button-next"></div>
    </swiper>
    <div>
      <div>
        <p style="text-align: center">베스트 상품</p>
      </div>
    </div>
    <div class="main_list">
      <div class="img_mid">
        <div class="img_cut" v-for="person in people" v-bind:key="person.id">
          <a href="/list_view">
            <img
              class="img_s"
              :src="person.profileUrl"
            />
          </a>
          <div class="img_cut2">
            <div>남자 바지</div>
            <div>4color</div>
            <div>25,300</div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Main",
  props: {
    msg: String
  },
  data() {
    return {
		people: [
        {
          // ... 생략
          profileUrl: require("../../assets/img/123.jpg")
		},
		{
          // ... 생략
          profileUrl: require("../../assets/img/123.jpg")
		},
		{
          // ... 생략
          profileUrl: require("../../assets/img/123.jpg")
		},
		{
          // ... 생략
          profileUrl: require("../../assets/img/123.jpg")
		}
		],
      swiperOption: {
        slidesPerView: 3,
        centeredSlides: false,
        slideShadows : true,
        autoplay: {
          delay: 2500,
          disableOnInteraction: false
        },
        pagination: {
          el: ".swiper-pagination",
          clickable: true
        },
        navigation: {
          nextEl: ".swiper-button-next",
          prevEl: ".swiper-button-prev"
        }
      }
    };
  }
};
</script>




<style>
html,
body {
  position: relative;
  height: 100%;
}

body {
  background: #eee;
  font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
  font-size: 14px;
  color: #000;
  margin: 0;
  padding: 0;
}

.swiper-container {
  width: 100%;
  height: 8%;
}

.swiper-slide {
  text-align: center;
  font-size: 18px;
  background: #fff;

  /* Center slide text vertically */
  display: -webkit-box;
  display: -ms-flexbox;
  display: -webkit-flex;
  display: flex;
  -webkit-box-pack: center;
  -ms-flex-pack: center;
  -webkit-justify-content: center;
  justify-content: center;
  -webkit-box-align: center;
  -ms-flex-align: center;
  -webkit-align-items: center;
  align-items: center;
  width: 80%;
}
.swiper-slide:nth-child(2n) {
    width: 60%;
  }
.swiper-slide:nth-child(3n) {
    width: 40%;
}

.swiper-slide img {
  display: block;
  width: 100%;
  height: 100%;
  object-fit: cover;
}
.main_list {
  overflow: visible;
  padding: 0 0 80px;
  margin: 0 48px;
  margin-right: 1px;
  box-sizing: border-box;
  -webkit-text-size-adjust: none;
}
.main-container {
  display: block;
  background: white;
  width: 100%;
  height: 6000px;
  box-sizing: border-box;
}
/* 중간 이미지 */
.img_mid {
  display: inline-bolck;
  margin: 10px auto;
  width: 100%;
  height: 630px;
  box-sizing: border-box;
  text-align: center;
  background: white;
}
/* 중간 이미지 세로 분할 */
.img_cut {
  display: inline-bolck;
  float: left;
  width: 20%;
  height: 80%;
  box-sizing: border-box;
  margin: 0px 35px;
}
/* 중간 이미지 가로 분할 */
.img_cut2 {
  display: bolck;
  width: 100%;
  height: 15%;
  box-sizing: border-box;
}
/* 중간 이미지 */
.img_s {
  display: bolck;
  width: 90%;
  height: 60%;
  box-sizing: border-bod;
}
</style>
