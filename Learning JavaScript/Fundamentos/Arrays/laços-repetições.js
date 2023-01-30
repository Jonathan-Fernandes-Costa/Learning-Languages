//Forma antiga
/*const notas = [5,10,3,8,7]
let soma = 0
for(let a = 0; a < notas.length; a++){
    soma += notas[a];
}
const media= soma/notas.length
console.log(media)*/
const notas = [5,10,3,8,7]
let soma = 0
for(let elemento of notas){//Para cada elemento de notas execute o codigo:
    soma += elemento
}
const media= soma/notas.length
console.log(media)
