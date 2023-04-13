import {AiFillCloseCircle, AiFillHeart, AiOutlineHeart} from 'react-icons/ai'//importando o icone da biblioteca REact icons
import './Card.css'
const Card = ({ id ,nome, foto, desc, corDeFundo, aoDeletar, favorito, aoFavoritar}) =>{//forma diferente de usar props
    function favoritar(){
        aoFavoritar(id)
    }
    return(<div className='membro'>
        
        <AiFillCloseCircle
            size={25} 
            className='deletar' 
            onClick={() => aoDeletar(id)}
        />
        <div className='cabecalho' style={{backgroundColor: corDeFundo}}>
            <img src={foto} alt={nome}/>
        </div>
        <div className='rodape'>
            <h4>{nome}</h4>
            <h5>{desc}</h5>
            <div className='favoritar'>
                {favorito 
                ? <AiFillHeart size={25} color='red' onClick={favoritar}/>
                : <AiOutlineHeart size={25} onClick={favoritar}/>}
            </div>
        </div>
    </div>)
}
export default Card;