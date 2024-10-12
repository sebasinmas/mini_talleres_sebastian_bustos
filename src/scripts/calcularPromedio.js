export function calcularPromedio(notas) {
  let n1, n2, n3, n4, n5, n6
  n1 = (parseFloat(notas[0].value) * 20) / 100
  n2 = (parseFloat(notas[1].value) * 20) / 100
  n3 = (parseFloat(notas[2].value) * 20) / 100
  n4 = (parseFloat(notas[3].value) * 20) / 100
  n5 = (parseFloat(notas[4].value) * 10) / 100
  n6 = (parseFloat(notas[5].value) * 10) / 100
  const resultado = (n1 + n2 + n3 + n4 + n5 + n6).toFixed(2)
  return resultado
}
