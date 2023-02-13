import './Lista.css'

const Lista = (props) => {
    const mudaNome = (nome) => {
        if(nome === 'Família'){
            return('Pai/Mãe/Irmão/Ninick')
        }else if(nome === 'Primos'){
            return('Primo(a)')
        }else if(nome === 'Tios'){
            return('Tio(a)')
        }else if(nome === 'Amigos'){
            return('Amigo(a)')
        }else if(nome === 'Amigos da Faculdade'){
            return('Amigo(a) da Faculdade')
        }else if(nome === 'Outros'){
            return('Outros')
        }
    }
    return (
        <div className='lista'>
            <label>{props.label}</label>
            <select onChange={evento => props.aoAlterado(evento.target.value)} required={props.obrigatorio} value={props.value}>
            {props.itens.map(item => {
                    return <option key={item}>{mudaNome(item)}</option>
                })}
            </select>
        </div>
    )
}
export default Lista