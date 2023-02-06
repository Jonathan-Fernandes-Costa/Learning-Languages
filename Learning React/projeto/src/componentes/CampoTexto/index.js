import './CampoTexto.css'
const CampoTexto = (props) => {
    //props é o valor que é passado nas propriedade la no app.js
    return (
        <div className="campo-texto">
            <label>{props.label}</label>
            <input placeholder={`${props.placeholder}...`} required={props.obrigatorio}></input>
        </div>
    )
}
export default CampoTexto