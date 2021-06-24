import Vue from 'vue'
import VueRouter from 'vue-router'
import Mainpage from '../components/page/main'
import JoinPage from '../components/page/join'
import CartPage from '../components/page/cart'
import List_ViewPage from '../components/page/list_view'
import List_TopPage from '../components/page/list_toppage.vue'
import List_ShoesPage from '../components/page/list_shoespage.vue'
import List_ShirtsPage from '../components/page/list_shirtspage.vue'
import List_PantsPage from '../components/page/list_pantspage.vue'
import List_OuterPage from '../components/page/list_outerpage.vue'
import List_BagPage from '../components/page/list_bagpage.vue'
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
import AditPage from '../components/page/adit'
import MainOuterPage from '../components/page/mainouter'
import MainTopPage from '../components/page/maintop'
import MainShirtsPage from '../components/page/mainshirts'
import MainPantsPage from '../components/page/mainpants'
import MainShoesPage from '../components/page/mainshoes'
import MainBagPage from '../components/page/mainbag'

Vue.use(VueRouter)

export default new VueRouter({
  mode: 'history',
  routes: [
    { path: '/Join', component: JoinPage },
    { path: '/Cart', component: CartPage },
    { path: '/List_View/:p_idx', component: List_ViewPage,name: 'List_ViewPage'},
    { path: '/List_TopPage/:p_idx', component: List_TopPage,name: 'List_TopPage'},
    { path: '/List_ShoesPage/:p_idx', component: List_ShoesPage,name: 'List_ShoesPage'},
    { path: '/List_PantsPage/:p_idx', component: List_PantsPage,name: 'List_PantsPage'},
    { path: '/List_ShirtsPage/:p_idx', component: List_ShirtsPage,name: 'List_ShirtsPage'},
    { path: '/List_OuterPage/:p_idx', component: List_OuterPage,name: 'List_OuterPage'},
    { path: '/List_BagPage/:p_idx', component: List_BagPage,name: 'List_BagPage'},
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
    { path: '/Adit', component: AditPage },
    { path: '/Qa', component: QaPage },
    { path: '/MainOuter', component: MainOuterPage },
    { path: '/MainTop', component: MainTopPage },
    { path: '/MainShirts', component: MainShirtsPage },
    { path: '/MainPants', component: MainPantsPage },
    { path: '/MainShoes', component: MainShoesPage },
    { path: '/MainBag', component: MainBagPage },
    { path: '/productjoin', component: Productre },
    { path: '/productedit', name: 'ProductEdit', component: ProductEdit, props:true },
    { path: '/', name: 'Main', component: Mainpage }

  ]
})

// const requireAuth = () => (to, from, next) => {
//     let login_id = sessionStorage.getItem('login_id');
//     let m_idx = sessionStorage.getItem('m_idx');
    
//     if(login_id && m_idx) {
//         return next();
//     } else {
//         sessionStorage.clear();
//         return next('/');
//     }
// };

