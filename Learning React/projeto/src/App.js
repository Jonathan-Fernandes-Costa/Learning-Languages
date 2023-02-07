import { useState } from 'react';
import Banner from './componentes/Banner';
import Formulario from './componentes/Formulario';


function App() {

  const [membros, setMembro] = useState([])

  const newMembro = (membro) =>{
    console.log(membro)
    setMembro([...membros], membro)
  }
  return (
    <div className="App">
      <Banner/>
      <Formulario aoMembroCadastrada={membro => newMembro(membro)}/>
    </div>
  );
}

export default App;
