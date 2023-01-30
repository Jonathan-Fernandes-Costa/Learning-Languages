
function trocaInsert(array, key){
    itemAtual = array[key];
    itemBaixo = array[(key - 1)]
    array[key] = itemBaixo
    array[(key - 1)] = itemAtual
}
module.exports = trocaInsert;