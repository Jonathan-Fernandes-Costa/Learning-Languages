const notas = [10, 6.5, 8, 7.5]
console.log(`As notas são: ${notas}`)
//ForEach
let soma = 0
notas.forEach((nota) => {//para cada elemento do array notas faça o seguinte codigo: 
    soma += nota
})
const media = soma/notas.length
console.log(`A media é : ${media}`)

//Map
const notassomadas = notas.map((nota) => {
    return (nota + 1 >= 10 ? nota : nota + 1 )
})
console.log(`As notas com um ponto a mais é: ${notassomadas}`)

//Filter
const alunos = ['Ana', 'Marcos', 'Maria', 'Mauro']
const mediaalunos = [7, 4.5, 8, 7.5]
const reprovados = alunos.filter((_, indice) => {
   return mediaalunos[indice] < 7
})
console.log(`Alunos reprovados: ${reprovados}`)

//Reduce
//fazendo a soma das notas com reduce
let somareduce = notas.reduce((accumulator, nota) => {
    return accumulator += nota
}, 0)
console.log(`A soma das notas com reduce é: ${somareduce}`)

//spread Operator
//clonando um array com spread operator, pois se fizermos array1 = array2, eles irão ficar com o mesmo endereço de memória
//const notas2 = notas forma errada
const notas2 = [...notas]
notas2.push(10)
notas2.splice(0,1,9.8)
console.log(`As notas atualizadas com spread são: ${notas2}`)
console.log(`As notas antigas continuam sendo: ${notas}`)