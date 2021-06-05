import Vue from 'vue'
import VueRouter from 'vue-router'
import LoginPage from '../components/page/login';
import Mainpage from '../components/page/main'



Vue.use(VueRouter)

export default new VueRouter({
  mode: 'history',
  routes: [
        {path :'/login', component : LoginPage},
        {path :'/',name:'Main',component : Mainpage}
]
})

