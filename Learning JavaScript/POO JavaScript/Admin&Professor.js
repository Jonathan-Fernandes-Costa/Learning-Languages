import User from "./User.js"
//Classe admin é uma extensão da classe User, logo ela herda todas as propriedades da classe User
//User é uma super classe, e Admin é uma sub classe de User
class Admin extends User {
    constructor(nome, email, nascimento, cargo = "admin", ativo = true){
        super(nome, email, nascimento, cargo, ativo)//Traz as propriedades de User
    }
    criarTurma(nomedaTurma, vagas){
        return `Turma: ${nomedaTurma}, quantidade de vagas: ${vagas}`
    }
}
class Professor extends User{
    constructor(nome, emai, nascimento, cargo = "professor", ativo = true){
        super(nome, emai, nascimento, cargo, ativo)
    }

    criarAula(horario, materia){
        return `Aula de ${materia}, no horário: ${horario}, agendada`
    }
    darNota(nomeDoALuno, nota){
        return `O aluno ${nomeDoALuno}, tirou ${nota} `
    }
}

export {Admin, Professor}