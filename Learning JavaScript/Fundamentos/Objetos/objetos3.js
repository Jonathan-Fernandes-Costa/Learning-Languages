//Conteudo: Objetos em Objetos, Listas de Objetos, Funções dos Objetos, For in
const cliente = {//Objeto Literal
    name: "Jonathan",
    email: "jonathan@gmail.com",
    saldo: 50,
    familia: [{
        nome: "Margarida",
        idade: 40,
        email: "margarida@gmail.com",
        parentesco: "Mãe",
        saldo: 100,
        depositar: function (valor) {
            this.saldo += valor
        },
        sacar: function (valor) {
            this.saldo -= valor
        }
    }, {
        nome: "Joan",
        idade: 12,
        email: "joan@gmail.com",
        parentesco: "Irmão"
    }, {
        nome: "José",
        idade: 40,
        email: "jose@gmail.com",
        parentesco: "Pai"
    }],
    depositar: function (valor) {
        this.saldo += valor
    },
    sacar: function (valor) {
        this.saldo -= valor
    }
}
let tamanhofamilia = cliente.familia.length
console.log("Tamanho familia é: " + tamanhofamilia)
//Fazendo um relatorio com  For in
console.log("Relatório: ")
let relatorio = ""
for (let info in cliente) {//Pega as chaves das propriedades do objeto, exemplo: nome, email
    if (typeof (cliente[info]) === "function" || typeof (cliente[info]) === "object") {
        continue
    } else {
        relatorio += `
    ${info} =>> ${cliente[info]}`
    }
}
console.log(`${relatorio}
`)
//Verificando se existe uma informação no objeto:
let veridependente = Object.keys(cliente)
if (veridependente.includes("familia")) {
    console.log(`O cliente ${cliente.name} tem dependentes
    `)
} else {
    console.log(`O cliente ${cliente.name} não tem dependentes
    `)
}
//Usando os metodos Object.
let key = Object.keys(cliente)//Object.keys retorna uma lista de todas as propriedades do objeto
let values = Object.values(cliente)//Object.values retorna uma lista com o valor que esta contido na propriedades do objeto
let entries = Object.entries(cliente)//Object.entries retorna uma lista com as propriedades seguidas do valor do objeto
console.log(`Keys : ${key}
Values: ${values}
Entries: ${entries}
`)

//Fazendo uma lista de dependentes espalhando-as
const clientes = [{//Objeto Literal
    name: "Jonathan",
    email: "jonathan@gmail.com",
    saldo: 50,
    familia: [{
        nome: "Margarida",
        idade: 40,
        email: "margarida@gmail.com",
        parentesco: "Mãe",
        saldo: 100,
        depositar: function (valor) {
            this.saldo += valor
        },
        sacar: function (valor) {
            this.saldo -= valor
        }
    }, {
        nome: "Joan",
        idade: 12,
        email: "joan@gmail.com",
        parentesco: "Irmão"
    }, {
        nome: "José",
        idade: 40,
        email: "jose@gmail.com",
        parentesco: "Pai"
    }],
    depositar: function (valor) {
        this.saldo += valor
    },
    sacar: function (valor) {
        this.saldo -= valor
    }
}

]
const ListaDependentes = [...cliente.familia]
console.log(ListaDependentes)
console.log(cliente.familia)
