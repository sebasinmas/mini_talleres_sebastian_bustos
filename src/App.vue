<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <nav>
    <RouterLink class="btn" to="/">Home</RouterLink>
    <RouterLink class="btn" to="/chencho">Es un secreto</RouterLink>
    <RouterLink class="btn" to="/corleone">De tu mirada y la mía</RouterLink>
    <RouterLink class="btn" to="/maldy">Un presentimiento</RouterLink>
    <RouterLink class="btn" to="/plan">Como un angel que</RouterLink>
    <RouterLink class="btn" to="/b">Me decía. ES UN SECRETO!</RouterLink>
  </nav>
  <RouterView />
</template>

<style scoped>
:root {
  --colores-lindos-1: #E2DAD3;
  --colores-lindos-2: #84D6E3;
  --colores-lindos-3: #35B0AA;
  --colores-lindos-4: #2F7774;
  --colores-lindos-5: #225147;
}

nav {
  display: flex;
  flex-direction: row;
  width: 100%;
}

.btn {
  display: block;
  width: min-content;
  padding: 10px 15px;
  background-color: #0BE6B6;
}
</style>
