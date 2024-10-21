<script setup>
</script>
<template>
    <div class="center normal">
        <div class="hover-container">
            <h1 class="not-clickable-button">Pasa el cursor por encima</h1>
            <h2 class="hidden-text">Perreo</h2>
        </div>
    </div>
</template>
<style lang="css" scoped>
.not-clickable-button {
    top: -60px;
    background-color: aqua;
    border-radius: 12px;
    padding: 10px;
    width: 8rem;
    text-align: center;
    transition: transform 0.3s;
}

.hover-container {
    position: relative;
    display: flex;
    align-items: center;
    justify-content: center;
}

.hidden-text {
    position: absolute;
    top: -60px;
    /* Ajustar la posición para que aparezca sobre el botón */
    left: 50%;
    transform: translateX(-50%);
    background-color: #14AE5C;
    border-radius: 12px;
    padding: 10px;
    width: 8rem;
    text-align: center;
    z-index: 1;
    opacity: 0;
    transition: opacity 0.3s;
}

.hover-container:hover .hidden-text {
    opacity: 1;
}

.hover-container:hover .not-clickable-button {
    transform: translateY(-60px);
    /* Desplazar el botón hacia abajo en lugar de hacia arriba */
}

.center {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    border-radius: 12px;
    margin-top: 1vh;
    min-height: 80vh;
}

.normal {
    background-color: #494D66;
}

.wrong {
    background-color: rgba(204, 75, 75, 0.795);
}

.good {
    background-color: rgb(70, 129, 115);
}
</style>