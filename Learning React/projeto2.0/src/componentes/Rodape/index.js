//src/componentes/Rodape/index.js
import { AiFillGithub, AiFillLinkedin, AiFillInstagram } from 'react-icons/ai'
import './Rodape.css'
import { useState } from 'react';
const Rodape = () => {
    const [isHoveredButton1, setIsHoveredButton1] = useState(false);
    const [isHoveredButton2, setIsHoveredButton2] = useState(false);
    const [isHoveredButton3, setIsHoveredButton3] = useState(false);
    return (<footer className="footer">
        <section>
            <ul>
                <li>
                    <a href="https://github.com/Jonathan-Fernandes-Costa" target="_blank" rel="noopener noreferrer">
                        <AiFillGithub 
                            style={{ color: isHoveredButton1 ? '#95ffd4' : 'white'}}
                            onMouseEnter={() => setIsHoveredButton1(true)}
                            onMouseLeave={() => setIsHoveredButton1(false)}
                            size={isHoveredButton1 ? 45 : 35} />
                    </a>
                </li>
                <li>
                    <a href="https://www.linkedin.com/in/jonathan-fernandes-81706b259/" target="_blank" rel="noopener noreferrer">
                        <AiFillLinkedin style={{ color: isHoveredButton2 ? '#95ffd4' : 'white' }}
                            onMouseEnter={() => setIsHoveredButton2(true)}
                            onMouseLeave={() => setIsHoveredButton2(false)}
                            size={isHoveredButton2 ? 45 : 35} />
                    </a>
                </li>
                <li>
                    <a href="https://www.instagram.com/jonathann.fernandes/" target="_blank" rel="noopener noreferrer">
                        <AiFillInstagram style={{ color: isHoveredButton3 ? '#95ffd4' : 'white' }}
                            onMouseEnter={() => setIsHoveredButton3(true)}
                            onMouseLeave={() => setIsHoveredButton3(false)}
                            size={isHoveredButton3 ? 45 : 35} />
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