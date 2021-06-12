import Vue from 'vue'
import VueRouter from 'vue-router'
import Mainpage from '../components/page/main'
import JoinPage from '../components/page/join'
import CartPage from '../components/page/cart'
import List_ViewPage from '../components/page/list_view'
import Adminpage from '../components/page/adminpage'
import MyPagePage from '../components/page/mypage'
import ReViewPage from '../components/page/review'
import OiPage from '../components/page/oi'
import QaPage from '../components/page/qa'
import MyPageeditPage from '../components/page/mypageedit'
import OrderPage from '../components/page/order'
import PointPage from '../components/page/point'
import CouponPage from '../components/page/coupon'
import CouponaPage from '../components/page/coupona'
import CouponbPage from '../components/page/couponb'
import MyPageqaPage from '../components/page/mypageqa'
import Productre from '../components/page/productre'
import ProductEdit from '../components/page/productedit'

Vue.use(VueRouter)

export default new VueRouter({
  mode: 'history',
  routes: [
    { path: '/Join', component: JoinPage },
    { path: '/Cart', component: CartPage },
    { path: '/List_View', component: List_ViewPage },
    { path: '/admin', component: Adminpage },
    { path: '/MyPage', component: MyPagePage },
    { path: '/MyPageedit', component: MyPageeditPage },
    { path: '/Order', component: OrderPage },
    { path: '/ReView', component: ReViewPage },
    { path: '/Point', component: PointPage },
    { path: '/Coupon', component: CouponPage },
    { path: '/Coupona', component: CouponaPage },
    { path: '/Couponb', component: CouponbPage },
    { path: '/MyPageqa', component: MyPageqaPage },
    { path: '/Oi', component: OiPage },
    { path: '/Qa', component: QaPage },
    { path: '/productjoin', component: Productre },
    { path: '/productedit', component: ProductEdit },
    { path: '/', name: 'Main', component: Mainpage }

  ]
})

