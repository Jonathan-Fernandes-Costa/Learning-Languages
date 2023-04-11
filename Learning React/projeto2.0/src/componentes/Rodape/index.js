//src/componentes/Rodape/index.js
import {AiFillGithub, AiFillLinkedin, AiFillInstagram} from 'react-icons/ai'
import './Rodape.css'

const Rodape = () => {
    return (<footer className="footer">
        <section>
            <ul>
                <li>
                    <a href="https://github.com/Jonathan-Fernandes-Costa" target="_blank" rel="noopener noreferrer">
                       <AiFillGithub size={35} color='white'/>
                    </a>
                </li>
                <li>
                    <a href="https://www.linkedin.com/in/jonathan-fernandes-81706b259/" target="_blank" rel="noopener noreferrer">
                       <AiFillLinkedin size={35} color='white'/>
                    </a>
                </li>
                <li>
                    <a href="https://www.instagram.com/jonathann.fernandes/" target="_blank" rel="noopener noreferrer">
                        <AiFillInstagram size={35} color='white'/>
                    </a>
                </li>
            </ul>
        </section>
        <section>
            <h1 className='logo'>My social cycle</h1>
        </section>
        <section>
            <p>
                Desenvolvido por Jonathan Fernandes
            </p>
        </section>
    </footer>)
}

export default Rodape
//Meu ROdape
/*import './Rodape.css'

const Rodape = () =>{
    return(
        <footer>
        <div className='redes'>
            <img src='/imagens/fb.png' alt='facebook'></img>
            <img src= "/imagens/tw.png" alt='twitter'/>
            <img src= "/imagens/ig.png" alt='Instagram'/>
        </div>
        <div className='logo'>
         <img src= "/imagens/logo.png" alt='twitter'/>
        </div>
        <div className='credito'>
            <h4>Desenvolvido por Jonick</h4>
        </div>
        </footer>
    )
}
export default Rodape
*/