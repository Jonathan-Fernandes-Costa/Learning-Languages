import './CampoTexto.css'
const CampoTexto = (props) => {
    //props é o valor que é passado nas propriedade la no app.js
    
    
    const AoDigitar = (evento) =>{
        props.aoAlterado(evento.target.value) //Pega os valores que estão sendo digitados
    }
    return (
        <div className="campo-texto">
            <label>{props.label}</label>
            <input value={props.valor} onChange={AoDigitar} placeholder={`${props.placeholder}...`} required={props.obrigatorio}></input>
        </div>
    )
}
export default CampoTexto