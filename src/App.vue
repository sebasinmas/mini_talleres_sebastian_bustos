<script setup>
import { RouterLink, RouterView } from 'vue-router'

</script>

<template>
  <div class="container">
    <nav>
      <RouterLink class="btn" to="/">Home</RouterLink>
      <RouterLink class="btn" to="/chencho">Es un secreto</RouterLink>
      <RouterLink class="btn" to="/corleone">De tu mirada y la mía</RouterLink>
      <RouterLink class="btn" to="/maldy">Un presentimiento</RouterLink>
      <RouterLink class="btn" to="/plan">Como un angel que</RouterLink>
      <RouterLink class="btn" to="/b">Me decía. ES UN SECRETO!</RouterLink>
    </nav>
    <RouterView />
  </div>
</template>

<style>
@import url('https://fonts.googleapis.com/css2?family=Open+Sans:wght@400;600&display=swap');

:root {
  --primary-color: #4A90E2;
  --secondary-color: #F5F7FA;
  --accent-color: #E94E77;
  --text-color: #333;
  --btn-text-color: #FFF;
}

.container {
  display: block;
  margin: 1vh 1vw;

}

body {
  font-family: 'Open Sans', sans-serif;
  background-color: #5B6393;
  color: white;
  margin: 0;
  padding: 0;
}

nav {
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  align-items: center;
  background-color: #162E49;
  padding: 15px 30px;
  border-radius: 12px;
  box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
}

.btn {
  margin: 0 12px;
  padding: 12px 24px;
  text-decoration: none;
  color: var(--btn-text-color);
  background-color: #5D51D0;
  border-radius: 6px;
  font-weight: 600;
  transition: background-color 0.3s, transform 0.3s, box-shadow 0.5s;

  height: 50px;
  display: flex;
  align-items: center;
  text-align: center;
}

.btn:hover {
  background-color: var(--primary-color);
  color: var(--secondary-color);
  box-shadow: 0px 2px 10px rgba(255, 255, 255, .5);
  transform: scale(1.05);
}

.important {
  color: var(--accent-color);
}
</style>