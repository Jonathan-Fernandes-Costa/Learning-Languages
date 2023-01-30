//Conteudo: Interagindo com JSON e Manipulando dados JSON
const teste = require("./cliente.json");//pegando os dados do arquivo "cliente.json"
console.log(teste)

const jsonemstring = JSON.stringify(teste)// transformando JSON em string
console.log(jsonemstring)

const objetojson = JSON.parse(jsonemstring);//Transformando uma string em JSON 
console.log(objetojson)


const objetos = require("./cliente2.json");

//Encontrando objetos:
function encontrarinobjeto (listadeobjetos, chave, valor){
    return listadeobjetos.find((item) => { for(let info in item[chave]){
        return item[chave][info] === valor;
    }});
}
function encontrar(listadeobjetos, chave, valor){
    return listadeobjetos.find((item) => item[chave] === valor)
}
function encontrararray(listadeobjetos, chave, valor){
    return listadeobjetos.find((item) => item[chave].includes(valor))
}
const encontrado = encontrar(objetos, "nome", "Juliet")
const arrayencontrado = encontrararray(objetos, "telefone", "9466883489")
const objetoencontrado = encontrarinobjeto(objetos, "endereco", "Rua Karstens");
console.log(encontrado)
console.log(arrayencontrado)
console.log(objetoencontrado)