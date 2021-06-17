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
        <div style="display:inline;" v-for="p in list" v-bind:key="p.p_idx">
          <a href="/list_view">
            <img
              class="img"
              :src='p.path'
            />
          </a>
           <div class="img_cut2">
            <div>{{p.p_name}}</div>
            <div>{{p.p_idx}}</div>
            <div>25,300</div>
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
    list: [],
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
  },
  created: function() {
    const self = this;
    self.$axios.get('/products')
      .then(function(res) {
        if (res.data.result) {
          self.list = res.data.list;
          var i=0;
          for(i=0;i<self.list.length;i++){
            self.list[i].path = 'http://localhost:8888/products/img/' + self.list[i].p_img;
          }
        } else {
          alert('fail');
        }
      });

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
.main-container {
  display: block;
  background: white;
  width: 100%;
  height: 100%;
  box-sizing: border-box;
}
.img {
  display: bolck;
  width: 22%;
  height: 60%;
  box-sizing: border-bod;
  margin: 20px 20px;
}
</style>
