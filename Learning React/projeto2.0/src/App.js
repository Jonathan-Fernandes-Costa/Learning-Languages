import { useState } from 'react';
import Formulario from './componentes/Formulario';
import Membros from './componentes/Membros';
import Rodape from './componentes/Rodape';
import Header from './componentes/Header';
import { v4 as uuidv4 } from 'uuid';
import inicial from './mysocialcicle'
import Botao from './componentes/Botão';
function App() {
  const [afinidade, setAfinidade] = useState([
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
      nome: 'Amigos de Trabalho',
      cor: '#FFEEDF'
    },
    {
      id: uuidv4(),
      nome: 'Outros',
      cor: '#FDE7E8'
    }
  ])
  
  const [membros, setMembro] = useState(inicial)


  const newMembro = (membro) => {
    //debugger => serve para parar o fluxo do código, muito útil para concertar bugs
    setMembro([...membros, {...membro, id: uuidv4()}])
  }
  const deletarMembro = (prop) => {
    setMembro(membros.filter(membro => membro.id !== prop))
  }
  const mudarCorAfinidade = (cor, id) => {
    setAfinidade(afinidade.map(afinidade => {
      if (afinidade.id === id) {
        afinidade.cor = cor;
      }
      return afinidade
    }))
  }
  const newAfinidade = (Novoafinidade) => {//criando a função que recebe um objeto afinidade que possue cor e nome e adiciona a lista de afinidade
    setAfinidade([...afinidade, { ...Novoafinidade, id: uuidv4() }])
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
  const apagarMembrosIniciais = () =>{
    setMembro(membros.filter(membro => membro.id === 3))
  }

  return (
    <div className="App">

      <Header />
      <Botao apagar={apagarMembrosIniciais} tipo="topo" texto="Iniciar Criação/Apagar Membros"/>
      <Formulario
        cadastrarAfinidade={newAfinidade}
        afinidades={afinidade.map(afinidade => afinidade.nome)}
        aoMembroCadastrada={membro =>
          newMembro(membro)}
      />
      <section className='afinidade'>
        {afinidade.map((afinidade, indice) =>
          <Membros
            key={indice}
            id={afinidade.id}
            nome={afinidade.nome}
            cor={afinidade.cor}
            membros={membros.filter(membro => membro.afinidade === afinidade.nome)}
            aoDeletar={deletarMembro}
            mudarCor={mudarCorAfinidade}
            aoFavoritar={favoritar}
          />)}
      </section>
      <Rodape />
    </div>
  );
}

export default App;