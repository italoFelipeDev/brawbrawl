import Vue from 'vue';
import Router from 'vue-router';
import Home from './view/Home/Home.vue';
import Partida from './view/Partida/Partida.vue';
import Perfil from './view/Perfil/Perfil.vue';
import Rank from './view/Rank/Rank.vue';
import RegistrarPartida from './view/RegistrarPartida/RegistrarPartida.vue';
import RegistrarJogador from './view/RegistrarJogador/RegistrarJogador.vue';

Vue.use(Router)

export default new Router({
    mode:'history',
    routes: [
        {
            path:'/',
            name:'home',
            component: Home
        },
        
        {
            path:'/partida',
            name:'partida',
            component: Partida
        },

        {
            path:'/perfil',
            name:'perfil',
            component: Perfil
        },

        {
            path:'/rank',
            name:'rank',
            component: Rank
        },
        {
            path:'/regPart',
            name:'regPart',
            component: RegistrarPartida
            
        },
        {
            path:'/regJog',
            name:'regJog',
            component: RegistrarJogador

        }
    ]


})