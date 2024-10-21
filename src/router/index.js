import FiveView from '@/views/FiveView.vue'
import FourView from '@/views/FourView.vue'
import HomeView from '@/views/HomeView.vue'
import OneView from '@/views/OneView.vue'
import ThreeView from '@/views/ThreeView.vue'
import TwoView from '@/views/TwoView.vue'
import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView,
    },
    {
      path: '/chencho',
      name: 'one',
      component: OneView,
    },
    {
      path: '/corleone',
      name: 'two',
      component: TwoView,
    },
    {
      path: '/maldy',
      name: 'three',
      component: ThreeView,
    },
    {
      path: '/plan',
      name: 'four',
      component: FourView,
    },
    {
      path: '/b',
      name: 'five',
      component: FiveView,
    },
  ],
})

export default router
