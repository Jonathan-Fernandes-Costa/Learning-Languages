import { useState } from 'react';
import Formulario from './componentes/Formulario';
import Membros from './componentes/Membros';
import Rodape from './componentes/Rodape';
import Header from './componentes/Header';
import { v4 as uuidv4 } from 'uuid';

function App() {
  const [times, setTimes] = useState([
    {
      id: uuidv4(),
      nome: 'Família',
      cor: '#D9F7E9'
    },
    {
      id: uuidv4(),
      nome: 'Primos',
      cor: '#E8F8FF'
    },
    {
      id: uuidv4(),
      nome: 'Tios',
      cor: '#F0F8E2'
    },
    {
      id: uuidv4(),
      nome: 'Amigos',
      cor: '#FFF5D9'
    },
    {
      id: uuidv4(),
      nome: 'Amigos Corporativos',
      cor: '#FFEEDF'
    },
    {
      id: uuidv4(),
      nome: 'Outros',
      cor: '#FDE7E8'
    }
  ])

  const [membros, setMembro] = useState([])


  const newMembro = (membro) => {
    //debugger => serve para parar o fluxo do código, muito útil para concertar bugs
    setMembro([...membros, {...membro, id: uuidv4()}])
  }
  const deletarMembro = (prop) => {
    setMembro(membros.filter(membro => membro.id !== prop))
  }
  const mudarCorDoTime = (cor, id) => {
    setTimes(times.map(time => {
      if (time.id === id) {
        time.cor = cor;
      }
      return time
    }))
  }
  const newTime = (Novotime) => {//criando a função que recebe um objeto time que possue cor e nome e adiciona a lista de times
    setTimes([...times, { ...Novotime, id: uuidv4() }])
  }
  const favoritar = (id) => {
    setMembro(membros.map(membro => {
      if (membro.id === id) {
        membro.favorito = !membro.favorito
      }
      return membro
    }
    ))
  }

  return (
    <div className="App">

      <Header />
      <Formulario
        cadastrarTime={newTime}
        times={times.map(time => time.nome)}
        aoMembroCadastrada={membro =>
          newMembro(membro)}
      />
      <section className='times'>
        {times.map((time, indice) =>
          <Membros
            key={indice}
            id={time.id}
            nome={time.nome}
            cor={time.cor}
            membros={membros.filter(membro => membro.afinidade === time.nome)}
            aoDeletar={deletarMembro}
            mudarCor={mudarCorDoTime}
            aoFavoritar={favoritar}
          />)}
      </section>
      <Rodape />
    </div>
  );
}

export default App;
