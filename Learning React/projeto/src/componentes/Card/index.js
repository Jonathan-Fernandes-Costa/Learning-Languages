import './Card.css'
const Card = ({nome, foto, local}) =>{
    return(<div className='membro'>
        <div className='cabecalho'>
            <img src={foto} alt={nome}/>
        </div>
        <div className='rodape'>
            <h4>{nome}</h4>
            <h5>{local}</h5>
        </div>
    </div>)
}
export default Card;