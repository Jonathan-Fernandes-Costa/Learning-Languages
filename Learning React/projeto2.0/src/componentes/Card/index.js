import {AiFillCloseCircle} from 'react-icons/ai'//importando o icone da biblioteca REact icons
import './Card.css'
const Card = ({nome, foto, local, corDeFundo, aoDeletar}) =>{//forma diferente de usar props
    return(<div className='membro'>
        <AiFillCloseCircle size={25} className='deletar' onClick={aoDeletar}/>
        <div className='cabecalho' style={{backgroundColor: corDeFundo}}>
            <img src={foto} alt={nome}/>
        </div>
        <div className='rodape'>
            <h4>{nome}</h4>
            <h5>{local}</h5>
        </div>
    </div>)
}
export default Card;