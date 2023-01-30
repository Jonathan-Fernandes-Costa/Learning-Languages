//Estrutura das classes:
export default class User {
    #nome//Definindo nome como um atributo privado, que não pode ser mudado com "#"
    #email
    #nascimento
    #cargo
    #ativo
    constructor(nome, email, nascimento, cargo, ativo = true){
        this.#nome = nome
        this.#email = email
        this.#nascimento = nascimento
        this.#cargo = cargo || 'estudante'
        this.#ativo = ativo
    }
    get nome(){//Usando o get para pegar os atributos privados
        return this.#nome;
    }
    get email(){
        return this.#email;
    }
    get nascimento(){
        return this.#nascimento;
    }
    get cargo(){
        return this.#cargo;
    }
    get ativo(){
        return this.#ativo;
    }
    set email(novoemail){//Set permite fazer alterações
        if(novoemail === ''){
            throw new Error("O campo email não pode estar vazio")
        }
        this.#email = novoemail
    }
    exibirInfos() {
        return `${this.nome}, ${this.email}, ${this.nascimento}, ${this.cargo}, ${this.ativo}`
    }
    
}