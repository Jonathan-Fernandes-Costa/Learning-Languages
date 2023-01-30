const notas = [10, 6.5, 8, 7.5];
let soma = 0
for (let a = 0; a < notas.length; a++){
    soma += notas[a]

}
const media = (soma/notas.length)
console.log(media)
const arrayOriginal = ["Maria", "Carlos", "Eduardo", "Samanta"]
const arrayConcat = arrayOriginal.concat("André", "Fernanda")

console.log(arrayConcat)
console.log(arrayOriginal)