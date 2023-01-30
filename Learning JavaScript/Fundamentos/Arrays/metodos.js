const notas = [10, 6, 8 ,5.5, 10]
const notas2 = [3, 3, 3, 3]
console.log("Array inicial: "+notas)
notas.pop();//remove o ultimo elemento do array
console.log("Removendo o elemento 10: "+notas)
notas.push(7)
console.log(`Adicionando o elemento 7 ${notas}`)//Adiciona um elemento no final do array
const todasnotas = notas.concat(notas2)//Juntando dois arrays"O array nota fica atras"
console.log("Array concatenado: "+ todasnotas)
const notasaltas = todasnotas.filter(nota => nota >= 7)//Filtrando notas altas com .filter
console.log("Notas >= a 7: "+ notasaltas)
const primeiranotabaixa = todasnotas.find(nota => nota < 7)//Retorna a primeira nota abaixo de 7
const primeiranotaabaixoid = todasnotas.findIndex(nota => nota < 7)//Retorna o index da primeira nota abaixo de 7
console.log(`Primeira nota abaixo da media: ${primeiranotabaixa} prova de numero: ${primeiranotaabaixoid+1}`)
//Somando um a todos os elementos do array com foreach() e depois printando 
console.log("Todos os elementos somados a 1")
todasnotas.forEach(teste)
function teste (element, index, array){
    element++
    console.log(element)
}
todasnotas.shift()//retira o primerio elemento do array
console.log("Array removido o primeiro elemento: "+ todasnotas)
todasnotas.unshift(8.6)//Adiciona um elemento no primeiro indice do arrauy
console.log("Array adicionando um novo elemento no começo: "+ todasnotas)
somareduce = todasnotas.reduce((accumulador , nota) => nota+accumulador)//Somando as notas com reduce
console.log("Soma das notas é: "+somareduce)
//Existe o ReduceRight que começa da direta
todasnotas.reverse()//invertendo a ordem do array
console.log("Array invertido: "+todasnotas)
todasnotas.reverse()
const copiaarray = todasnotas.slice(0,3)//copiando as 3 primeiras notas
console.log("Array com as 3 primeiras notas: "+copiaarray)
todasnotas.splice(0,3, 10, 10, 10)//Mudando as 3 primeiras notas para 10
console.log("Array com as 3 primeiras notas mudadas para 10: "+todasnotas)