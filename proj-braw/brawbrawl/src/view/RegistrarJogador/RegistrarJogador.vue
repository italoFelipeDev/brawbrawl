<!-- Esta view ainda está em desenvolvimento -->

<template>
    <div>
            <!-- Jumbotron -->
            <div class="Jumbo">
                <div>
                <!-- Jumbotron -->
                <div class="card card-image">
                <div class="text-white text-center rgba-stylish-strong py-5 px-4">
                <div class="py-5">

            <!-- Content -->
                <h2 class="card-title h2 my-4 py-2">Registro de Jogador</h2>
                <p class="mb-4 pb-2 px-md-5 mx-md-5">Traga mais um para jogar entre as lendas"</p>
                </div>
                </div>
                </div>

            </div>
        </div>

        <!-- Registro -->
       <div class="input-group mb-3 input-st">
            <div class="input-group-prepend">
                <span class="input-group-text input-color" id="inputGroup-sizing-default">Nickname:</span>
            </div>
        <input type="text" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default">
        </div>
        <div class="input-group mb-3 input-st">
            <div class="input-group-prepend">
                <span class="input-group-text input-color" id="inputGroup-sizing-default">Main Character:</span>
            </div>
        <input type="text" class="form-control" aria-label="Default" aria-describedby="inputGroup-sizing-default">
        </div>
        <button type="button" class="btn btn-primary">Registrar</button>
    </div>
</template>


<script>
export default {
    name:'registrarJogador'
    
}
</script>

<style src='./style.css' lang="css" scoped />

