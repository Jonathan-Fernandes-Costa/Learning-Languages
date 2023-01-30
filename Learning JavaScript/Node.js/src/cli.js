#!/usr/bin/env node
import pegaarquivo from "./index.js";
import chalk from "chalk";
import fs from 'fs';
import listaValidada from "./http-validacao.js";
const caminho = process.argv;
async function imprimir(valida, lista, identificador = ''){//Responsavel por imprimir os links
    if(valida){
    console.log(chalk.yellow('Lista Validada'),
    chalk.black.bgGreen(identificador), await listaValidada(lista));
    }else{
        console.log(chalk.yellow('Links: '),
     chalk.black.bgGreen(identificador),
      lista)
    }
    
}
async function processaTexto(argumentos){// Recebe os argumentos do console e retorna e imprime a lista de links com os titulos
    const caminho = argumentos[2];
    const valida = argumentos[3] === '--valida';
    try{
        fs.lstatSync(caminho);//Verifica se é possivel acessar o arquivo/diretorio
    }catch(erro){
        if(erro.code === 'ENOENT'){
            console.log(chalk.red("Arquivo ou diretório não existe!"))
            return;
        }
    }

    if(fs.lstatSync(caminho).isFile()){//Verifica se oque é passado é um arquivo
    const lista = await pegaarquivo(caminho);
    
    imprimir(valida, lista)
    }else if (fs.lstatSync(caminho).isDirectory()){//Verifica se oque é passado é um diretorio
        const arquivos = await fs.promises.readdir(caminho)
        arquivos.forEach(async(nomearquivo) => {
            const lista = await pegaarquivo(`${caminho}/${nomearquivo}`)
            imprimir(valida, lista)
        })
        
    }
    
     
}
processaTexto(caminho)