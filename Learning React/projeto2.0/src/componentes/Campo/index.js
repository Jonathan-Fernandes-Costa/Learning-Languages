import './Campo.css'
const Campo = ({obrigatorio, label, placeholder, valor, aoAlterado, tipo = 'text'}) => {
    //é o valor que é passado nas propriedade la no app.js
    
    
    const AoDigitar = (evento) =>{
        aoAlterado(evento.target.value) //Pega os valores que estão sendo digitados
    }
    return (
        <div className={`campo campo-${tipo}`}>
            <label>{label}</label>
            <input 
                type={tipo} 
                value={valor} 
                onChange={AoDigitar} 
                placeholder={`${placeholder}...`} 
                required={obrigatorio}>
            </input>
        </div>
    )
}
export default Campo