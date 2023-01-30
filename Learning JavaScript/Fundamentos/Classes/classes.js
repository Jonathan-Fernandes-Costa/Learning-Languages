//Conteudo: aprendendo a estrutura de classes
class Filme {
    constructor(nome, diretor, duracao){
        this.nome = nome
        this.diretor = diretor
        this.duracao = duracao
    }
    AnunciarNome(){
        console.log(`Nome do Filme: ${this.nome}`)
    }
    DescreverFilme(){
        console.log(`Nome do Filme: ${this.nome}
Diretor do Filme: ${this.diretor}
Duração do Filme: ${this.duracao}`)
    }
}
const Batman = new Filme("Batman", "???", 120)
Batman.AnunciarNome()
Batman.DescreverFilme()