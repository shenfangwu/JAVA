import Vue from 'vue'
import App from './App.vue'
import router from './router'
// 导入ElementUI
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
Vue.use(ElementUI);

Vue.config.productionTip = false

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
/*
  相当于下面
  new Vue({
  el:"#app"
  router:router,
  // 创建一个App组件的虚节点
  render: function (h) {
    return h(App);
  }
})
 */