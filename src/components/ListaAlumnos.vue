<script setup>
import { defineProps } from 'vue';
defineProps(['arrayEstudiantes'])
</script>

<template>
    <ul v-if="arrayEstudiantes">
        <li v-for="estudiante in arrayEstudiantes" :key="estudiante.id">
            <p>Nombre: {{ estudiante.nombre }}</p>
            <p>Nivel: {{ estudiante.nivel }}</p>
            <p>Notas: {{ estudiante.notas.join(' , ') }}</p>
        </li>
    </ul>
    <div v-else>No se han podido cargar los alumnos!</div>
</template>
