const livros = require("./complemento_problema1.js")
const trocaSelec = require("./trocaselec.js")
const trocaInsert = require("./trocainsert.js")
//Ordenando SelectionSort> Complexidade do Algoritimo: é um algoritimo quadradico, logo vai crescendo o 
//numero de processo exponencialmente
function ordenaprecoSelec(array){
    let arrayclone = array.slice();
    for(let i = 0; i < (arrayclone.length); i++){
        trocaSelec(arrayclone, i)
    }
    return arrayclone;
}
const livrosordenadosSelec = ordenaprecoSelec(livros)
console.log(livros)
console.log(`Os livros ordenados do mais barato para o mais caro com Select: 
`)
console.log(livrosordenadosSelec)
//Ordenando InsertionSort > Complexidade do Algoritimo: Algoritimo quadratico
function ordenaprecoInsert(array){
    let arrayclone = array.slice()
    for(let i = 0; i < (arrayclone.length); i++){
        let atual = i;
        while(atual > 0 && arrayclone[atual].preco < arrayclone[atual-1].preco){
            trocaInsert(arrayclone, atual)
            atual--;
        }
    }
    return arrayclone
}
let livrosordenadosInsert = ordenaprecoInsert(livros);
console.log(`Os livros ordenados do mais barato para o mais caro com Insert: 
`)
console.log(livrosordenadosInsert)

