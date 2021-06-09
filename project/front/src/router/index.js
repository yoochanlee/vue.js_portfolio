import Vue from 'vue'
import VueRouter from 'vue-router'
import LoginPage from '../components/page/login';
import Mainpage from '../components/page/main'
import JoinPage from '../components/page/join'
import CartPage from '../components/page/cart'
import List_ViewPage from '../components/page/list_view'
import MyPagePage from '../components/page/mypage'
import ReViewPage from '../components/page/review.vue'
import OiPage from '../components/page/oi.vue'
import QaPage from '../components/page/qa.vue'



Vue.use(VueRouter)

export default new VueRouter({
  mode: 'history',
  routes: [
        {path :'/Login', component : LoginPage},
        {path :'/Join', component : JoinPage},
        {path :'/Cart', component : CartPage},
        {path :'/List_View', component : List_ViewPage},
        {path :'/MyPage', component : MyPagePage},
        {path :'/ReView', component : ReViewPage},
        {path :'/Oi', component : OiPage},
        {path :'/Qa', component : QaPage},
        {path :'/',name:'Main',component : Mainpage}
]
})

