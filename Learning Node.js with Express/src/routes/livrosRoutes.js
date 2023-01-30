import express from "express";
import LivroController from "../controllers/livrosController.js";

const router = express.Router();
router
    .get("/livros", LivroController.listarLivros)
    .get("/livros/busca", LivroController.listarLivroTitulo)//Tem que ser na ordem do mais especifico para o menos especifico
    .get("/livros/:id", LivroController.listarLivroid)
    .post("/livros", LivroController.cadastrarLivro)
    .put("/livros/:id", LivroController.atualizarLivro)
    .delete("/livros/:id", LivroController.deletarLivro)
export default router;