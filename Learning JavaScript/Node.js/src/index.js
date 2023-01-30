import fs from 'fs';//Biblioteca do Node.js para trabalhar com arquivos
import chalk from "chalk";//Biblioteca para estilizar os resultados do console
function trataerro(erro){
    throw new Error(chalk.red(erro.code, "Arquivo não encontrado!"))//Throw joga os erros no console
}
// Usando then()
/* function pegaarquivo(caminhoArquivo){
    const encoding = 'utf-8';//Tipo de texto que o readfile vai receber
    fs.promises.readFile(caminhoArquivo, encoding)
    .then((texto) => console.log(chalk.blue(texto)))//Código assicrono retorna o resultado
    .catch((erro) => trataerro(erro))//Código assicrono retornando o erro.
} */

// async/await (mais novo), mais simples de converter codigos sincronos em assicronos
async function pegaarquivo(caminhoArquivo){//Função que recebe o caminho do arquivo e retorna os links que estão dentro do arquivo md
    try{
        const encoding = 'utf-8';//Tipo de texto que o readfile vai receber 
        const texto = await fs.promises.readFile(caminhoArquivo, encoding)
        return extraiLinks(texto);
    }catch(erro){
        trataerro(erro)
    }finally{
        console.log(chalk.bgYellow("Operação finalizado"))
    }
}
function extraiLinks(texto){//Função que pega um texto e retorna um aray de objetos com links
    const regex = /href=["|']([http:|https:]?[\/\/]?.*?)["|']/gm;
    const capturas = [...texto.matchAll(regex)]
     const resultados = capturas.map((captura) => captura[1])
    return resultados.length !==0 ? resultados : "Não há links no arquivo";
}
// Expressão Regular para links em markdown: \[([^[\]]*?)\]\((https?:\/\/[^\s?#.].[^\s]*)\)
//Expressão Regular para pegar links de html: href=["|']([http:|https:]?[\/\/]?.*?)["|']
export default pegaarquivo;