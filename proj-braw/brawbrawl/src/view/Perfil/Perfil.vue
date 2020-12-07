<template>
    <div>
        <div class="container container-st">
            <!-- Card Peril-->
            <div class="card card-st" style="width: 18rem;">
                <!-- Imagem Lenda -->
                <img class="card-img-top image-st" src="../../assets/images/wushang.png" alt="Card image cap">
                    <div class="card-body card-tiltle-st">
                        <!-- Nome Jogador -->
                         <h5 class="card-title card-tiltle-text">Jogador</h5>
                    </div>
                <ul class="list-group list-group-flush card-body-st">
                    <!-- Id -->
                    <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">ID</span>: 1</li>
                    <!-- Rank -->
                    <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">RANK</span>: #1</li>
                    <!-- Main -->
                    <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">MAIN CHARACTER</span>: Wushang</li>
                </ul>
                <br>
                <!-- Link para partidas -->
                <button type="button" class="btn btn-primary btn-st">PARTIDAS</button>
            </div>
            <!-- Status jogador -->
            <div class="list-st">
                <ul class="list-group">
                <!-- Vitorias -->
                <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">VITORIAS</span>: 10 </li>
                <!-- Dano causado -->
                <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">DANO CAUSADO</span>: 1000</li>
                <!-- Dano sofrido -->
                <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">DANO SOFRIDO</span>: 500</li>
                <!-- Partidas -->
                <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">PARTIDAS JOGADAS</span>: 10</li>
                <!-- Maior dano em uma partida -->
                <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">MAIOR DANO EM UMA PARTIDA</span>: 500</li>
            </ul>
            </div>
        </div>
    </div>
    
</template>


<script>
export default {
    name:"perfil"
    
}
</script>

<style src='./style.css' lang="css" scoped />