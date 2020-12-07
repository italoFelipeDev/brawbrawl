<template>
  <div id="app">
    <!-- barra de navegação -->
    <div>
      <nav class="navbar navbar-expand-lg navbar-light bg-primary">
        <router-link to='/'><img src="./assets/images/brawbrawl.png" width="120" height="30" alt=""></router-link>
          <ul class="navbar-nav">
            <li class="nav-item active">
              <router-link to='/partida' class="nav-link" href="#">Partidas<span class="sr-only">(current)</span></router-link>
            </li>
            <li class="nav-item">
              <router-link to='/perfil' class="nav-link" href="#">Perfil</router-link>
            </li>
            <li class="nav-item">
              <router-link to='/rank' class="nav-link" href="#">Rank</router-link>
            </li>
             <li class="nav-item">
              <router-link to='/regJog' class="nav-link" href="#">Registrar Jogador</router-link>
            </li>
            <li class="nav-item">
              <router-link to='/regPart' class="nav-link" href="#">Registrar Partida</router-link>
            </li>
          </ul>
      </nav>
    </div>
    <br>
      <!-- Corpo da aplicação -->
    <body>
        <!-- Router -->
       <router-view></router-view>
    </body>
   
  </div>
</template>

<script>

export default {
  name: 'App',
  components: {
    
  }
}
</script>

<style src="../main.css" lang="css" />