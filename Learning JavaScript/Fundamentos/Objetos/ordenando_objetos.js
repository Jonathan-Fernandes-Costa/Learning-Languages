const objetos = require("./cliente2.json")

function ordenar(listadeobjetos, chave){
    const result = listadeobjetos.sort((a,b) =>
    {
        if(a[chave] > b[chave]){
            return  1
        }
        if(a[chave] < b[chave]){
            return -1
        }
        return 0;
    })
    return result
}
const ordenandoNome = ordenar(objetos, "nome")
const ordenandotelefone = ordenar(objetos, "telefone")
console.log( `Ordenando nome:
`)
console.log(ordenandoNome)
console.log( `



Ordenando telefone:
`


)
console.log(ordenandotelefone)
