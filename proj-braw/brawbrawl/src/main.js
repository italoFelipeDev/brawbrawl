import Vue from 'vue'
import App from './App.vue'
import router from './router.js';

Vue.config.productionTip = false
/* O router precisa ser inicializado junto com o "app" */
new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
