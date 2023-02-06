import { useState } from 'react'
import Botao from '../Botão'
import CampoTexto from '../CampoTexto'
import Lista from '../Lista'
import './Formulario.css'
const Formulario = () => {
    const parentescos = [
        'Pais', 'Tios', 'Primos', 'Irmãos', 'Avôs', 'Amigos', 'Amigos da Faculdade', 'Outro'
    ]
    const [nome, setNome] = useState('')//Controlando os estados, o primeiro item da lista
    const [local, setLocal] = useState('')//é responsavel por guardar o valor e o segundo
    const [foto, setFoto] = useState('')//que é uma função, é responsável por atribuir um valor
    const [parentesco, setParentesco] = useState('')
    
    const aoSalvar = (evento) =>{
        evento.preventDefault()
        console.log("Formulário Submetido => ", nome, local, foto, parentesco)
    }
    return (
        <section className='formulario'>
            <form onSubmit={aoSalvar}>
                <h2>Preencha os dados para criar o card de familiar</h2>
                <CampoTexto
                obrigatorio={true} 
                label="Nome"
                placeholder="Digite seu nome" 
                valor={nome}
                aoAlterado={valor => setNome(valor) }
                />

                <CampoTexto 
                obrigatorio={true} 
                label="Localização" 
                placeholder="Digite de onde você é" 
                valor={local}
                aoAlterado={valor => setLocal(valor)}
                />
                <CampoTexto 
                label="Foto" 
                placeholder="Digite o endereço da imagem"
                valor ={foto}
                aoAlterado = {valor => setFoto(valor)}
                />
                
                <Lista  valor={parentesco} aoAlterado={valor => setParentesco(valor)} label='Parentesco' itens={parentescos}/>
                <Botao texto="Criar Card">
                    Criar Card
                </Botao>
            </form>
        </section>
    )
}
export default Formulario