<script setup>
import { ref, onMounted } from 'vue';
import axios from 'axios';
import ListaAlumnos from './components/ListaAlumnos.vue';

const estudiantes = ref([]);
const respuesta = ref(null);
const nota1 = ref(1);
const nota2 = ref(1);
const nota3 = ref(1);
const nota4 = ref(1);
const nota5 = ref(1);
const nota6 = ref(1);

const fetchEstudiantes = async () => {
  try {
    const response = await axios.get('http://localhost:3000/Estudiante');
    estudiantes.value = response.data;
    console.log(response);
    console.log(response.data);
  } catch (error) {
    console.error('Error fetching estudiantes:', error);
  }
};

onMounted(() => {
  fetchEstudiantes();
});

const validarNotas = (notas) => {
  return notas.every(nota => nota >= 1.0 && nota <= 7.0);
};

const calcularPromedio = (notas) => {
  let suma = 0;
  suma += notas[0] * 0.2;
  suma += notas[1] * 0.2;
  suma += notas[2] * 0.2;
  suma += notas[3] * 0.2;
  suma += notas[4] * 0.1;
  suma += notas[5] * 0.1;

  return suma;
};

const procesar = () => {
  const notas = [nota1.value, nota2.value, nota3.value, nota4.value, nota5.value, nota6.value];
  if (validarNotas(notas)) {
    respuesta.value = calcularPromedio(notas).toFixed(2);
  } else {
    respuesta.value = 'Las notas deben ser del 1.0 al 7.0';
  }
};
</script>

<template>
  <div class="app-body ">
    <span>Nota 1: </span>
    <input v-model.number="nota1" type="number" step="0.1" min="1.0" max="7.0" />
    <span>Nota 2: </span>
    <input v-model.number="nota2" type="number" step="0.1" min="1.0" max="7.0" />
    <span>Nota 3: </span>
    <input v-model.number="nota3" type="number" step="0.1" min="1.0" max="7.0" />
    <span>Nota 4: </span>
    <input v-model.number="nota4" type="number" step="0.1" min="1.0" max="7.0" />
    <span>Nota 5: </span>
    <input v-model.number="nota5" type="number" step="0.1" min="1.0" max="7.0" />
    <span>Nota 6: </span>
    <input v-model.number="nota6" type="number" step="0.1" min="1.0" max="7.0" />
    <button style="background-color: hsla(160, 100%, 37%, 1); border: none;" @click="procesar">
      Calcular Promedio
    </button>
    <p style="background-color: hsla(160, 100%, 37%, 1); color: black;">{{ respuesta }}</p>
  </div>
  <div class="seccion-alumnos">
    <ListaAlumnos :arrayEstudiantes="estudiantes"></ListaAlumnos>
  </div>
</template>

<style scoped>
.seccion-alumnos {
  margin-top: 20px;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 8px;
  background-color: #3a3a3a;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.center {
  box-sizing: border-box;
  margin: 0;
  padding: 0;
  display: flex;
  justify-content: center;
  align-items: center;

}

.app-body {
  display: grid;
  grid-template-columns: 1fr 1fr;
}

button {
  max-width: min-content;
}
</style>
