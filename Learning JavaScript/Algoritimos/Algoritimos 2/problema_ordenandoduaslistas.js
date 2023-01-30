const {edFolha, edGalho} = require("./arrays1.js")

const arrayjunto = juntaArray(edFolha, edGalho)
console.log(arrayjunto)
function juntaArray(array1, array2){
    let arrayfinal = [];
    let posicaoarray1 = 0;
    let posicaoarray2 = 0;
    let atual = 0;
    while(posicaoarray1 < array1.length && posicaoarray2 < array2.length){
        if(array1[posicaoarray1].preco < array2[posicaoarray2].preco){
            arrayfinal[atual] = array1[posicaoarray1];
            posicaoarray1++;
        }else{
            arrayfinal[atual] = array2[posicaoarray2];
            posicaoarray2++;
        }
        atual++;
    }
    while(posicaoarray1 < (array1.length)){
        arrayfinal[atual] = array1[posicaoarray1];
        posicaoarray1++;
        atual++;
    }
    while(posicaoarray2 < (array2.length)){
        arrayfinal[atual] = array2[posicaoarray2];
        posicaoarray2++;
        atual++;
    }
    return arrayfinal;
}
