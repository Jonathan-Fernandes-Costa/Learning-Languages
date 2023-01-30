import autores from "../models/Autor.js"

class AutorController {
    static listarAutores = (req, res) => {
        autores.find((err, autores) => {
            res.status(200).json(autores)
        })
    }
    static listarAutorid = (req, res) => {
        const id = req.params.id
        autores.findById(id, (err, autores) => {
            if(err){
                res.status(404).send({message: `${err.message} - Autor não encontrado`})
            }else{
                res.status(200).send(autores)
            }
        })
    }
    static cadastrarAutor = (req, res) => {
        let autor = new autores(req.body);//Criando o Autor
        autor.save((err) => {//salvando no Banco de dados
            if(err){
                res.status(500).send({message: `${err.message} - falha ao cadastrar o Autor`})
            }else{
                res.status(201).send(autor.toJSON())//Retornando o Autor criado
            }
        })
        
    }
    static atualizarAutor = (req, res) => {
        const id = req.params.id;
        autores.findByIdAndUpdate(id, {$set: req.body}, (err) => {
            if(err){
                res.status(500).send({message: `${err.message} - falha ao atualizar Autor`})
            }else{
                res.status(200).send("Autor atualizado")
            }
        })
    }
    static deletarAutor = (req, res) => {
        const id = req.params.id;
        autores.findByIdAndDelete(id, (err) => {
            if(err){
                res.status(500).send({message: `${err.message} - falha ao deletar o Autor`})
            }else{
                res.status(200).send("Autor Deletado")
            }
        })
    }
}

export default AutorController;