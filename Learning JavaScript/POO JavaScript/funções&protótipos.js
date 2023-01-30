//METODOS ANTIGOS PARA LIDAR COM POO
//Usando o "this"
const user = {
    nome: "joan",
    email: "joan@gmail.com",
    nascimento: "03/04/2004",
    cargo: "estudante",
    ativo: true,
    exibirInfos: function () {
        console.log(this.nome, this.email)
    }
}
const teste = user.exibirInfos
const teste2 = teste.bind(user)//Comando bind interliga a função teste com os dados de "user"
teste2()
const admin = {
    nome: "Jonathan",
    email: "jonathan@gmail.com",
    cargo: "admin",
    criarCurso() {
        console.log("Curso criado")
    }
}
Object.setPrototypeOf(admin, user)//Pega os metodos/funções de 'user' e os dão para 'admin'
admin.criarCurso()
admin.exibirInfos()
