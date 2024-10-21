<script setup>
import { ref } from 'vue'
const correctPassBool = ref(false);
const actualPass = ref('');
</script>
<template>
    <div class="center normal">
        <div class="form">
            <label for="contrasenia">Ingrese la contraseña con espacios:</label>
            <input id="contrasenia" name="contrasenia" class="input-text" type="textbox"
                placeholder="Ingrese la contraseña">
        </div>
    </div>
</template>
<style lang="css" scoped>
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