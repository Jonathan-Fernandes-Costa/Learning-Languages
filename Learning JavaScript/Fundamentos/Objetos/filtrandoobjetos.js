const objetos = require("./clientes2.json");

function filtrarApartamentoSemComplemento(listadeobjetos){
    return listadeobjetos.filter((objeto) => {
        return objeto.endereco.apartamento && !objeto.endereco.hasOwnProperty("complemento")
    })
}//hasOwnProperty verifica se o objeto tem a propriedade "complemento"
const filtrados = filtrarApartamentoSemComplemento(objetos)
console.log(filtrados)