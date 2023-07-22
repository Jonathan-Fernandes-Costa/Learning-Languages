import './CampoFile.css'
import { AiFillFileImage } from 'react-icons/ai'
const CampoFile = ({ obrigatorio, label, valor, aoAlterado }) => {

    return (
        <div className='campo-file'>
             <label>{label+": "}</label>
            <label for="imagem" class="custom-file-upload">
                <AiFillFileImage
                    size={35}
                />
            </label>
            <input type="file" name="imagem" id="imagem" onChange={aoAlterado} />
            {valor && <img src={valor} alt="Imagem selecionada" width={300} />}
        </div>
    );
}
export default CampoFile

/*
<label for="imagem" class="custom-file-upload">
<i class="fas fa-cloud-upload-alt"></i> Escolha uma imagem
</label>
<input type="file" name="imagem" id="imagem">
<input type="submit" value="Enviar Imagem">*/