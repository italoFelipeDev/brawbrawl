<template>
    <div>
        <div class="container container-st">
            <div class="card card-st" style="width: 18rem;">
                <img class="card-img-top image-st" src="../../assets/images/wushang.png" alt="Card image cap">
                    <div class="card-body card-tiltle-st">
                         <h5 class="card-title card-tiltle-text">Jogador</h5>
                    </div>
                <ul class="list-group list-group-flush card-body-st">
                    <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">ID</span>: 1</li>
                    <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">RANK</span>: #1</li>
                    <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">MAIN CHARACTER</span>: Wushang</li>
                </ul>
                <br>
                <button type="button" class="btn btn-primary btn-st">PARTIDAS</button>
            </div>
            <div class="list-st">
                <ul class="list-group">
                <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">VITORIAS</span>: 10 </li>
                <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">DANO CAUSADO</span>: 1000</li>
                <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">DANO SOFRIDO</span>: 500</li>
                <li class="list-group-item card-body-st"><span class="badge badge-primary badge-st">PARTIDAS JOGADAS</span>: 10</li>
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