import React, {useState} from 'react'
import Botao from '../Botão'
import Campo from '../Campo'
import Lista from '../Lista'
import './Formulario.css'
const Formulario = (props) => {
    const [nome, setNome] = useState('')//Controlando os estados, o primeiro item da lista
    const [local, setLocal] = useState('')//é responsavel por guardar o valor e o segundo
    const [foto, setFoto] = useState('')//que é uma função, é responsável por atribuir um valor
    const [parentesco, setParentesco] = useState('')
    const [nomeTime, setNomeTime] = useState('')
    const [corTime, setCorTime] = useState('')

    const aoSalvarTime = (evento) =>{
        evento.preventDefault()
        props.cadastrarTime({
            nome : nomeTime,
            cor: corTime
        })
        setNomeTime('')
        setCorTime('')
    }
    const aoSalvar = (evento) => {
        evento.preventDefault()
        props.aoMembroCadastrada({
            nome,
            local,
            foto,
            parentesco
        })
        setNome('')
        setLocal('')
        setFoto('')
        setParentesco('')
    }
    return (
        <section className='formulario'>
            <form onSubmit={aoSalvar}>
                <h2>Preencha os dados para criar o card de membro</h2>
                <Campo
                    obrigatorio={true}
                    label="Nome"
                    placeholder="Digite seu nome"
                    valor={nome}
                    aoAlterado={valor => setNome(valor)}
                />

                <Campo
                    obrigatorio={true}
                    label="Localização"
                    placeholder="Digite de onde você é"
                    valor={local}
                    aoAlterado={valor => setLocal(valor)}
                />
                <Campo
                    obrigatorio={true}
                    label="Foto"
                    placeholder="Digite o endereço da imagem"
                    valor={foto}
                    aoAlterado={valor => setFoto(valor)}
                />

                <Lista
                    obrigatorio={true}
                    label='Afinidade' 
                    itens={props.times}
                    valor={parentesco} 
                    aoAlterado={valor => setParentesco(valor)} 
                 />
                <Botao texto="Criar Card"/>
            </form>
            <form onSubmit={aoSalvarTime}>
                <h2>Preencha os dados para criar uma nova afinidade</h2>
                <Campo
                    obrigatorio={true}
                    label="Nome"
                    placeholder="Digite o nome da afinidade"
                    valor={nomeTime}
                    aoAlterado={valor => setNomeTime(valor)}
                />

                <Campo
                    tipo="color"
                    obrigatorio={true}
                    label="Cor"
                    placeholder="Digite a cor"
                    valor={corTime}
                    aoAlterado={valor => setCorTime(valor)}
                />
                <Botao texto="Criar time" />
            </form>
        </section>
    )
}
export default Formulario