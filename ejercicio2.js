// https://www.codewars.com/kata/52b757663a95b11b3d00062d
// Weird String Cases

function toWeirdCase(string) {
  return string
    .split(" ")
    .map((word) => {
      return word
        .split("")
        .map((char, index) =>
          index % 2 === 0 ? char.toUpperCase() : char.toLowerCase()
        )
        .join("");
    })
    .join(" ");
}
