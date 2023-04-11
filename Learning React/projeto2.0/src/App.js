import { useState } from 'react';
import Formulario from './componentes/Formulario';
import Membros from './componentes/Membros';
import Rodape from './componentes/Rodape';
import Header from './componentes/Header';


function App() {
  const [times, setTimes] = useState([
    {
      nome: 'Família',
      cor: '#D9F7E9'
    },
    {
      nome: 'Primos',
      cor: '#E8F8FF'
    },
    {
      nome: 'Tios',
      cor: '#F0F8E2'
    },
    {
      nome: 'Amigos',
      cor: '#FFF5D9'
    },
    {
      nome: 'Amigos da Faculdade',
      cor: '#FFEEDF'
    },
    {
      nome: 'Outros',
      cor: '#FDE7E8'
    }
  ])

  const [membros, setMembro] = useState([])


  const newMembro = (membro) => {
    //debugger => serve para parar o fluxo do código, muito útil para concertar bugs
    setMembro([...membros, membro])
  }

  const deletarMembro = () => {
    console.log('Deletando')
  }

  const mudarCorDoTime = (cor, nome) => {
    setTimes(times.map(time => {
      if (time.nome === nome) {
        time.cor = cor;
      }
      return time
    }))
  }


  return (
    <div className="App">

      <Header />
      <Formulario times={times.map(time => time.nome)} aoMembroCadastrada={membro => newMembro(membro)} />
      <section className='times'>
        {times.map(time => 
          <Membros
          key={time.nome}
          nome={time.nome}
          cor={time.cor}
          membros={membros.filter(m => m.parentesco === time.nome)}
          aoDeletar={deletarMembro}
          mudarCor={mudarCorDoTime}
        />)}
      </section>
      <Rodape />
    </div>
  );
}

export default App;
