//src/componentes/Rodape/index.js

import './Rodape.css'

const Rodape = () => {
    return (<footer className="footer">
        <section>
            <ul>
                <li>
                    <a href="facebook.com" target="_blank">
                        <img src="/imagens/fb.png" alt="" />
                    </a>
                </li>
                <li>
                    <a href="twitter.com" target="_blank">
                        <img src="/imagens/tw.png" alt="" />
                    </a>
                </li>
                <li>
                    <a href="instagram.com" target="_blank">
                        <img src="/imagens/ig.png" alt="" />
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