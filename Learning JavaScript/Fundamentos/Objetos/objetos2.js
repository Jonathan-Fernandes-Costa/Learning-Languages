//Conteudo: Objetos em Objetos, Listas de Objetos e Funções dos Objetos
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
            if (valor > this.saldo) {
                console.log("Saldo insuficiente")
            } else {
                this.saldo -= valor
                console.log(`Pagamento realizado, saldo atual: ${this.saldo}`)
            }
        }

    }],
    depositar: function (valor) {
        this.saldo += valor
    },
    sacar: function (valor) {
        if (valor > this.saldo) {
            console.log("Saldo insuficiente")
        } else {
            this.saldo -= valor
            console.log(`Pagamento realizado, saldo atual: ${saldo}`)
        }
    }
}
console.log("Objeto sem toda a familia e sem deposito/saque: ")
console.log(cliente)

//Adicionando familiares
cliente.familia.push({
    nome: "Joan",
    idade: 12,
    email: "joan@gmail.com",
    parentesco: "Irmão"
}, {
    nome: "José",
    idade: 40,
    email: "jose@gmail.com",
    parentesco: "Pai"
})
//Verificando familiares maiores de idade
const FamiliaresVelhos = cliente.familia.filter((pessoa) => {
    return pessoa.idade >= 18;
})
console.log("Familiares maiores de idade: ")
console.log(FamiliaresVelhos)
//FAzendo saques/depositos
cliente.depositar(25)
cliente.familia[0].sacar(25)
console.log("Objeto com toda a familia e com deposito/saque: ")
console.log(cliente)
//Criando um outro objeto igual
const cliente2 = Object.create(cliente)
console.log("Printando o cliente 2: ")
console.log(cliente2)