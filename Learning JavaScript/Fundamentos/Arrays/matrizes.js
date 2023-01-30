const alunos = ["Kaio", "André", "Mario", "Juliana"]
const notas = [10, 5, 8, 7]
const sala = [alunos, notas]
console.log(sala)
console.log(`O aluno : ${sala[0][2]} tirou ${sala[1][2]} na prova`)
function ProcuraAluno(aluno){
    if(sala[0].includes(aluno)){
        console.log(`O aluno ${aluno} está cadastrado`)
        const indice = sala[0].indexOf(aluno)
        const notaaluno = sala[1][indice]
        console.log(`e tem a nota: ${notaaluno}`)
    }else{
        console.log(`O aluno ${aluno} não está cadastrado`)
    }
}
ProcuraAluno("Kaio")