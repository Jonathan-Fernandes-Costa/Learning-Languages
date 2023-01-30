const listaLivros = require("./arrays2.js")

function quickSort(array, esquerda, direita) {//Complexidade> linearxlogaritimica, que é muito mais perfomatica que a
    //de complexidade quadratica como a insertion e select
    //QuickSort é mais rapido que o mergesort na maioria dos casos
    if (array.length > 1) {
        let indiceAtual = particiona(array, esquerda, direita);
        if (esquerda < indiceAtual - 1) {
            quickSort(array, esquerda, indiceAtual - 1);
        }
        if (indiceAtual < direita) {
            quickSort(array, indiceAtual, direita)
        }
    }
    return array;
}

console.log(quickSort(listaLivros, 0, listaLivros.length - 1))
function particiona(array, esquerda, direita) {
    let pivo = array[Math.floor((esquerda + direita) / 2)]
    let atualEsquerda = esquerda; //0
    let atualDireita = direita; //10

    while (atualEsquerda <= atualDireita) {
        while (array[atualEsquerda].preco < pivo.preco) {
            atualEsquerda++
        }

        while (array[atualDireita].preco > pivo.preco) {
            atualDireita--
        }

        if (atualEsquerda <= atualDireita) {
            trocalugar(array, atualEsquerda, atualDireita);
            atualEsquerda++;
            atualDireita--;
        }
    }
    return atualEsquerda;
}

function trocalugar(array, de, para) {
    let valor1 = array[de]
    let valor2 = array[para]
    array[de] = valor2
    array[para] = valor1
}