import { useState } from 'react';
import Banner from './componentes/Banner';
import Formulario from './componentes/Formulario';
import Membros from './componentes/Membros';
import Rodape from './componentes/Rodape';


function App() {
  const times = [
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
  ]
  const [membros, setMembro] = useState([])

  const newMembro = (membro) => {
    //debugger => serve para parar o fluxo do código, muito útil para concertar bugs
    setMembro([...membros, membro])
  }

  return (
    <div className="App">
     
      <Banner />
      <Formulario times={times.map(time => time.nome)} aoMembroCadastrada={membro => newMembro(membro)} />
      {times.map(time => <Membros
        key={time.nome}
        nome={time.nome}
        corP={time.corP}
        corS={time.corS}
        membros={membros.filter(m => m.parentesco === time.nome)}
      />)}

      <Rodape/>
    </div>
  );
}

export default App;
