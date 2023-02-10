import Card from '../Card'
import './Membros.css'

const Membros = (props) =>{
    const cssCorP = {backgroundColor: props.corS}
    const cssCorS = {borderColor: props.corP}
    return(
        (props.membros.length > 0) ? <section className='membros' style={cssCorP}>
            <h3 style={cssCorS}>{props.nome}</h3>
            <div className='membro'>
            {props.membros.map(membro => <Card nome={membro.nome} foto={membro.foto} local={membro.local} parentesco={membro.parentesco}/>)}
            </div>
            
        </section>
        :''
    )
}
export default Membros;