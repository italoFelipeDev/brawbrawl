<template>
<div>
    <div class="Jumbo">
            <div>
            <!-- Jumbotron -->
            <div class="card card-image">
            <div class="text-white text-center rgba-stylish-strong py-5 px-4">
            <div class="py-5">

        <!-- Content -->
            <h2 class="card-title h2 my-4 py-2">Historico de Partidas</h2>
            <p class="mb-4 pb-2 px-md-5 mx-md-5">Olhe todas as partidas já registradas!</p>
            </div>
            </div>
            </div>
    <!-- Jumbotron -->
        </div>
    </div>

    <!-- Partida -->
    <div class="container container-st ">
        <!-- Players e dados -->
        <div class="container flexer">
             <!-- Imagem Lenda -->
            <div class="card card-size image-st" style="width: 8rem;">
                <img class="card-img-top" src="../../assets/images/wushang.png" alt="Card image cap">
                <!-- Corpo -->
                <div class="card-body card-body-st">
                    <!-- Colocação -->
                    <span class="badge badge-primary badge-st">1º</span>
                    <p class="card-text">
                         <!-- Nome Jogador -->
                        <span class="badge badge-primary">PLAYER:</span>
                            Jogador
                    <br>
                         <!-- Dano causado -->
                        <span class="badge badge-success">DMG:</span>
                            3000
                    <br>
                        <!-- Dano sofrido -->
                        <span class="badge badge-danger">DMG:</span>
                            500
                    </p>
                </div>
            </div>

            <div class="card card-size image-st" style="width: 8rem;">
                <img class="card-img-top image-st" src="../../assets/images/wushang.png" alt="Card image cap">
                <div class="card-body card-body-st">
                    <span class="badge badge-primary badge-st">2º</span>
                    <p class="card-text">
                        <span class="badge badge-primary">PLAYER:</span>
                            Jogador
                    <br>
                        <span class="badge badge-success">DMG:</span>
                            3000
                    <br>
                        <span class="badge badge-danger">DMG:</span>
                            500
                    </p>
                </div>
            </div>

            <div class="card card-size image-st" style="width: 8rem;">
                <img class="card-img-top image-st" src="../../assets/images/wushang.png" alt="Card image cap">
                <div class="card-body card-body-st">
                    <span class="badge badge-primary badge-st">3º</span>
                    <p class="card-text">
                        <span class="badge badge-primary">PLAYER:</span>
                            Jogador
                        <span class="badge badge-success">DMG:</span>
                            3000
                    <br>
                        <span class="badge badge-danger">DMG:</span>
                            500
                    </p>
                </div>
            </div>

            <div class="card card-size image-st" style="width: 8rem;">
                <img class="card-img-top" src="../../assets/images/wushang.png" alt="Card image cap">
                <div class="card-body card-body-st">
                    <span class="badge badge-primary badge-st">4º</span>
                    <p class="card-text">
                        <span class="badge badge-primary">PLAYER:</span>
                            Jogador
                    <br>
                        <span class="badge badge-success">DMG:</span>
                            3000
                    <br>
                        <span class="badge badge-danger">DMG:</span>
                            500
                    </p>
                </div>
            </div>
        </div>
        <br>




        <!-- Dados da partida -->
        <div class="container match-data">
            <!-- Numero da partida -->
            <div class="card card-body-st header-st" style="width: 18rem;">
                <div class="card-header">
                    PARTIDA 1
                </div>
            <!-- Data da partida -->
            <ul class="list-group list-group-flush">
                <li class="list-group-item card-body-st">
                    <span class="badge badge-primary">DATA:</span>
                    12/03/2000
                </li>
            <!-- Mapa da partida -->
                <li class="list-group-item card-body-st">
                    <span class="badge badge-primary ">MAPA:</span>
                    BrawlHaven
                </li>
            <!-- Modalidade da partida -->
                <li class="list-group-item card-body-st">
                    <span class="badge badge-primary">MODO:</span>
                    Stock
                </li>
            </ul>
            </div>

        </div>

    </div>
    

</div>
    
    
</template>


<script>
export default {
    name:"partida"
    
}
</script>

<style src='./style.css' lang="css" scoped />

