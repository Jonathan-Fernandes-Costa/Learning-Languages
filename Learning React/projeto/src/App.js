import Banner from './componentes/Banner';
import CampoTexto from './componentes/CampoTexto';

function App() {
  return (
    <div className="App">
      <Banner/>
      <CampoTexto label="Nome" placeholder="Digite seu nome"/>
      <CampoTexto label="Parentesco" placeholder="Digite oque você é de Jonathan"/>
      <CampoTexto label="Foto" placeholder="Digite o endereço da imagem"/>
    </div>
  );
}

export default App;
