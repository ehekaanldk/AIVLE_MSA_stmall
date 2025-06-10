import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/orderDetails',
      component: () => import('../components/ui/OrderDetailGrid.vue'),
    },
    {
      path: '/deliveryDetails',
      component: () => import('../components/ui/DeliveryDetailGrid.vue'),
    },
    {
      path: '/stockDetails',
      component: () => import('../components/ui/StockDetailGrid.vue'),
    },
    {
      path: '/mypages',
      component: () => import('../components/MypageView.vue'),
    },
  ],
})

export default router;
