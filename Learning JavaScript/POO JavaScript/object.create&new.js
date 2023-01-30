//METODOS ANTIGOS PARA LIDAR COM POO
function User(nome, email){//Criando a classe USER
    this.nome = nome
    this.email = email

    this.exibirInfos = function(){
        return `${this.nome}, ${this.email}`
    }
}

const novousuario = new User("Antonio", "Antonigo@gmail.com")//Criando Objeto Usando construtor
console.log(novousuario.exibirInfos())


//Segundo metodo
function Admin(cargo){
    User.call(this, "Marques", "marques@gmail.com")
    this.cargo = cargo || "estudante"
}

Admin.prototype = Object.create(User.prototype)//Passando as propriedades de USER para Admin
const novousuario2 = new Admin("Admin")
console.log(novousuario2.exibirInfos())
console.log(novousuario2.cargo)
//Terceiro metodo
const user = {
    init: function(nome, email){
        this.nome = nome
        this.email = email
    },
    exibirInfos: function(){
        return `${this.nome}, ${this.email}`
    }
}
const novousuario3 = Object.create(user)
novousuario3.init("Joaquin", "Joaquin@gmail.com")
console.log(novousuario3.exibirInfos())