<script setup>
import { ref } from 'vue';

const correctPassBool = ref(false);
const actualPass = ref('');
const expectedPass = 'Baila Perreo Secreto Bellaca Sensual';
const hasClicked = ref(false);

// Función para validar la contraseña
function validatePassword() {
    hasClicked.value = true;
    correctPassBool.value = actualPass.value.trim() === expectedPass;
    console.log(actualPass.value.trim(' '))

    setTimeout(() => {
        hasClicked.value = false;
        correctPassBool.value = false;
        actualPass.value = '';
    }, 3000);
}
</script>

<template>
    <div :class="['center', hasClicked && actualPass ? (correctPassBool ? 'good' : 'wrong') : 'normal']">
        <div class="form">
            <label for="contrasenia">Ingrese la contraseña con espacios:</label>
            <input id="contrasenia" name="contrasenia" class="input-text" type="text"
                placeholder="Ingrese la contraseña" v-model.trim="actualPass" />
            <button class="check-button" @click="validatePassword">Comprobar</button>
            <p v-if="hasClicked && actualPass && correctPassBool">Contraseña correcta!</p>
            <p v-if="hasClicked && actualPass && !correctPassBool">Contraseña incorrecta.</p>
        </div>
    </div>
</template>

<style lang="css" scoped>
.check-button {
    padding: 12px 24px;
    background-color: #14AE5C;
    color: #ffffff;
    border: none;
    border-radius: 12px;
    cursor: pointer;
    font-size: 16px;
    font-weight: bold;
    transition: background-color 0.3s, transform 0.3s;
    box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.3);
}

.check-button:hover {
    background-color: #12a250;
    transform: scale(1.05);
}

.check-button:active {
    background-color: #0f8a42;
    transform: scale(0.95);
}

.form {
    display: flex;
    flex-direction: column;
    gap: 20px;
}

.input-text {
    padding: 20px 24px;
    color: #ffffff;
    background-color: #303036;
    border-radius: 12px;
    border: 1px solid #66666659;
}

.input-text:focus {
    border: 1px solid #14AE5C;
    outline: none;
}

.center {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    border-radius: 12px;
    margin-top: 1vh;
    min-height: 80vh;
    transition: background-color 0.5s ease;
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