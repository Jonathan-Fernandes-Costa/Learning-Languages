//Função para encontrar o menor valor
function menorvalor(array, chave){
    let x = chave
    for(let i = chave; i < (array.length); i++){ 
        if(array[i].preco < array[x].preco){
            x = i
        }
    }
    return x;
}
//Funcão de troca
function trocaSelec(array, key){
    let menor = menorvalor(array, key)
    itemAtual = array[key];
    itemBaixo = array[menor]
    array[key] = itemBaixo
    array[menor] = itemAtual
}
module.exports = trocaSelec;