import './Lista.css'

const Lista = (props) => {
    return (
        <div className='lista'>
            <label>{props.label}</label>
            <select onChange={evento => props.aoAlterado(evento.target.value)} required={props.obrigatorio} value={props.valor}>
                {props.itens.map(item => <option key={item}>{item}</option>)}
            </select>
        </div>
    )
}
export default Lista