import Card from '../Card'
import './Membros.css'
import hexToRgba from 'hex-to-rgba';
const Membros = (props) =>{
    const cssCorP = {borderColor: props.cor}
    const cssCorS = {backgroundColor: hexToRgba(props.cor, 0.4)}
    return(
        (props.membros.length > 0) ? <section className='membros' style={cssCorS}>
            <input value={props.cor} type='color' onChange={evento => props.mudarCor(evento.target.value, props.id)} className='input-cor'/>
            <h3 style={cssCorP}>{props.nome}</h3>
            <div className='cadamembro'>
            {props.membros.map((membro, indice) => {
                return (<Card 
                            corDeFundo={props.cor} 
                            id={membro.id} 
                            key={indice} 
                            nome={membro.nome} 
                            foto={membro.imageUrl} 
                            desc={membro.desc} 
                            afinidade={membro.afinidade} 
                            aoDeletar={props.aoDeletar}
                            favorito={membro.favorito}
                            aoFavoritar={props.aoFavoritar}
                        />)
            })}
            </div>
            
        </section>
        :''//caso não tenha membros, não ira ser mostrado nada
    )
}
export default Membros;
