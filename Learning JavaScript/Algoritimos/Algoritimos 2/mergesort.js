const listalivros = require("./arrays2.js")
console.log(listalivros)
function mergesort(array){//Complexidade> linearxlogaritimica, que é muito mais perfomatica que a
    //de complexidade quadratica como a insertion e select
    
    if(array.length > 1){
        let meio = Math.floor(array.length/2)
        let array1 = mergesort(array.slice(0, meio))
        let array2 = mergesort(array.slice(meio, array.length))
        array = ordena(array1, array2)
    }
    return array;
    
}
function ordena(array1, array2){
    let posicaoarray1 = 0;
    let posicaoarray2 = 0;
    let arrayordenando = [];
    while(posicaoarray1 < array1.length && posicaoarray2 < array2.length){
        let valorarray1 = array1[posicaoarray1]
        let valorarray2 = array2[posicaoarray2]
        if(valorarray1.preco < valorarray2.preco){
            arrayordenando.push(valorarray1)
            posicaoarray1++
        }else{
            arrayordenando.push(valorarray2)
            posicaoarray2++
        }
    }
    return arrayordenando.concat(posicaoarray1 < (array1.length) ? array1.slice(posicaoarray1) : array2.slice(posicaoarray2) )
}
console.log(mergesort(listalivros));