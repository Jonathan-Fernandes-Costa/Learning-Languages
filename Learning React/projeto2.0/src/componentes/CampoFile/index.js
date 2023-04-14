import './CampoFile.css'
const CampoFile = ({ obrigatorio, label, valor, aoAlterado }) => {

    return (
        <div>
            <label htmlFor="image-upload">Selecionar imagem:</label>
            <input type="file" id="image-upload" onChange={aoAlterado} />
            {valor && <img src={valor} alt="Imagem selecionada" />}
        </div>
    );
}
export default CampoFile