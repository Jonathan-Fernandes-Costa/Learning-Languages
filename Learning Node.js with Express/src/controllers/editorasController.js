import editoras from "../models/Editora.js"

class EditoraController {
    static listarEditoras = (req, res) => {
        editoras.find((err, editoras) => {
            res.status(200).json(editoras)
        })
    }
    static listarEditoraid = (req, res) => {
        const id = req.params.id
        editoras.findById(id, (err, editoras) => {
            if(err){
                res.status(404).send({message: `${err.message} - Editora não encontrado`})
            }else{
                res.status(200).send(editoras)
            }
        })
    }
    static cadastrarEditora = (req, res) => {
        let editora = new editoras(req.body);//Criando o Editora
        editora.save((err) => {//salvando no Banco de dados
            if(err){
                res.status(500).send({message: `${err.message} - falha ao cadastrar o Editora`})
            }else{
                res.status(201).send(editora.toJSON())//Retornando o Editora criado
            }
        })
        
    }
    static atualizarEditora = (req, res) => {
        const id = req.params.id;
        editoras.findByIdAndUpdate(id, {$set: req.body}, (err) => {
            if(err){
                res.status(500).send({message: `${err.message} - falha ao atualizar Editora`})
            }else{
                res.status(200).send("Editora atualizado")
            }
        })
    }
    static deletarEditora = (req, res) => {
        const id = req.params.id;
        editoras.findByIdAndDelete(id, (err) => {
            if(err){
                res.status(500).send({message: `${err.message} - falha ao deletar o Editora`})
            }else{
                res.status(200).send("Editora Deletado")
            }
        })
    }
}

export default EditoraController;