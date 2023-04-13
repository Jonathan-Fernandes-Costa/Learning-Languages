import './Botao.css'
const Botao = ({apagar, texto, tipo="normal"}) => {
   return(
       <button onClick={tipo==="topo" ? apagar : null} className={`botao botao-${tipo}`}>{texto}</button>
      )
}
export default Botao