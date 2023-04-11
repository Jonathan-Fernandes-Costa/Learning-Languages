import Card from '../Card'
import './Membros.css'
import hexToRgba from 'hex-to-rgba';
const Membros = (props) =>{
    const cssCorP = {borderColor: props.cor}
    const cssCorS = {backgroundColor: hexToRgba(props.cor, 0.6)}
    return(
        (props.membros.length > 0) ? <section className='membros' style={cssCorS}>
            <input value={props.cor} type='color' onChange={evento => props.mudarCor(evento.target.value, props.nome)} className='input-cor'/>
            <h3 style={cssCorP}>{props.nome}</h3>
            <div className='cadamembro'>
            {props.membros.map(membro => {
                return <Card corDeFundo={props.cor} key={membro.nome} nome={membro.nome} foto={membro.foto} local={membro.local} parentesco={membro.parentesco} aoDeletar={props.aoDeletar}/>
            })}
            </div>
            
        </section>
        :''//caso não tenha membros, não ira ser mostrado nada
    )
}
export default Membros;
