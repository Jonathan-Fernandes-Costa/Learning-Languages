import livros from "../models/Livro.js"

class LivroController {
    static listarLivros = (req, res) => {
        livros.find()
            .populate("autor")//Associando dados entre Schema, nessa linha estou populando o campo autor
            .populate("editora")
            .exec((err, livros) => {//Execute tal codigo
            res.status(200).json(livros)
        })
        
    }
    static listarLivroid = (req, res) => {
        const id = req.params.id
        livros.findById(id)
            .populate("autor", "nome")//Nessa linha estou populando o campo autor e dizendo que quero receber apenas o nome
            .populate("editora")
            .exec((err, livros) => {
            if(err){
                res.status(404).send({message: `${err.message} - Livro não encontrado`})
            }else{
                res.status(200).send(livros)
            }
        })
        
        
    }
    static listarLivroTitulo = (req, res) => {
        const titulo = req.query.titulo
        livros.find({"titulo": titulo})
        .populate("autor")
        .populate("editora")
        .exec((err, livros) => {
            res.status(200).json(livros)
        })
    }
    static cadastrarLivro = (req, res) => {
        let livro = new livros(req.body);//Criando o livro
        livro.save((err) => {//salvando no Banco de dados
            if(err){
                res.status(500).send({message: `${err.message} - falha ao cadastrar o livro`})
            }else{
                res.status(201).send(livro.toJSON())//Retornando o livro criado
            }
        })
        
    }
    static atualizarLivro = (req, res) => {
        const id = req.params.id;
        livros.findByIdAndUpdate(id, {$set: req.body}, (err) => {
            if(err){
                res.status(500).send({message: `${err.message} - falha ao atualizar livro`})
            }else{
                res.status(200).send("Livro atualizado")
            }
        })
    }
    static deletarLivro = (req, res) => {
        const id = req.params.id;
        livros.findByIdAndDelete(id, (err) => {
            if(err){
                res.status(500).send({message: `${err.message} - falha ao deletar o livro`})
            }else{
                res.status(200).send("Livro Deletado")
            }
        })
    }
}//20230000549205
//Jojonick

export default LivroController;