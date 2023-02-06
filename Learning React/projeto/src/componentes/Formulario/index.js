import Botao from '../Botão'
import CampoTexto from '../CampoTexto'
import Lista from '../Lista'
import './Formulario.css'
const Formulario = () => {
    const parentescos = [
        'Pais', 'Tios', 'Primos', 'Irmãos', 'Avôs', 'Amigos', 'Amigos da Faculdade', 'Outro'
    ]

    const aoSalvar = (evento) =>{
        evento.preventDefault()
        console.log("Salvou")
    }
    return (
        <section className='formulario'>
            <form onSubmit={aoSalvar}>
                <h2>Preencha os dados para criar o card de familiar</h2>
                <CampoTexto obrigatorio={true} label="Nome" placeholder="Digite seu nome" />
                <CampoTexto obrigatorio={true} label="Localização" placeholder="Digite de onde você é" />
                <CampoTexto label="Foto" placeholder="Digite o endereço da imagem" />
                <Lista label='Parentesco' itens={parentescos}/>
                <Botao texto="Criar Card">
                    Criar Card
                </Botao>
            </form>
        </section>
    )
}
export default Formulario