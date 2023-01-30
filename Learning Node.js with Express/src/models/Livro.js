import mongoose from "mongoose";
//Criando o modelo do banco de dados
const livroSchema = new mongoose.Schema(
    {
        id: {type: String},
        titulo: {type: String, required: true},
        autor: {type: mongoose.Schema.Types.ObjectId, ref: "autores", required: true},//Associando os dados entre os Schemas
        editora: {type: mongoose.Schema.Types.ObjectId, ref: "editoras", required: true},
        numpags: {type: Number}
    }
)
const livros = mongoose.model('livros', livroSchema)
export default livros