const notas = [10, 6, 8];
let soma = 0
notas.push(7)//adiciona um valor no final do array
console.log(notas)
for(let a = 0; a < notas.length; a++){
    soma += notas[a] 
}
const media = (soma/notas.length)
console.log(media)