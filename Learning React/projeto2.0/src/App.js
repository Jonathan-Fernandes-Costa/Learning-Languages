import { useState } from 'react';
import Formulario from './componentes/Formulario';
import Membros from './componentes/Membros';
import Rodape from './componentes/Rodape';
import Header from './componentes/Header';


function App() {
  const [times, setTimes] = useState([
    {
      nome: 'Família',
      corP: '#57C278',
      corS: '#D9F7E9'
    },
    {
      nome: 'Primos',
      corP: '#82CFFA',
      corS: '#E8F8FF'
    },
    {
      nome: 'Tios',
      corP: '#A6D157',
      corS: '#F0F8E2'
    },
    {
      nome: 'Amigos',
      corP: '#FFBA05',
      corS: '#FFF5D9'
    },
    {
      nome: 'Amigos da Faculdade',
      corP: '#FF8A29',
      corS: '#FFEEDF'
    },
    {
      nome: 'Outros',
      corP: '#E06B69',
      corS: '#FDE7E8'
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
        time.corS = cor;
      }
      return time
    }))
  }


  return (
    <div className="App">

      <Header />
      <Formulario times={times.map(time => time.nome)} aoMembroCadastrada={membro => newMembro(membro)} />
      <section className='times'>
        {times.map(time => <Membros
          key={time.nome}
          nome={time.nome}
          corP={time.corP}
          corS={time.corS}
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
