import Vue from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'

Vue.config.productionTip = false
Vue.prototype.$axios = axios  //Vue객체에 전역변수 추가

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')

