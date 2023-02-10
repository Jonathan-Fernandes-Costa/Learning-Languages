import { useState } from 'react';
import Banner from './componentes/Banner';
import Formulario from './componentes/Formulario';
import Membros from './componentes/Membros';


function App() {
  const membrosinfos = [
    {
      nome: 'Família',
      corP: '#57C278',
      corS: '#D9F7E9',
    },
    {
      nome: 'Primos',
      corP: '#82CFFA',
      corS: '#E8F8FF',
    },
    {
      nome: 'Tios',
      corP: '#A6D157',
      corS: '#F0F8E2',
    },
    {
      nome: 'Amigos',
      corP: '#FFBA05',
      corS: '#FFF5D9',
    },
    {
      nome: 'Amigos da Faculdade',
      corP: '#FF8A29',
      corS: '#FFEEDF',
    },
    {
      nome: 'Outros',
      corP: '#E06B69',
      corS: '#FDE7E8',
    }
  ]
  const [membros, setMembro] = useState([])

  const newMembro = (membro) => {
    console.log(membro)
    setMembro([...membros, membro])
  }

  return (
    <div className="App">
      <Banner />
      <Formulario parentesco={membrosinfos.map(parente => parente.nome)} aoMembroCadastrada={membro => newMembro(membro)} />
      {membrosinfos.map(membroinfo => <Membros
        key={membroinfo.nome}
        nome={membroinfo.nome}
        corP={membroinfo.corP}
        corS={membroinfo.corS}
        membros={membros.filter(m => m.parentesco === membroinfo.nome)}
      />)}

    </div>
  );
}

export default App;
